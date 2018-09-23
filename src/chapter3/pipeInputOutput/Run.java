package chapter3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by CELINE on 2018-05-03.
 */
public class Run {
    public static void main(String[] args) throws IOException {

        try{
            WriteData writeData=new WriteData();
            ReadData readData=new ReadData();
            PipedInputStream inputStream=new PipedInputStream();
            PipedOutputStream outputStream=new PipedOutputStream();
            outputStream.connect(inputStream);
            ThreadRead threadRead=new ThreadRead(readData,inputStream);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
