package com.niit.timer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.Instant;


public class Test1  {
   public void greet(ActionEvent e){
       System.out.println("Hello,The time is"+ Instant.ofEpochMilli(e.getWhen()));
   }
}
class repeatedgreet extends Test1{
    public void greet(ActionEvent e){
        var timer = new Timer(1000,super::greet);
        timer.start();
    }
}
