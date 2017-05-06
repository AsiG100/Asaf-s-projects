
public class Calculations {

	public static String calculate(String s){//calculates the string's value and returns a string
		CalStack numStack = new CalStack();
		String postfix=toPostfix(s);
		double res;
		String num1="";
		String num2="";
		for(int i=0;i<postfix.length();i++){
			num1="";
			num2="";
			if(postfix.charAt(i)>='0'&&postfix.charAt(i)<='9'){
				while(postfix.charAt(i)!=' '){
					num1+=postfix.charAt(i);
					i++;
				}
				numStack.push(num1);
			}
			else if(postfix.charAt(i)=='+'){
				num1=numStack.top();
				numStack.pop();
				num2=numStack.top();
				numStack.pop();
				res=Double.valueOf(num2)+Double.valueOf(num1);
				numStack.push(String.valueOf(res));
			}
			else if(postfix.charAt(i)=='-'){
				num1=numStack.top();
				numStack.pop();
				num2=numStack.top();
				numStack.pop();
				res=Double.valueOf(num2)-Double.valueOf(num1);
				numStack.push(String.valueOf(res));
			}
			else if(postfix.charAt(i)=='*'){
				num1=numStack.top();
				numStack.pop();
				num2=numStack.top();
				numStack.pop();
				res=Double.valueOf(num2)*Double.valueOf(num1);
				numStack.push(String.valueOf(res));
			}
			else if(postfix.charAt(i)=='/'){
				num1=numStack.top();
				numStack.pop();
				num2=numStack.top();
				numStack.pop();
				res=Double.valueOf(num2)/Double.valueOf(num1);
				numStack.push(String.valueOf(res));
			}
			else if(postfix.charAt(i)=='^'){
				num1=numStack.top();
				numStack.pop();
				num2=numStack.top();
				numStack.pop();
				res=Math.pow(Double.valueOf(num2), Double.valueOf(num1));
				numStack.push(String.valueOf(res));
			}
		}
		if(Double.valueOf(numStack.top())-Double.valueOf(numStack.top()).intValue()==0)
			return numStack.top().substring(0,numStack.top().length()-2);
		return numStack.top();
	}
	
	public static boolean precedence(String op1,String op2){
	if(op1.equals(""))return true;
	if(op2.equals("^"))return true;
	else if(op1.equals(")")||op1.equals("(")) return true; 
	else if((op2.equals("*")||op2.equals("/"))&&(op1.equals("+")||op1.equals("-")))return true;
	else if((op2.equals("+")||op2.equals("-"))&&(op1.equals("+")||op1.equals("-")))return true;
	else if((op2.equals("*")||op2.equals("/"))&&(op1.equals("*")||op1.equals("/")))return true;
	else return false;
		}

	public static String toPostfix(String s){
	String postfix="";
	CalStack st= new CalStack();
	for(int i=0;i<s.length();i++){
		
		if((s.charAt(i)<='9'&&s.charAt(i)>='0')||s.charAt(i)=='.'){
			postfix+=s.charAt(i);
		}
		else if(st.isEmpty()){
			st.push(String.valueOf(s.charAt(i)));
			postfix+=" ";
		}
		else if(s.charAt(i)==')'){
			while(!st.top().equals("(")){
				postfix+=" "+st.top();
				st.pop();
			}
			st.pop();
		}
		else if(precedence(st.top(),String.valueOf(s.charAt(i)))==false){
			while(!st.isEmpty()){
				postfix+=" "+st.top();
				st.pop();
			}
			st.push(String.valueOf(s.charAt(i)));
			postfix+=" ";
		}
		else{
			st.push(String.valueOf(s.charAt(i)));
			postfix+=" ";
		}
	}
	while(!st.isEmpty()){
		postfix+=" "+st.top();
		st.pop();
	}
	
	return postfix;
	}
	public static long factorial(int num){
		if(num==1)
			return 1;
		else{
			return num*factorial(num-1);
		}
	}
	}
