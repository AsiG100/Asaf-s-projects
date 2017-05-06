import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCalculator extends JFrame {
	protected Font font;
	public String output= "";
	protected double sum=0;
	protected JPanel panel;
	protected JLabel label;
	protected Graphics g;
	//others
	protected JButton delete;
	protected JButton LParent;
	protected JButton RParent;
	protected JButton dot;
	protected JButton back;
	protected JButton equal;
	//activities
	protected JButton sqrpow;
	protected JButton doubleZero;
	protected JButton power;
	protected JButton multi;
	protected JButton plus;
	protected JButton minus;
	protected JButton divide;
	//numbers
	protected JButton zero;
	protected JButton one;
	protected JButton two;
	protected JButton three;
	protected JButton four;
	protected JButton five;
	protected JButton six;
	protected JButton seven;
	protected JButton eight;
	protected JButton nine;
	
	public MyCalculator(){
		super("My Calculator");
		
		label= new JLabel("Start calculating!");//the label
		label.setSize(300,200);
		label.setLocation(40, 0);
		label.setBackground(Color.WHITE);
		label.setFont(font = new Font("Arial",Font.PLAIN,20));
		add(label);
		setLayout(null);
		
		//styling rectangle
		//g.drawRect(15, 15, 300, 200);
		
		
		//other buttons
		delete = new JButton("C");
		delete.setSize(65,55);
		delete.setLocation(20, 405);
		LParent= new JButton("(");
		LParent.setSize(50,40);
		LParent.setLocation(20, 150);
		RParent= new JButton(")");
		RParent.setSize(50,40);
		RParent.setLocation(75, 150);
		dot= new JButton(".");
		dot.setSize(50,40);
		dot.setLocation(130, 150);
		back= new JButton("<-");
		back.setSize(50,40);
		back.setLocation(185, 150);
		equal = new JButton("=");
		equal.setSize(50,40);
		equal.setLocation(240, 150);
		add(LParent);add(RParent);add(dot);add(back);add(equal);add(delete);
		//operators button
		doubleZero = new JButton("00");
		doubleZero.setSize(65,55);
		doubleZero.setLocation(170, 405);
		sqrpow= new JButton("^2");
		sqrpow.setSize(50,40);
		sqrpow.setLocation(240, 195);
		power= new JButton("^");
		power.setSize(50,40);
		power.setLocation(240, 240);
		multi= new JButton("x");
		multi.setSize(50,40);
		multi.setLocation(240, 285);
		plus= new JButton("+");
		plus.setSize(50,40);
		plus.setLocation(240, 330);
		minus= new JButton("-");
		minus.setSize(50,40);
		minus.setLocation(240, 375);
		divide= new JButton("/");
		divide.setSize(50,40);
		divide.setLocation(240, 420);
		add(doubleZero);add(power);add(multi);add(plus);add(minus);add(divide);add(sqrpow);
		//numbers buttons
		zero= new JButton("0");
		zero.setSize(65,55);
		zero.setLocation(95, 405);
		one= new JButton("1");
		one.setSize(65,65);
		one.setLocation(20, 195);
		two= new JButton("2");
		two.setSize(65,65);
		two.setLocation(95, 195);
		three= new JButton("3");
		three.setSize(65,65);
		three.setLocation(170, 195);
		four= new JButton("4");
		four.setSize(65,65);
		four.setLocation(20, 265);
		five= new JButton("5");
		five.setSize(65,65);
		five.setLocation(95, 265);
		six= new JButton("6");
		six.setSize(65,65);
		six.setLocation(170, 265);
		seven= new JButton("7");
		seven.setSize(65,65);
		seven.setLocation(20, 335);
		eight= new JButton("8");
		eight.setSize(65,65);
		eight.setLocation(95, 335);
		nine= new JButton("9");
		nine.setSize(65,65);
		nine.setLocation(170, 335);
		add(one);add(two);add(three);add(four);add(five);add(six);add(seven);
		add(eight);add(nine);add(zero);
		
		ActionHandler handle = new ActionHandler();
		zero.addActionListener(handle);
		one.addActionListener(handle);
		two.addActionListener(handle);
		three.addActionListener(handle);
		four.addActionListener(handle);
		five.addActionListener(handle);
		six.addActionListener(handle);
		seven.addActionListener(handle);
		eight.addActionListener(handle);
		nine.addActionListener(handle);
		/////others
		delete.addActionListener(handle);
		LParent.addActionListener(handle);
		RParent.addActionListener(handle);
		dot.addActionListener(handle);
		back.addActionListener(handle);
		equal.addActionListener(handle);
		////operators
		plus.addActionListener(handle);
		minus.addActionListener(handle);
		multi.addActionListener(handle);
		divide.addActionListener(handle);
		doubleZero.addActionListener(handle);
		power.addActionListener(handle);
		sqrpow.addActionListener(handle);
		
		
		}
		public boolean isOperator(char oper){
			if(oper=='+'||oper=='-'||oper=='*'||oper=='/'||oper=='^'||oper==')'||oper=='(');
			return true;
		}
	//////////////////////Event handler///////////////////////////////////////////////////////////
	public class ActionHandler implements ActionListener {
		int LPcount=0;
		public void actionPerformed(ActionEvent event) {

				if(event.getSource().equals(zero)){
					output+="0";
					label.setText(output);
				}
				else if(event.getSource().equals(one)){
					output+="1";
					label.setText(output);
				}
				else if(event.getSource().equals(two)){
					output+="2";
					label.setText(output);
				}
				else if(event.getSource().equals(three)){
					output+="3";
					label.setText(output);
				}
				else if(event.getSource().equals(four)){
					output+="4";
					label.setText(output);
				}
				else if(event.getSource().equals(five)){
					output+="5";
					label.setText(output);
				}
				else if(event.getSource().equals(six)){
					output+="6";
					label.setText(output);
				}
				else if(event.getSource().equals(seven)){
					output+="7";
					label.setText(output);
				}
				else if(event.getSource().equals(eight)){
					output+="8";
					label.setText(output);
				}
				else if(event.getSource().equals(nine)){
					output+="9";
					label.setText(output);
				}
				///operators
				else if(event.getSource().equals(plus)){
					try{
						if(output==""||output.charAt(output.length()-1)=='('||output.charAt(output.length()-1)>'9'||output.charAt(output.length()-1)<'0') throw new ArithmeticException();
						output+="+";
						label.setText(output);
					}catch(ArithmeticException e){
					}				
				}
				else if(event.getSource().equals(minus)){
					try{
						if(output==""||output.charAt(output.length()-1)=='('||output.charAt(output.length()-1)>'9'||output.charAt(output.length()-1)<'0') throw new ArithmeticException();
				    	output+="-";
						label.setText(output);
					}catch(ArithmeticException e){				
					}
				}
				else if(event.getSource().equals(multi)){
					try{
						if(output==""||output.charAt(output.length()-1)=='('||(output.charAt(output.length()-1)>'9'||output.charAt(output.length()-1)<'0')) throw new ArithmeticException();
						output+="*";
						label.setText(output);
					}catch(ArithmeticException e){
					}	
				}
				else if(event.getSource().equals(divide)){
					try{
						if(output==""||output.charAt(output.length()-1)=='('||output.charAt(output.length()-1)>'9'||output.charAt(output.length()-1)<'0') throw new ArithmeticException();
						output+="/";
						label.setText(output);
					}catch(ArithmeticException e){
					}	
				}
				else if(event.getSource().equals(doubleZero)){
				   try{
					   if(output=="")throw new ArithmeticException();
					   output+="00";
					label.setText(output);
				}catch(ArithmeticException e){
					
				}
				}
				else if(event.getSource().equals(power)){
					try{
						if(output.length()==0||output.charAt(output.length()-1)>'9'||output.charAt(output.length()-1)<'0') throw new ArithmeticException();
						output+="^";
						label.setText(output);
					}catch(ArithmeticException e){
					}	
				}
				else if(event.getSource().equals(sqrpow)){
					try{
						if(output==""||output.charAt(output.length()-1)>'9'||output.charAt(output.length()-1)<'0')throw new ArithmeticException();
						output+="^2";
						label.setText(output);
					}catch(ArithmeticException e){
					}	
				}
				///others
				else if(event.getSource().equals(delete)){
				    output="";
					label.setText(output);
				}
				else if(event.getSource().equals(LParent)){
				    output+="(";
					label.setText(output);
					LPcount++;
				}
				else if(event.getSource().equals(RParent)){
					try{
						if(LPcount==0)throw new ArithmeticException();
						output+=")";
						label.setText(output);
						LPcount--;
					}catch(ArithmeticException e){
					}
				}
				else if(event.getSource().equals(dot)){
					try{
						boolean isValid=false;
						boolean afterOperator=true;
					for(int i=0;i<output.length();i++){
						if((output.charAt(i)>='0'&&output.charAt(i)<='9')&&afterOperator==true)
							isValid=true;
						else if(output.charAt(i)=='.'){
							isValid=false;
							afterOperator=false;
						}
						else if(output.charAt(i)=='+'||output.charAt(i)=='-'||output.charAt(i)=='/'
								||output.charAt(i)=='*'||output.charAt(i)=='!'){
									afterOperator=true;
								}
					}
					if(!(afterOperator==true&&isValid==true))throw new ArithmeticException();
				    output+=".";
					label.setText(output);}
					catch(ArithmeticException e){
					}
					
				}
				else if(event.getSource().equals(back)){
					try{
						output=output.substring(0,output.length()-1);
						label.setText(output);
					}
					catch(Exception e){
						label.setText(output);
					}
					
				}
				else if(event.getSource().equals(equal)){
					try{
						if(output=="");
						label.setText(Calculations.calculate(output));
						output="";
					}catch(ArithmeticException e){
						label.setText("Math Error");
					}
				}

	}}
}
