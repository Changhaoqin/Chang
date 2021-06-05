package edu.xcdq.demo07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 常皓钦
 * @date 2021/5/20 上午 10:33
 */
public class dmoe07 {
    public static void main(String[] args) throws FileNotFoundException {
        String info[] ={"欢迎","来到","喵星人","的星球","!!"};
        File file = new File("e:"+File.separator+"testfilechannel.txt");

        try(FileOutputStream outpit=new FileOutputStream(file)) {
            FileChannel fout = outpit.getChannel();

            ByteBuffer buf=ByteBuffer.allocate(1024);
            for (int i=0;i<info.length;i++){
                //字符串变为字节数组放进缓冲区之中
                buf.put(info[i].getBytes());
            }
            buf.flip();

            //输出缓冲区的内容
            fout.write(buf);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

