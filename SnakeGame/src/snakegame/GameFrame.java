/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import javax.swing.JFrame;
/**
 *
 * @author MBSCo
 */
public class GameFrame extends JFrame {
    GameFrame(){
          
          this.add(new GamePanel());
          this.setTitle("Snake");
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setResizable(false);
          this.pack();
          this.setVisible(true);
          this.setLocationRelativeTo(null);
          
    }
}