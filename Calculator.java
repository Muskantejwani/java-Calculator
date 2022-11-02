import java.util.Scanner;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class Calculator extends WindowAdapter implements ActionListener{
	
	Frame f;
	Button a,b,c,d,ee,g,h,i,j,k,l,m,plus,minus,divide,mul,back,equals;
	TextField t;
	
	String s1,s2,s3,s4,an;
	double num1,ans,flag,num2;
	
	Ad()
	{
		f=new Frame();
		
		f.addWindowListener(this);
		
	   // Label l = new Label("Calculator:");   
	    
	      // creating a Button  
	      b =new Button("7"); 
	      a =new Button("8"); 
	      c =new Button("9");
	      
	      d =new Button("4"); 
	      ee =new Button("5"); 
	     g =new Button("6"); 
	     
	     h =new Button("1");
	     i =new Button("2");
	     j =new Button("3");
	     k=new Button("0");
	     l=new Button("%");
	     m=new Button(".");
	     
	      plus =new Button("+");
	     minus =new Button("-");
	     divide =new Button("/");
	     mul =new Button("*");
	     back=new Button("<-");
	     equals=new Button("=");
	  
	      // creating a TextField  
	       t = new TextField(); 
	      //Label o=new Label(v);
	  
	       
	      t.setBounds(50, 30, 280, 30); 
	      
	      b.setBounds(50, 70, 30, 30); 
	      a.setBounds(90, 70, 30, 30); 
	      c.setBounds(130, 70, 30, 30);
	      
	      d.setBounds(50, 110, 30, 30); 
	      ee.setBounds(90, 110, 30, 30); 
	      g.setBounds(130, 110, 30, 30);
	      
	      h.setBounds(50, 150, 30, 30); 
	      i.setBounds(90, 150, 30, 30); 
	      j.setBounds(130, 150, 30, 30);
	      k.setBounds(90, 190, 30, 30);
	      l.setBounds(50,190,30,30);
	      m.setBounds(130,190,30,30);
	      
	      b.addActionListener(this);
	      a.addActionListener(this); 
	      c.addActionListener(this);
	      
	      d.addActionListener(this); 
	      ee.addActionListener(this);
	      g.addActionListener(this);
	      
	      h.addActionListener(this);
	      i.addActionListener(this); 
	      j.addActionListener(this);
	      k.addActionListener(this);
	      l.addActionListener(this);
	      m.addActionListener(this);
	      
	      plus.addActionListener(this);
	      minus.addActionListener(this);
	      divide.addActionListener(this);
	      mul.addActionListener(this);
	      equals.addActionListener(this);
	      back.addActionListener(this);
	      
	      plus.setBounds(170, 70, 40, 40);
	      minus.setBounds(220, 70, 40, 40);
	      
	      mul.setBounds(170, 110, 40, 40);
	      divide.setBounds(220, 110, 40, 40);
	      back.setBounds(170, 155, 90, 25);
	      equals.setBounds(170, 190, 90, 25);
	  
	      // adding components into frame    
	      f.add(b); 
	      f.add(a);
	      f.add(c);
	      f.add(d);
	      f.add(ee);
	      f.add(g);
	      f.add(h);
	      f.add(i);
	      f.add(j);
	      f.add(k);
	      f.add(l);
	      f.add(m);
	      f.add(plus);
	      f.add(minus);
	      f.add(mul);
	      f.add(divide);
	      f.add(back);
	      f.add(equals);
	       
	      f.add(t);  
	  
	      // frame size 300 width and 300 height    
	      f.setSize(400,300);  
	  
	      // setting the title of frame  
	      f.setTitle("Calculator");   
	          
	      // no layout  
	      f.setLayout(null);   
	  
	      // setting visibility of frame  
	      f.setVisible(true);  
	}
	
	public void windowClosing (WindowEvent e) {    
	    f.dispose();    
	} 
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		 if(obj == b)
		 {
			 s1=t.getText();
			 s2=s1+"7";
			 t.setText(s2);
		 }
		 
		 if(obj == a)
		 {
			 s1=t.getText();
			 s2=s1+"8";
			 t.setText(s2);
		 }
		 
		 if(obj == c)
		 {
			 s1=t.getText();
			 s2=s1+"9";
			 t.setText(s2);
		 }
		 if(obj == d)
		 {
			 s1=t.getText();
			 s2=s1+"4";
			 t.setText(s2);
		 }
		 if(obj == e)
		 {
			 s1=t.getText();
			 s2=s1+"5";
			 t.setText(s2);
		 }
		 if(obj == g)
		 {
			 s1=t.getText();
			 s2=s1+"6";
			 t.setText(s2);
		 }
		 
		 if(obj == h)
		 {
			 s1=t.getText();
			 s2=s1+"1";
			 t.setText(s2);
		 }
		 if(obj == i)
		 {
			 s1=t.getText();
			 s2=s1+"2";
			 t.setText(s2);
		 }
		 if(obj == j)
		 {
			 s1=t.getText();
			 s2=s1+"3";
			 t.setText(s2);
		 }
		 if(obj == k)
		 {
			 s1=t.getText();
			 s2=s1+"0";
			 t.setText(s2);
		 }
		 if(obj == m)
		 {
			 s1=t.getText();
			 s2=s1+".";
			 t.setText(s2);
		 }
		 
		 if(obj == ee)
		 {
			 s1=t.getText();
			 s2=s1+"5";
			 t.setText(s2);
		 }
		 
		 if(obj == plus)
		 {
			 s2=t.getText();
			 num1=Double.parseDouble(s2);
			 
			 t.setText("");
			 flag=1;
			 
		 }
		 if(obj == minus)
		 {
			 s2=t.getText();
			 num1=Double.parseDouble(s2);
			 
			 t.setText("");
			 flag=2;
		 }
		 if(obj == divide)
		 {
			 s2=t.getText();
			 num1=Double.parseDouble(s2);
			 
			 t.setText("");
			 flag=3;
		 }
		 if(obj == mul)
		 {
			 s2=t.getText();
			 num1=Double.parseDouble(s2);
			 
			 t.setText("");
			 flag=4;	 }
		 
		 if(obj == l)
		 {
			 s2=t.getText();
			 num1=Double.parseDouble(s2);
			 
			 t.setText("");
			 flag=5;	 }
		  
	  if(obj==back) {
		 s2=t.getText();
		s3=s2.substring(0,s2.length()-1);
		 t.setText(s3);
      }
	  
	   if(obj==equals)
		 { 
			 s1=t.getText();
			 num2=Double.parseDouble(s1);
			 if(flag==1)
				 ans=num1+num2;
			 if(flag==2)
				 ans=num1-num2;
			 if(flag==3)
				 ans=num1/num2;
			 if(flag==4)
				 ans=num1*num2;
			 if(flag==5)
				 ans=num1%num2;
		 
			 an=Double.toString(ans);
			 t.setText(an);
		 }}}