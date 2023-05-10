package com.niit.timer;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Date;

public class TimerTest implements ActionListener{
    public static void main(String[] args) {
//        ActionListener listener = event ->
//                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));;
        //定时器构造器，每经过1000毫秒通知监听器listener一次
        var timer = new Timer(1000,event -> System.out.println("The time is "+new Date()));
        //启动定时器，一旦启动，定时器将调用监听器listener的actionperfomed
        timer.start();
        JOptionPane.showMessageDialog(null,"quit progrmmer?");
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
//class TimerPrinter implements ActionListener {
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("At the tone, the time is "
//        + Instant.ofEpochMilli(e.getWhen()));
//        //获取默认的工具箱，工具箱包含有关GUI环境的信息
//        //beep()发出一声铃响
//        Toolkit.getDefaultToolkit().beep();
//    }
//}