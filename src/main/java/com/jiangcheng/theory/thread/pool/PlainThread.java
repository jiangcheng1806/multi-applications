package com.jiangcheng.theory.thread.pool;

/**
 * 类名称：PlainThread<br>
 * 类描述：<br>
 * 创建时间：2019年04月04日<br>
 *
 * @author jiangcheng
 * @version 1.0.0
 */

public class PlainThread {

    public static void main(String[] args) {

        //最普通的方式创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("dosth");
            }
        }).start();
    }
}
