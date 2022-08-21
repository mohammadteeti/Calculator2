package Calculator2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;


public class Calculator extends JFrame{
    private JPanel txtPanel ,btnPanel;
    private JButton btnC, btn0,btn1,btn2,btn3,btn4,btn5,btn6
                   ,btn7,btn8,btn9,btnDiv,btnMpy,btnPls
                   ,btnMns,btnPer,btnDel,btnPow,btnLn
                   ,btnRoot,btnDot,btnEqual;
    private JTextField resutl ;
    private GridBagConstraints gc ;

                   
    public Calculator(){
        
        setSize(new Dimension(370,470));
        setLayout(new GridBagLayout());
        
        
        txtPanel =  initPanel(new Dimension(330,80),new GridBagLayout());
        btn0=initButton("0", event-> {
            resutl.setText(resutl.getText()+String.valueOf("0"));

        });
        btn1=initButton("1", event-> {
            resutl.setText(resutl.getText()+String.valueOf("1"));
            
        });
        btn2=initButton("2", event-> {
            resutl.setText(resutl.getText()+String.valueOf("2"));
            
        });
        btn3=initButton("3", event-> {
            resutl.setText(resutl.getText()+String.valueOf("3"));
            
        });
        btn4=initButton("4", event-> {
            resutl.setText(resutl.getText()+String.valueOf("4"));
            
        });
        btn5=initButton("5", event-> {
            resutl.setText(resutl.getText()+String.valueOf("5"));
            
        });
        btn6=initButton("6", event-> {
            resutl.setText(resutl.getText()+String.valueOf("6"));
            
        });
        btn7=initButton("7", event-> {
            resutl.setText(resutl.getText()+String.valueOf("7"));
            
        });
        btn8=initButton("8", event-> {
            resutl.setText(resutl.getText()+String.valueOf("8"));
            
        });
        btn9=initButton("9", event-> {
            resutl.setText(resutl.getText()+String.valueOf("9"));
            
        });
        btnDot=initButton("\u002e", event-> {
            if(!resutl.getText().contains("\u002e"))
                resutl.setText(resutl.getText()+String.valueOf("\u002e"));
        
        });
        btnDiv=initButton("\\", event-> {
         
        
        });
        btnMpy=initButton("*", event-> {
         
        
        });
        btnPls=initButton("+", event-> {
         
        
        });
        btnMns=initButton("-", event-> {
         
        
        });
   
        btnDel=initButton("<-", event-> {
         
        
        });

        btnC=initButton("C", new ActionListener (){ // what is behind Lambda expresion 

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        });
        btnPer=initButton("%", event-> {
         
        
        });
        btnRoot=initButton(String.valueOf((char)0x221A),  event-> {
         
        
        });

        btnEqual = initButton("=", event ->{

        });
        btnPow = initButton("^", event ->{

        });

        btnLn = initButton("Ln", event ->{

        });

        btnPanel = initPanel(new Dimension(330,330),new GridBagLayout());
        gc  =  new GridBagConstraints();
        
        gc.gridx=0;
        gc.gridy=0;

        gc.gridwidth=1;
        gc.insets = new Insets(5, 5, 5, 5);
        
        // C Button
        btnPanel.add(btnC,gc);
        
        // Del Button
        gc.gridx=1;
        btnPanel.add(btnDel,gc);
        
        // % Button
        gc.gridx=2;
        btnPanel.add(btnPer,gc);
        
        // Div Button
        gc.gridx=3;
        btnPanel.add(btnDiv,gc);
        
        // Sqr Root Button
        gc.gridx=4;
        btnPanel.add(btnRoot,gc);
        
        // 1 Button -  New Line 
        gc.gridx=0;
        gc.gridy=1;
        btnPanel.add(btn1,gc);
        
        // 2 Button
        gc.gridx=1;
        btnPanel.add(btn2,gc);
        
        // 3 Button
        gc.gridx=2;
        btnPanel.add(btn3,gc);
        
        // * Button
        gc.gridx=3;
        btnPanel.add(btnMpy,gc);
        
        // ^ Button
        gc.gridx=4;
        btnPanel.add(btnPow,gc);
        
        // 4 Button -  New Line 
        gc.gridx=0;
        gc.gridy=2;
        btnPanel.add(btn4,gc);
        
        // 5 Button
        gc.gridx=1;
        btnPanel.add(btn5,gc);
        
        // 6 Button
        gc.gridx=2;
        btnPanel.add(btn6,gc);
        
        // - Button
        gc.gridx=3;
        btnPanel.add(btnMns,gc);
        
        // ln Button
        gc.gridx=4;
        btnPanel.add(btnLn,gc);
        
        // 7 Button - New Line
        gc.gridx=0;
        gc.gridy=3;
        btnPanel.add(btn7,gc);
        
        // 8 Button
        gc.gridx=1;
        btnPanel.add(btn8,gc);
        
        // 9 Button
        gc.gridx=2;
        btnPanel.add(btn9,gc);
        
        // + Button - I takes Two Cells
        gc.gridx=3;
        gc.gridwidth=2;
        
        gc.fill = GridBagConstraints.HORIZONTAL;
        btnPanel.add(btnPls,gc);
        
        // . Button -  New Line 
        gc.gridx=0;
        gc.gridy=4;
        gc.gridwidth=1;
        btnPanel.add(btnDot,gc);
        
        // 0 Button
        gc.gridx=1;
        btnPanel.add(btn0,gc);
        
        // = Button
        gc.gridx=2;
        gc.gridwidth=3;
        gc.fill=GridBagConstraints.HORIZONTAL;
        btnPanel.add(btnEqual,gc);

       
        btnPanel.repaint();
       


        resutl  =  initResult(new Dimension(260,50));

        gc= new GridBagConstraints();
        gc.insets = new Insets(5, 5, 5, 5);
        txtPanel.add(resutl,gc);
    
        
        gc= new GridBagConstraints();
        gc.gridx=0;
        gc.gridy=0;
        gc.gridwidth=1;
        gc.gridheight=1;
        gc.anchor =GridBagConstraints.EAST;
       
        this.getContentPane().add(txtPanel,gc);
        gc.gridx=0;
        gc.gridy=1;
        gc.gridwidth=1;
        gc.gridheight=6;
        this.getContentPane().add(btnPanel,gc);



        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setVisible(true);

 

        
        

}


    private  JPanel initPanel (Dimension d ,LayoutManager layout ){
        JPanel panel = new JPanel();
        panel.setPreferredSize(d);
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(Color.getHSBColor(10, 10, 10));
        panel.revalidate();
        panel.repaint();
        
        return panel;

    }
    private JButton initButton (String lbl ,ActionListener l){
        JButton btn  =  new JButton(lbl);
        btn.addActionListener(l);
        btn.setSize(new Dimension(50,50));
        btn.setToolTipText(btn.getText());
        btn.setFont(new Font("Comic Sans MS",Font.ITALIC,18));
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.WHITE);
        btn.setVisible(true);
        return btn;
    }
    private JTextField initResult(Dimension d){
        JTextField txt  = new JTextField();
        txt.setText("0");
        txt.setMargin(new Insets(5,5,5,5));
        txt.setPreferredSize(d);
        txt.setFont(new Font("Comic Sans MS",Font.BOLD,24));
        return txt;
    }
    public static void main(String[] args) {
        new Calculator();

    }
}
