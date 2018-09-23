package chapter3.pipeInputOutput;


import java.io.PipedOutputStream;

/**
 * Created by CELINE on 2018-05-03.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    public ThreadWrite(WriteData write, PipedOutputStream out){
        super();
        this.write=write;
        this.out=out;
    }
    @Override
    public void run() {
        write.writeMethod(out);
    }
}
