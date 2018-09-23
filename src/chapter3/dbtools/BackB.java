package chapter3.dbtools;

/**
 * Created by CELINE on 2018-08-30.
 */
public class BackB extends Thread {
    private dbTool dbTool;

    public BackB(dbTool dbTools){
        super();
        this.dbTool=dbTools;
    }

    @Override
    public void run(){
        dbTool.insertB();
    }
}
