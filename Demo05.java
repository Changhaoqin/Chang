package edu.xcdq.demo05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 常皓钦
 * @date 2021/5/20 上午 8:59
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.properties"));
        pro.load(bis);
        bis.close();

        Set<Map.Entry<Object, Object>> entries = pro.entrySet();
        for (Map.Entry<Object, Object> e : entries) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }


    }
}
