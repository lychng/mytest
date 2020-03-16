package com.msr.system.utils;



import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *  通过客户端ip获取客户端Mac地址工具类
 * @author  Liyanchong
 */
public class IPUtils {
    /**
     *   获取客户端IP 地址
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ipAddress = null;
        try {
            ipAddress = request.getHeader("x-forwarded-for");
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("Proxy-Client-IP");
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getRemoteAddr();
                if (ipAddress.equals("127.0.0.1")) {
                    // 根据网卡取本机配置的IP
                    InetAddress inet = null;
                    try {
                        inet = InetAddress.getLocalHost();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    ipAddress = inet.getHostAddress();
                }
            }
            // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
            if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
                // = 15
                if (ipAddress.indexOf(",") > 0) {
                    ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
                }
            }
        } catch (Exception e) {
            ipAddress="";
        }
        // ipAddress = this.getRequest().getRemoteAddr();

        return ipAddress;
    }




    /**
     * 根据IP地址获取MAC地址
     */

    public static String getMACAddress(String ip) {
        NetworkInterface ne= null;
        try {
            ne = NetworkInterface.getByInetAddress(InetAddress.getByName(ip));
            byte[]mac=ne.getHardwareAddress();
            StringBuffer sb = new StringBuffer("");
            for(int i=0; i<mac.length; i++) {
                if(i!=0) {
                    sb.append("-");
                }
                //字节转换为整数
                int temp = mac[i]&0xff;
                String str = Integer.toHexString(temp);
                System.out.println("每8位:"+str);
                if(str.length()==1) {
                    sb.append("0"+str);
                }else {
                    sb.append(str);
                }
            }
            return sb.toString().toUpperCase();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "error!";

    }


}
