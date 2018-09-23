package chapter3.pipeInputOutput;


import java.io.PipedInputStream;

/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream input;
    public ThreadRead(ReadData readData,PipedInputStream input){
        super();
        this.readData=readData;
        this.input=input;
    }
    @Override
    public void run(){
        readData.readMethod(input);
    }
}
