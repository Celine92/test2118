package chapter3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by CELINE on 2018-05-03.
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try{
            System.out.println("write :");
            for(int i=0;i<300;i++){
                String outData=""+(i+1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
