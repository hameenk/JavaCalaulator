import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.processing.RoundEnvironment;
import javax.crypto.spec.RC2ParameterSpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class calculate implements ActionListener{

    Boolean operaterclicked=false;

    String oldvalue;
    String oldvaluesu;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eigthButton;

    JButton nineButton;
    JButton sixbutton;
    JButton fivButton;
    JButton fourButton;
    JButton threeButton;
    JButton twoButton;
    JButton onebutton;
    JButton ADDITION;
    JButton SUBERTION;
    JButton EQUALE;
    JButton DIVITION;
    JButton zerButton;
    JButton zerozerButton;
    JButton dotaButton;
    JButton CLEARBUTTER;
    JButton MULTIPABUTTON;
    JButton MODUEDES;
     



 
    public calculate(){
        jf=new JFrame("ameencalculater");
        jf.setLayout(null);
        jf.setBackground(Color.black);
        jf.setSize(530 ,550);
        jf.getContentPane().setBackground(new Color(240,240,235));
        jf.setLocation(450,130);
        
        
        displayLabel=new JLabel();
        displayLabel.setBounds(30,10,460,110);
        displayLabel.setBackground(new Color(255,255,255));
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setFont(new Font("calidri",Font.BOLD,30));
        displayLabel.setForeground(Color.BLACK);
        jf.add(displayLabel);

        sevenButton=new JButton(" 7 ");
        sevenButton.setForeground(Color.WHITE);
        sevenButton.setBackground(new Color(69,94,69));
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(new Font("calidri",Font.BOLD,30));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eigthButton=new JButton(" 8 ");
        eigthButton.setForeground(Color.WHITE);
        eigthButton.setBackground(new Color(69,94,69));
        eigthButton.setBounds(120,130,80,80);
        eigthButton.setFont(new Font("calidri",Font.BOLD,30));
        eigthButton.addActionListener(this);
        jf.add(eigthButton);

        nineButton=new JButton("9");
        nineButton.setForeground(Color.WHITE);
        nineButton.setBackground(new Color(69,94,69));
        nineButton.setBounds(210,130,80,80);
        nineButton.setFont(new Font("calidri",Font.BOLD,30));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setForeground(Color.WHITE);
        fourButton.setBackground(new Color(69,94,69));
        fourButton.setBounds(30,220,80,80);
        fourButton.setFont(new Font("calidri",Font.BOLD,30));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fivButton=new JButton("5");
        fivButton.setForeground(Color.WHITE);
        fivButton.setBackground(new Color(69,94,69));
        fivButton.setBounds(120,220,80,80);
        fivButton.setFont(new Font("calidri",Font.BOLD,30));
        fivButton.addActionListener(this);
        jf.add(fivButton);

        sixbutton=new JButton("6");
        sixbutton.setForeground(Color.WHITE);
        sixbutton.setBackground(new Color(69,94,69));
        sixbutton.setBounds(210,220,80,80);
        sixbutton.setFont(new Font("calidri",Font.BOLD,30));
        sixbutton.addActionListener(this);
        jf.add(sixbutton);

        MULTIPABUTTON=new JButton("X");
        MULTIPABUTTON.setBounds(410,130,80,80);
        MULTIPABUTTON.setFont(new Font("calidri",Font.BOLD,30));
        MULTIPABUTTON.setBackground(Color.GRAY);
        MULTIPABUTTON.addActionListener(this);
        jf.add(MULTIPABUTTON);

        threeButton=new JButton("3");
        threeButton.setForeground(Color.WHITE);
        threeButton.setBackground(new Color(69,94,69));
        threeButton.setBounds(30,310,80,80);
        threeButton.setFont(new Font("calidri",Font.BOLD,30));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        twoButton=new JButton("2");
        twoButton.setForeground(Color.WHITE);
        twoButton.setBackground(new Color(69,94,69));
        twoButton.setBounds(120,310,80,80);
        twoButton.setFont(new Font("calidri",Font.BOLD,30));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        onebutton=new JButton("1");
        onebutton.setForeground(Color.WHITE);
        onebutton.setBackground(new Color(69,94,69));
        onebutton.setBounds(210,310,80,80);
        onebutton.setFont(new Font("calidri",Font.BOLD,30));
        onebutton.addActionListener(this);
        jf.add(onebutton);

        zerozerButton=new JButton("00");
        zerozerButton.setForeground(Color.WHITE);
        zerozerButton.setBackground(new Color(69,94,69));
        zerozerButton.setBounds(30,400,80,80);
        zerozerButton.setFont(new Font("calidri",Font.BOLD,30));
        zerozerButton.addActionListener(this);
        jf.add(zerozerButton);

        zerButton=new JButton("0");
        zerButton.setForeground(Color.WHITE);
        zerButton.setBackground(new Color(69,94,69));
        zerButton.setBounds(120, 400, 80, 80);
        zerButton.setFont(new Font("calidri",Font.BOLD,30));
        zerButton.addActionListener(this);
        jf.add(zerButton);

        dotaButton=new JButton(".");
        dotaButton.setForeground(Color.WHITE);
        dotaButton.setBackground(new Color(69,94,69));
        dotaButton.setBounds(210, 400, 80, 80);
        dotaButton.setFont(new Font("calidri",Font.BOLD,30));
        dotaButton.addActionListener(this);
        jf.add(dotaButton);

        EQUALE=new JButton("=");
        EQUALE.setBounds(320,400,80,80);
        EQUALE.setFont(new Font("calidri",Font.BOLD,40));
        EQUALE.setBackground(Color.orange);
        EQUALE.setForeground(Color.white);
        EQUALE.addActionListener(this);
        jf.add(EQUALE);

        SUBERTION=new JButton("-");
        SUBERTION.setBounds(320,220,80,80);
        SUBERTION.setFont(new Font("calidri",Font.BOLD,40));
        SUBERTION.setBackground(Color.GRAY);
        SUBERTION.addActionListener(this);
        jf.add(SUBERTION);

        CLEARBUTTER=new JButton("c");
        CLEARBUTTER.setBounds(410,310,80,170);
        CLEARBUTTER.setFont(new Font("calidri",Font.BOLD,40));
        CLEARBUTTER.setBackground(Color.yellow);
        CLEARBUTTER.addActionListener(this);
        jf.add(CLEARBUTTER);

        DIVITION=new JButton("%");
        DIVITION.setBounds(320,130,80,80);
        DIVITION.setFont(new Font("calidri",Font.BOLD,40));
        DIVITION.setBackground(Color.GRAY);
        DIVITION.addActionListener(this);
        jf.add(DIVITION);

        ADDITION=new JButton("+");
        ADDITION.setBounds(320, 310, 80, 80);
        ADDITION.setFont(new Font("calidri",Font.BOLD,40));
        ADDITION.addActionListener(this);
        ADDITION.setBackground(Color.GRAY);
        jf.add(ADDITION);

        MODUEDES=new JButton("/");
        MODUEDES.setBounds(410,220,80,80);
        MODUEDES.setFont(new Font("calidri",Font.BOLD,40));
        MODUEDES.addActionListener(this);
        MODUEDES.setBackground(Color.GRAY);
        jf.add(MODUEDES);

      

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main (String[] args){
        new calculate();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==eigthButton){
            if(operaterclicked){
                displayLabel.setText("8");
                operaterclicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
            
        }else if(e.getSource()==sevenButton){
            if(operaterclicked){
                displayLabel.setText("7");
                operaterclicked=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"7");
            }

        }else if(e.getSource()==nineButton){
            if(operaterclicked){
                displayLabel.setText("9");
                operaterclicked=false;
            }else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
            
        }else if(e.getSource()==sixbutton){
            if(operaterclicked){
                displayLabel.setText("6");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"6");
            }
            
        }else if(e.getSource()==fivButton){
            if(operaterclicked){
                displayLabel.setText("5");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"5");
            }

        }else if(e.getSource()==fourButton){
            if(operaterclicked){
                displayLabel.setText("4");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"4");
            }
            
        }else if(e.getSource()==threeButton){
            if(operaterclicked){
                displayLabel.setText("3");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"3");
            }
            
        }else if(e.getSource()==twoButton){
            if(operaterclicked){
                displayLabel.setText("2");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"2");
            }
            
        }else if(e.getSource()==onebutton){
            if(operaterclicked){
                displayLabel.setText("1");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"1");
            }
            
        }else if(e.getSource()==zerButton){
            if(operaterclicked){
                displayLabel.setText("0");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"0");
            }
            
        }else if(e.getSource()==zerozerButton){
            if(operaterclicked){
                displayLabel.setText("00");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+"00");
            }
            
        }else if(e.getSource()==CLEARBUTTER){
            displayLabel.setText("");

        }else if(e.getSource()==dotaButton){
            if(operaterclicked){
                displayLabel.setText(".");
                operaterclicked=false;
            }else{         

               displayLabel.setText(displayLabel.getText()+".");
            }
            
        }else if(e.getSource()==ADDITION){
            operaterclicked=true;
            oldvalue=displayLabel.getText();
            operater=1;
            displayLabel.setText("+");
            
        
        }else if(e.getSource()==SUBERTION){
            operaterclicked=true;
            oldvaluesu=displayLabel.getText();
            operater=2;

        }else if(e.getSource()==DIVITION){
            operaterclicked=true;
            oldvalue=displayLabel.getText();
            operater=4;

        }else if(e.getSource()==MULTIPABUTTON){
            operaterclicked=true;
            oldvalue=displayLabel.getText();
            operater=3;
        }else if(e.getSource()==MODUEDES){
            operaterclicked=true;
            oldvalue=displayLabel.getText();
            operater=5;

        

        }else if(e.getSource()==EQUALE){
            switch (operater) {
                case 1:
                  String newvalue=displayLabel.getText();
    

                  float oldvaluef=Float.parseFloat(oldvalue);
                  float newvaluef=Float.parseFloat(newvalue);
                
    
                  float sum=oldvaluef+newvaluef;
            
    
                  displayLabel.setText(sum+"");
                  break;
                    
                case 2:
                  String newvaluesu=displayLabel.getText();

                  float oldvaluaf=Float.parseFloat(oldvalue);
                  float newvaluaf=Float.parseFloat(newvaluesu);

                  float sub=oldvaluaf-newvaluaf;

                  displayLabel.setText(sub+"");
                  break;
                case 3:
                  String newvaluemu=displayLabel.getText();

                  float oldvaluafmultf=Float.parseFloat(oldvalue);
                  float newvaluafmultf=Float.parseFloat(newvaluemu);

                  float multipeation=oldvaluafmultf*newvaluafmultf;

                  displayLabel.setText(multipeation+"");
                  break;
                case 4:
                  String newvaluedi=displayLabel.getText();

                  float oldvaluafdiv=Float.parseFloat(oldvalue);
                  float newvaluafdiv=Float.parseFloat(newvaluedi);

                  float divition=oldvaluafdiv/newvaluafdiv;


                  displayLabel.setText(divition+" ");
                  break;
                case 5:
                  String newvaluemode=displayLabel.getText();

                  float oldvaluefmod=Float.parseFloat(oldvalue);
                  float newvaluefmod=Float.parseFloat(newvaluemode);

                  float modulares=oldvaluefmod%newvaluefmod;

                  displayLabel.setText(modulares+"");
                break;

                
            }
        }
         
    }
    int operater;
  
}
