package chapter3.dbtools;

/**
 * Created by CELINE on 2018-08-30.
 */
public class BackA extends Thread {
    private dbTool dbTool;

    public BackA (dbTool dbTools){
        super();
        this.dbTool=dbTools;
    }

    @Override
    public void run(){
        dbTool.insertA();
    }
}
