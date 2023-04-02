/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictoegame2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class UserPanel implements ActionListener
{
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1,jt2 ;
    JButton jb;
    UserPanel()
    {
        jf = new JFrame("TicTacToeGame By Vivek patyal");
        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        //player 1
        jl1=new JLabel("Enter Player One: (X)");
        jl1.setBounds(50, 80, 120, 30);
        jf.add(jl1);
        
        jt1 = new JTextField();
        jt1.setBounds(200, 80, 250, 40);
        jf.add(jt1);
        
        //player 2
        
        jl2=new JLabel("Enter Player Two: (0)");
        jl2.setBounds(50, 150, 250, 40);
        jf.add(jl2);
        
        jt2 = new JTextField();
        jt2.setBounds(200, 150, 250, 40);
        jf.add(jt2);
        
        //Button
        
        jb= new JButton("Start");
        jb.setBounds(240, 240, 90, 35);
        jf.add(jb);
        jb.addActionListener(this);
        
        
        
        
        jf.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==jb)
        {
            String palyer1=jt1.getText();
            String palyer2=jt2.getText();
            
           GamePanel gp = new GamePanel(palyer1, palyer2);
           gp.openGamePanel();
           jf.setVisible(false);
            
            
        }
    }
}
