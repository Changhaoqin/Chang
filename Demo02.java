package edu.xcdq.demo02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

/**
 * @author 常皓钦
 * @date 2021/5/18 18:12
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("e:/1.txt");
        FileWriter fileWriter = new FileWriter("e:/111.txt");
        char[] buff = new char[1024];
        int len = 0;
        while ((len = reader.read(buff)) != -1) {
            fileWriter.write(buff, 0, len);
        }
        fileWriter.flush();

        //关闭资源
        reader.close();
        fileWriter.close();


    }
}
