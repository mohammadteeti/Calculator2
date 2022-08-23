package Calculator2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.LayoutManager;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;



import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;


public class Calculator extends JFrame{
    private JPanel txtPanel ,btnPanel;
    private JButton btnC, btn0,btn1,btn2,btn3,btn4,btn5,btn6
                   ,btn7,btn8,btn9,btnDiv,btnMpy,btnPls
                   ,btnMns,btnPer,btnDel,btnPow,btnLn
                   ,btnRoot,btnDot,btnEqual;
    private JTextField result ;
    private GridBagConstraints gc ;
    private String numberEx = "(-?\\d+\u002e?\\d*)|(-?\\d+)" ; //Regular Expression of a Real Number
    private String val ="0";
    private String opr = "";// String to hold Operation
    private String op1 = ""; //String to hold first operand
    private String op2 ="" ; //String to hold second operand 

                   
    public Calculator(){
        
        setSize(new Dimension(370,470));
        setLayout(new GridBagLayout());
        
        
        txtPanel =  initPanel(new Dimension(330,80),new GridBagLayout());
        
        btn0=initButton("0", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"0":val+"0");
            
            if (opr.equals("")){
                op1+="0";
                result.setText(op1);
            }
            else{
                op2+="0";
                result.setText(op2);
            }
        });

        btn1=initButton("1", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"1":val+"1");
            
            if (opr.equals("")){
                op1+="1";
                result.setText(op1);
            }
            else{
                op2+="1";
                result.setText(op2);
            }
            
        });
        btn2=initButton("2", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"2":val+"2");
            
            if (opr.equals("")){
                op1+="2";
                result.setText(op1);
            }
            else{
                op2+="2";
                result.setText(op2);
            }
            
        });
        btn3=initButton("3", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"3":val+"3");
            
            if (opr.equals("")){
                op1+="3";
                result.setText(op1);
            }
            else{
                op2+="3";
                result.setText(op2);
            }
            
        });
        btn4=initButton("4", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"4":val+"4");
            
            if (opr.equals("")){
                op1+="4";
                result.setText(op1);
            }
            else{
                op2+="4";
                result.setText(op2);
            }
            
        });
        btn5=initButton("5", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"5":val+"5");
            
            if (opr.equals("")){
                op1+="5";
                result.setText(op1);
            }
            else{
                op2+="5";
                result.setText(op2);
            }
            
        });
        btn6=initButton("6", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"6":val+"6");
            
            if (opr.equals("")){
                op1+="6";
                result.setText(op1);
            }
            else{
                op2+="6";
                result.setText(op2);
            }

            
        });
        btn7=initButton("7", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"7":val+"7");
            
            if (opr.equals("")){
                op1+="7";
                result.setText(op1);
            }
            else{
                op2+="7";
                result.setText(op2);
            }
            
        });
        btn8=initButton("8", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"8":val+"8");
            
            if (opr.equals("")){
                op1+="8";
                result.setText(op1);
            }
            else{
                op2+="8";
                result.setText(op2);
            }
            
        });
        btn9=initButton("9", event-> {
            // val =  result.getText();
            // result.setText(val.equals("0")?"9":val+"9");
            
            if (opr.equals("")){
                op1+="9";
                result.setText(op1);
            }
            else{
                op2+="9";
                result.setText(op2);
            }
            
        });
        btnDot=initButton("\u002e", event-> {
                        
            if (opr.equals("")){
                op1+=op1.contains("\u002e")?"":"\u002e";
                result.setText(op1);
            }
            else{
                op2+=op2.contains("\u002e")?"":"\u002e";
                result.setText(op2);
            }
            
        
        });
        btnDiv=initButton("/", event-> {
            
            if (!opr.equals("") && !op2.equals("")){
               op1= String.valueOf(doCalc(op1,op2,opr));
               op2="";
               opr="/";
               result.setText(op1);
               
            }
            else if (opr.equals("") && op1.equals(""))
                /* This condition covers the case were Operation is firstly envoked 
                even before any operands  */
                return ;
            else {
                opr="/";
                
            }
            
        
        });
        btnMpy=initButton("*", event-> {
            if (!opr.equals("")&& !op2.equals("")){
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="*";
                result.setText(op1);
                
             }
             else if (opr.equals("") && op1.equals(""))
                /* This condition covers the case were Operation is firstly envoked 
                even before any operands  */
                return ;
             else 
                 opr="*";
        
        });
        btnPls=initButton("+", event-> {
            if (!opr.equals("")&& !op2.equals("")){
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="+";
                result.setText(op1);
                
             }
             else if (opr.equals("") && op1.equals(""))
                /* This condition covers the case were Operation is firstly envoked 
                even before any operands  */
                return ;
             else 
                 opr="+";
        
        });
        btnMns=initButton("-", event-> {
            if (!opr.equals("")&& !op2.equals("")){
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="-";
                result.setText(op1);
                
             }
             else if (opr.equals("") && op1.equals(""))
                /* This condition covers the case were Operation is firstly envoked 
                even before any operands  */
                return ;
             else 
                 opr="-";
        
        });
   
        btnDel=initButton("<-", event-> {
            
            if (!opr.equals("")&& op2.equals("")){
                opr="";
                result.setText(op1);
            }
            else if(!opr.equals("")&& !op2.equals("")){
                if (op2.length()>0){
                    op2=op2.substring(0,op2.length()-1);
                    result.setText(op2);
                }else
                    result.setText("0");
            }
            else if (opr.equals("")){
                if(op1.length()>0){
                    op1=op1.substring(0, op1.length()-1);
                    result.setText(op1);
                }else
                    result.setText("0");
            }
        
        });

        btnC=initButton("C", new ActionListener (){ // here we show what is behind Lambda expresion 

            @Override
            public void actionPerformed(ActionEvent e) {
               result.setText(String.valueOf(0));
                op1=op2=opr="";    
            }

        });
        btnPer=initButton("%", event-> {
        
            /* Here we cosider a logic that envokes % directly on the number presented in the 
             * field ,this also applies for Square root */
            if (Pattern.matches(numberEx, result.getText())){ // gurantee the existance of a real number 
             result.setText(String.valueOf(Double.valueOf(result.getText())/100.0));
            op1=result.getText();
            op2="";
            opr="";
            }

            // below is another logic for %,it also applies for squre roote 
             /* 
            if (!opr.equals("")&& !op2.equals("")){

                // Here WE find the calculation presented before % is clicked and then 
                // envoke % operation on the result 
             
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="";
                result.setText((Double.valueOf(op1)/100.0)+"");
                
             }
             else if (opr.equals("") && op1.equals(""))
                //This condition covers the case were Operation is firstly 
                //envoked even before any operands  
                return ;
             else 
                // if operation is not yet present but op1 is entered
                //we invoke %  directly  
                 opr="%";
            */
            
        });
        btnRoot=initButton(String.valueOf((char)0x221A),  event-> {
        /* Here we cosider a logic that envokes Square root directly 
         * on the number presented in the 
         * field ,this also applies for % operation */
        if (Pattern.matches(numberEx, result.getText())){ // gurantee the existance of a real number 
            result.setText(String.valueOf(Math.sqrt(Double.valueOf(result.getText()))));
            op1=result.getText();
            op2="";
            opr="";
        }

            // below is another logic for %,it also applies for squre roote 
             /* 
            if (!opr.equals("")&& !op2.equals("")){
                
                // Here WE find the calculation presented before % is clicked and then 
                // envoke % operation on the result 
             
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="";
                result.setText((Double.valueOf(op1)/100.0)+"");
                
             }
             else if (opr.equals("") && op1.equals(""))
                //This condition covers the case were Operation is firstly 
                //envoked even before any operands  
                return ;
             else 
                // if operation is not yet present but op1 is entered
                //we invoke %  directly  
                 opr="%";
            */
        
        });

        btnEqual = initButton("=", event ->{
            if (!op1.equals("") && !op2.equals("")
                &&!opr.equals(""))
                    result.setText(doCalc(op1, op2, opr)+"");
            
        });
        btnPow = initButton("^", event ->{
            if (!opr.equals("")&& !op2.equals("")){
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="^";
                result.setText(op1);
                
             }
             else if (opr.equals("") && op1.equals(""))
                /* This condition covers the case were Operation is firstly envoked 
                even before any operands  */
                return ;
             else 
                 opr="^";
        });

        btnLn = initButton("Ln", event ->{
            if (!opr.equals("")&& !op2.equals("")){
                op1= String.valueOf(doCalc(op1,op2,opr));
                op2="";
                opr="ln";
                result.setText(op1);
                
             }
             else if (opr.equals("") && op1.equals(""))
                /* This condition covers the case were Operation is firstly envoked 
                even before any operands  */
                return ;
             else 
                 opr="ln";
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
       


        result  =  initResult(new Dimension(260,50));

        gc= new GridBagConstraints();
        gc.insets = new Insets(5, 5, 5, 5);
        txtPanel.add(result,gc);
    
        
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
        if (btn.getText().equals("Ln"))
            btn.setToolTipText("to get the ln of X \nuse (1 ln X )");
        else
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
        txt.setEnabled(false);
        txt.setDisabledTextColor(Color.black);
        txt.setMargin(new Insets(5,5,5,5));
        txt.setPreferredSize(d);
        txt.setFont(new Font("Comic Sans MS",Font.BOLD,24));
        return txt;
    }
    private double doCalc (String op1,String op2 ,String opr){
        
        if (Pattern.matches(numberEx, op1) && Pattern.matches(numberEx, op2)){
        Double d1  =  Double.valueOf(op1);
        Double d2  = Double.valueOf(op2);
        
        switch(opr){
            case "/":
                if (d2!=0)
                    return d1/d2;
                else {
                    JOptionPane.showMessageDialog(null, "No Division on zero", "Math Error "
                    , JOptionPane.ERROR_MESSAGE);
                    return -684617646;
                }
            
            case "*":
                return d1*d2;
            case "+":
                return d1+d2;
            case "-":
                return d1-d2;
            
            case "ln":
                //to get the ln of X use (1 ln X )
                return d1*Math.log(d2);

            case ""+(char)0x221A:
                return Math.sqrt(d1);
            case "^":
                return Math.pow(d1, d2);
            case "%":
                return d1/100.0;

            
            
        }
        
    }
        else {
            JOptionPane.showMessageDialog(null, "Error", "Math Error "
            , JOptionPane.ERROR_MESSAGE);
        }
        return 0;
        
    }
    public static void main(String[] args) {
        new Calculator();

    }
}
