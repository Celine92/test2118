package chapter3.dbtools;

/**
 * Created by CELINE on 2018-08-30.
 */
public class Run {
    public static void main(String[] args) {
        dbTool dbTool=new dbTool();
        for (int i=0;i<20;i++){
             BackA output=new BackA(dbTool);
             output.start();
             BackB input =new BackB(dbTool);
             input.start();
        }
    }
}
