/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictoegame2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GamePanel implements ActionListener
{
    JFrame jf;
        JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
        int count=0;
        String str;
        boolean wins = false;
        Color color1;
        
        String player1,player2;
        String player;
        
    GamePanel(String player1, String player2)
    {
        this.player1 = player1;
        this.player2 = player2;        
    }
    
    void openGamePanel()
    {
        jf = new JFrame();
        jf.setTitle(player1+" turns");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3,3));
        
        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
         jb2 = new JButton();
         jb2.addActionListener(this);
        jf.add(jb2);
        
         jb3 = new JButton();
         jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
        
    }
   

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count = count+1;
        if(count%2==0)
        {
            
            str="0";
            color1=Color.red;
            jf.setTitle(player1+" turns");
            
        }
        else{
            color1=Color.black;
            str="X";
            jf.setTitle(player2+" turns");
        }
        
        if(e.getSource()==jb1)
        {
            jb1.setBackground(color1);
            jb1.setFont(new Font("Arial", 1, 80));
            jb1.setText(str); 
            jb1.setEnabled(false);
        }
        if(e.getSource()==jb2)
        {
            jb2.setBackground(color1);
            jb2.setFont(new Font("Arial",1,80));
            jb2.setText(str);
            jb2.setEnabled(false);
        }
        if(e.getSource()==jb3)
        {
            jb3.setBackground(color1);
            jb3.setFont(new Font("Arial",1,80));
            jb3.setText(str);
            jb3.setEnabled(false);
        }
        if(e.getSource()==jb4)
        {
            jb4.setBackground(color1);
            jb4.setFont(new Font("Arial",1,80));
            jb4.setText(str);
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5)
        {
            jb5.setBackground(color1);
            jb5.setFont(new Font("Arial",1,80));
            jb5.setText(str);
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6)
        {
            jb6.setBackground(color1);
            jb6.setFont(new Font("Arial",1,80));
            jb6.setText(str);
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7)
        {
            jb7.setBackground(color1);
            jb7.setFont(new Font("Arial",1,80));
            jb7.setText(str);
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8)
        {
            jb8.setBackground(color1);
            jb8.setFont(new Font("Arial",1,80));
            jb8.setText(str);
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9)
        {
            jb9.setBackground(color1);
            jb9.setFont(new Font("Arial",1,80));
            jb9.setText(str);
            jb9.setEnabled(false);
        }
        winningPossibilities();
        whoWins();
       
        
    }
    void winningPossibilities()
    {
      
        //Horizontal Winning Possibilities
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb3.getText() != "")
        {
          //System.out.println(str+" wins");
            wins = false;
          
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() != "")
        {
               //System.out.println(str+" wins"); 
               wins = true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() != "")
        {
                wins = true;
        }
         //vertical Winning possibilities
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText() != "")
        {
                 wins = true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() !="")
        {
                wins = true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() != "")
        {
                wins = true;
        }
        //diagonal Winning Possibilities
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() != "")
        {
            wins = true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText() !="")
        {
                wins = true;
        }
        //game draw
        else
        {
             wins = false;   
        }
    }
     void whoWins()
     {
        
        if(wins==true)
        {
             
             if(str.equals("0"))
             {
                  player=player2;
             }
             else
             {
                 player=player1;
             }
             String win_title=player+" ("+str+") "+" wins";
             jf.setTitle(win_title);
            JOptionPane.showMessageDialog(jf,win_title );
            restartGame();
        }
        else if(wins==false && count==10)
        {
            JOptionPane.showMessageDialog(jf, "MAtch draw");
            restartGame();
        }
        else if(wins==false && count==9)
        {
            JOptionPane.showMessageDialog(jf, "MAtch draw");
            restartGame();
        }
        
     }
     void restartGame()
     {
         int i = JOptionPane.showConfirmDialog(jf,"Do you Want to restart the game");
         
         if(i==0)
         {
             jb1.setText("");
             jb2.setText("");
             jb3.setText("");
             jb4.setText("");
             jb5.setText("");
             jb6.setText("");
             jb7.setText("");
             jb8.setText("");
             jb9.setText("");
             
             
             jb1.setBackground(null);
             jb2.setBackground(null);
             jb3.setBackground(null);
             jb4.setBackground(null);
             jb5.setBackground(null);
             jb6.setBackground(null);
             jb7.setBackground(null);
             jb8.setBackground(null);
             jb9.setBackground(null);
             
             btnSetEnabled(true);
             
               // str="";
               
               if(!player.equals(player1))
               {
                   player2=player1;
                   player1=player;
                   count = 1;
               }
               else{
                   count = 0;
               }
            wins = false;
             
        }
         else if(i==1)
         {
             System.exit(0);
         }
         else
         {
             
             btnSetEnabled(false);
         }
         
        
     
     }
      void btnSetEnabled(boolean b)
         {
             jb1.setEnabled(b);
             jb2.setEnabled(b);
             jb3.setEnabled(b);
             jb4.setEnabled(b);
             jb5.setEnabled(b);
             jb6.setEnabled(b);
             jb7.setEnabled(b);
             jb8.setEnabled(b);
             jb9.setEnabled(b);
         }
    
}
