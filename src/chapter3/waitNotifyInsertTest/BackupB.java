package chapter3.waitNotifyInsertTest;

/**
 * Created by CELINE on 2018-05-03.
 */
public class BackupB extends Thread {
    private DBTools dbTools;
    public BackupB(DBTools dbTools){
        super();
        this.dbTools=dbTools;
    }

    @Override
    public void run(){
        dbTools.backupB();
    }
}
