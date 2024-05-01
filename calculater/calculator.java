import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener,WindowListener
{
     Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,clr,ans,bmod,bexp,neg;
     int c,n;
     String s1,s2;
     TextField t1;
     public MyFrame(String s)
     {
         super(s);
         t1=new TextField(20);
         b0=new Button("0");
         b1=new Button("1");
         b2=new Button("2");
         b3=new Button("3");
         b4=new Button("4");
         b5=new Button("5");
         b6=new Button("6");
         b7=new Button("7");
         b8=new Button("8");
         b9=new Button("9");
         sum=new Button("+");
         sub=new Button("-");
         mul=new Button("*");
         div=new Button("/");
         clr=new Button("clr");
         ans=new Button("Ans");
         bmod=new Button("%");
         bexp=new Button("**");
         neg=new Button("(-)");
         
         t1.setBounds(20,45,290,50); 
         add(t1);
         b7.setBounds(20,105,50,50);
         add(b7); 
         b7.addActionListener(this);
    
         b8.setBounds(80,105,50,50);
         add(b8);
         b8.addActionListener(this);

         b9.setBounds(140,105,50,50);
         add(b9);
         b9.addActionListener(this);
    
         mul.setBounds(200,105,50,50);
         add(mul);
         mul.addActionListener(this);

         div.setBounds(260,105,50,50);
         add(div);
         div.addActionListener(this);

         b4.setBounds(20,165,50,50);
         add(b4);
         b4.addActionListener(this);

         b5.setBounds(80,165,50,50);
         add(b5);
         b5.addActionListener(this);

         b6.setBounds(140,165,50,50);
         add(b6);
         b6.addActionListener(this);

         sum.setBounds(200,165,50,50);
         add(sum);
         sum.addActionListener(this);

         sub.setBounds(260,165,50,50);
         add(sub);
         sub.addActionListener(this);

         b1.setBounds(20,225,50,50);
         add(b1);
         b1.addActionListener(this);

         b2.setBounds(80,225,50,50);
         add(b2);
         b2.addActionListener(this);

         b3.setBounds(140,225,50,50);
         add(b3);
         b3.addActionListener(this);

         bmod.setBounds(200,225,50,50);
         add(bmod);
         bmod.addActionListener(this);

         bexp.setBounds(260,225,50,50);
         add(bexp);
         bexp.addActionListener(this);
       
         b0.setBounds(20,285,50,50);
         add(b0);
         b0.addActionListener(this);

         neg.setBounds(80,285,50,50);
         add(neg);
         neg.addActionListener(this);

         clr.setBounds(140,285,50,50);
         add(clr);
         clr.addActionListener(this);

         ans.setBounds(200,285,110,50);
         add(ans);
         ans.addActionListener(this);
         ans.setBackground(Color.pink); 
   
         addWindowListener(this);      
         
         setLayout(null);
         setBackground(Color.black);
     }
     public void windowOpened(WindowEvent e){}
     public void windowClosed(WindowEvent e){}
     public void windowClosing(WindowEvent e)
     {
           System.exit(0);
     }
     public void windowActivated(WindowEvent e){}
     public void windowDeactivated(WindowEvent e){}
     public void windowIconified(WindowEvent e){}
     public void windowDeiconified(WindowEvent e){}
    
     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==b0)
            t1.setText(t1.getText()+"0");
        if(e.getSource()==b1)
            t1.setText(t1.getText()+"1");
        if(e.getSource()==b2)
            t1.setText(t1.getText()+"2");
        if(e.getSource()==b3)
            t1.setText(t1.getText()+"3");
        if(e.getSource()==b4)
            t1.setText(t1.getText()+"4");
        if(e.getSource()==b5)
            t1.setText(t1.getText()+"5");
        if(e.getSource()==b6)
            t1.setText(t1.getText()+"6");
        if(e.getSource()==b7)
            t1.setText(t1.getText()+"7");
        if(e.getSource()==b8)
            t1.setText(t1.getText()+"8");
        if(e.getSource()==b9)
            t1.setText(t1.getText()+"9");
        if(e.getSource()==sum)
        {
            s1=t1.getText();
            t1.setText("");
            c=1;
        }
        if(e.getSource()==sub)
        {
            s1=t1.getText();
            t1.setText("");
            c=2;
        }
        if(e.getSource()==mul)
        {
            s1=t1.getText();
            t1.setText("");
            c=3;
        }
        if(e.getSource()==div)
        {
            s1=t1.getText();
            t1.setText("");
            c=4;
        }
        if(e.getSource()==bmod)
        {
            s1=t1.getText();
            t1.setText("");
            c=5;
        }
        if(e.getSource()==bexp)
        {
            s1=t1.getText();
            t1.setText("");
            c=6;
        }
        if(e.getSource()==neg)
        {
            t1.setText("-");
        }
        if(e.getSource()==ans)
        {
            s2=t1.getText();
            if(c==1)
               n=Integer.parseInt(s1)+Integer.parseInt(s2);
            if(c==2)
               n=Integer.parseInt(s1)-Integer.parseInt(s2);
            if(c==3)
               n=Integer.parseInt(s1)*Integer.parseInt(s2);
            if(c==5)
               n=Integer.parseInt(s1)%Integer.parseInt(s2);
            if(c==6)
            {
               int a=Integer.parseInt(s1);
               int b=Integer.parseInt(s2);
               double m=Math.pow(a,b);
               n=(int)m;
               t1.setText(String.valueOf(n));      
            }
            if(c==1||c==2||c==3||c==6)
               t1.setText(String.valueOf(n));
            if(c==4)  
            {
               if(Integer.parseInt(s2)!=0)
               {
                    n=Integer.parseInt(s1)/Integer.parseInt(s2);
                    t1.setText(String.valueOf(n));
               }
               else
                    t1.setText("error");
            }
         }
         if(e.getSource()==clr)
                 t1.setText("");
    }
}
class calculator
{
      public static void main(String args[])
      {
           MyFrame f=new MyFrame("Simple Calculator");
           f.setSize(330,355);
           f.setVisible(true);
      }
}