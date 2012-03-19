package com.shengjie.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Hello world!
 *
 */
public class App 
{
    RandomAccessFile raf = null;
    FileChannel ch = null;
    ByteBuffer bb = null;
    public void test() throws IOException{
        File file = new File("/home/shengjie/work/java-workspace/HelloWorld/test/test.txt");
        raf = new RandomAccessFile(file, "rw");
        ch = raf.getChannel();
        System.out.println(""+ch.size());
        byte[] bytes = new byte[10];
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        ch.write(bb);
        System.out.println(""+ch.size());
    }
    public static void main( String[] args ) throws IOException
    {
        new App().test();
    }
}
