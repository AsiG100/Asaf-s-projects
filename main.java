import javax.swing.JFrame;

public class main {
	public static void main(String[] args){
		MyCalculator go = new MyCalculator();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setVisible(true);
		go.setSize(315,500);
		go.setLocation(550, 150);
		go.setResizable(false);

		

	}
}