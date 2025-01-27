import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame jframe = new JFrame();
		Gameplay Gameplay = new Gameplay();
		
		jframe.setBounds(10,10,905,700);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBackground(Color.DARK_GRAY);
		jframe.setResizable(false);
		
		jframe.add(Gameplay);
		jframe.setVisible(true);
		
		
		
		
	}
	

}
