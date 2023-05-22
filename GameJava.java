/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game.java;

/**
 *
 * @author komal
 */
import javax.swing.JFrame;
public class GameJava {

    public static void main(String[] args) {
       JFrame obj=new JFrame();  //frame
       GamePlay gameplay =new GamePlay();  //panel
       obj.setBounds(10, 10, 700, 600);
       obj.setTitle("Brick Breaker");
       obj.setResizable(false);
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gameplay); // adding panel to jrame
    }
}
