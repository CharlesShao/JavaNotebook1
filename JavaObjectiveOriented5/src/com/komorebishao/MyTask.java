package com.komorebishao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//Timer调用线程调度的类 TimerTask供我们书写线程中操作的类 定时操作
public class MyTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(new Date()));
    }

    public static void main(String[] args) {
        Timer t1 = new Timer();
        MyTask myTask = new MyTask();
        //第二个参数 单位为毫秒 1000毫秒为1秒
//		t1.schedule(myTask, 10000);
        //1秒后执行线程中内容 每两秒重复执行
        t1.schedule(myTask, 1000,2000);
    }
}
