/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dcit23_group_finalproject;
import java.awt.*;
import java.awt.event.*;

class DCIT23_GROUP_FINALPROJECT extends Frame
{
    TextField t2;
    
    
    
    //constructor for TestConverter class
    DCIT23_GROUP_FINALPROJECT()
    {
        
        setLayout(null);
        
        //GUI Logic
        
        //Input
        Label l1=new Label(" Input");
        add(l1);
        l1.setBounds(275,50,36,20);
        l1.setBackground(Color.decode("#36454F")); 
        l1.setForeground(Color.decode("#FFFFFF"));
        TextField t1=new TextField(15);
        add(t1);
        t1.setBounds(235,80,120,30);
        
        //Buttons For Temperature Converter
        Label l2=new Label(" Temperature Converter");
        add(l2);
        l2.setBounds(228,130,137,30);
        l2.setBackground(Color.decode("#36454F"));
        l2.setForeground(Color.decode("#FFFFFF"));
        
        Button b1=new Button("Celsius To Fahrenheit");
        add(b1);
        b1.setBounds(20,180,130,40);
        b1.setBackground(Color.decode("#36454F"));
        b1.setForeground(Color.decode("#FFFFFF"));
        
        Button b2=new Button("Fahrenheit To Celsius");
        add(b2);
        b2.setBounds(160,180,130,40);
        b2.setBackground(Color.decode("#36454F"));
        b2.setForeground(Color.decode("#FFFFFF"));
        
        Button b3=new Button("Fahrenheit To Kelvin");
        add(b3);
        b3.setBounds(300,180,130,40);
        b3.setBackground(Color.decode("#36454F"));
        b3.setForeground(Color.decode("#FFFFFF"));
        
        Button b4=new Button("Kelvin To Fahrenheit");
        add(b4);
        b4.setBounds(440,180,130,40);
        b4.setBackground(Color.decode("#36454F"));
        b4.setForeground(Color.decode("#FFFFFF"));
        
        //Buttons For Distance Converter
        Label l3=new Label(" Distance Converter");
        add(l3);
        l3.setBounds(240,250,115,30);
        l3.setBackground(Color.decode("#36454F"));
        l3.setForeground(Color.decode("#FFFFFF"));
        
        Button b5=new Button("Kilometre To Metre");
        add(b5);
        b5.setBounds(20,300,130,40);
        b5.setBackground(Color.decode("#36454F"));
        b5.setForeground(Color.decode("#FFFFFF"));
        
        Button b6=new Button("Metre To Kilometre");
        add(b6);
        b6.setBounds(160,300,130,40);
        b6.setBackground(Color.decode("#36454F"));
        b6.setForeground(Color.decode("#FFFFFF"));
        
        Button b7=new Button("Metre To Centimetre");
        add(b7);
        b7.setBounds(300,300,130,40);
        b7.setBackground(Color.decode("#36454F"));
        b7.setForeground(Color.decode("#FFFFFF"));
        
        Button b8=new Button("Centimetre To Metre");
        add(b8);
        b8.setBounds(440,300,130,40);
        b8.setBackground(Color.decode("#36454F"));
        b8.setForeground(Color.decode("#FFFFFF"));
        
        //CelToFah Event Handling Code
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=(num1*9/5)+32;
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
        
        //FahToCel Event Handling Code
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=(num1-32)*5/9;
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
        
        //FahToKelv Event Handling Code
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=(int) ((num1-32)*5/9+273.15);
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
        
        //KelvToFah Event Handling Code
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=(int) ((num1-273.15)*9/5+32);
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
        
        //kmTom Event Handling Code
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=num1*1000;
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
        
        //mTokm Event Handling Code 
         b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=num1/1000;
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
         
         //mTocm Event Handling Code 
         b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=num1*100;
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
        
         //cmTom Event Handling Code 
         b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String n1=t1.getText();  //fetch t1 text
                
                int num1=Integer.parseInt(n1);  //n1 will be converted to number
                
                int result1=0;
                
                result1=num1/100;
                
                String ans=String.valueOf(result1);
                
                t2.setText(ans);
            }
        });
         
        //Result
        Label l4=new Label(" Result");
        add(l4);
        l4.setBounds(190,390,50,20);
        l4.setBackground(Color.decode("#36454F"));
        l4.setForeground(Color.decode("#FFFFFF"));
        t2=new TextField(15);
        add(t2);
        t2.setBounds(245,385,120,30);
        
        //Last Names Of Group Members
        Label l5=new Label("    BORDARAYS,     MASANGKAY,     NIGOZA,     RODRIGUEZ,     LISING");
        add(l5);
        l5.setBounds(107,445,400,20);
        l5.setBackground(Color.decode("#708090"));
        l5.setForeground(Color.decode("#FFFFFF"));
        
    //Close Frame
        addWindowListener(new WindowAdapter(){
            
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }        
        });

        //Control Frame
        setVisible(true);
        setSize(600,500);
        setTitle("UNIT OF MEASUREMENT CONVERTER");
        setResizable(false);
        setBackground(Color.decode("#708090"));
    }
    
    //main method 
    public static void main(String[] args) 
    {
        //object of DCIT_Final_Group_Project class
        DCIT23_GROUP_FINALPROJECT m = new DCIT23_GROUP_FINALPROJECT();
    }
}

