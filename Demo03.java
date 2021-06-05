package edu.xcdq.demo01;

import java.io.*;

/**
 * @author 常皓钦
 * @date 2021/5/18 17:54
 */
public class Demo03 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
         try {
            //1 准备输入输出流
            bis = new BufferedInputStream(new FileInputStream("e:/YoudaoDictSetup.exe"));
            bos = new BufferedOutputStream(new FileOutputStream("e:/有道词典.exe"));
            //2 循环读取操作
            int len = 0;
            byte[] buff = new byte[1024];  //开辟缓冲区
             long start = System.currentTimeMillis();
            while ((len=bis.read(buff))!=-1){
                bos.write(buff,0,len);
            }
            long end = System.currentTimeMillis();
            System.out.println("时间"+(end-start));//58ms

            //3 关闭资源
            bis.close();
            bos.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
