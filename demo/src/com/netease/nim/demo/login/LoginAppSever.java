package com.netease.nim.demo.login;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class LoginAppSever {
    public static int Login( String accid,String token){
        int opNum = 2;
        int isRegSuccess = 0;
        System.out.println("LoginAppSever执行："+accid+"  "+token+"  "+opNum);
        String IP_ADDR = "81.68.250.64";//服务器地址  这里要服务器的ip
        int PORT = 1233;//服务器端口号
        while (true) {
            Socket socket = null;
            try {
                //创建一个流套接字并将其连接到指定主机上的指定端口号
                socket = new Socket(IP_ADDR, PORT);
                System.out.println("连接已经建立");
                //向服务器端发送数据
                Map<String, String> map = new HashMap<String, String>();
                map.put("accid",accid);
                map.put("token",token);
                map.put("opNum",opNum+"");
                //将json转化为String类型
                org.json.JSONObject json = new org.json.JSONObject(map);
                String jsonString = "";
                jsonString = json.toString();
                //将String转化为byte[]
                //byte[] jsonByte = new byte[jsonString.length()+1];
                byte[] jsonByte = jsonString.getBytes();
                DataOutputStream outputStream = null;
                outputStream = new DataOutputStream(socket.getOutputStream());
                System.out.println("发的数据长度为:"+jsonByte.length);
                outputStream.write(jsonByte);
                outputStream.flush();
                System.out.println("传输数据完毕");
                socket.shutdownOutput();

                //读取服务器端数据
                DataInputStream inputStream = null;
                String strInputstream ="";
                inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                strInputstream=inputStream.readUTF();
                System.out.println("输入信息为："+strInputstream);
                org.json.JSONObject js = new org.json.JSONObject(strInputstream);
                System.out.println(js.get("isSuccess"));
                isRegSuccess=Integer.parseInt((String) js.get("isSuccess"));
                // 如接收到 "OK" 则断开连接
                if (js != null) {
                    System.out.println("客户端将关闭连接");
                    Thread.sleep(500);
                    break;
                }

            } catch (Exception e) {
                System.out.println("客户端异常:" + e.getMessage());
                break;
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        socket = null;
                        System.out.println("客户端 finally 异常:" + e.getMessage());
                    }
                }
            }
        }
        return isRegSuccess;
    }
}

