import javax.swing.*;
import java.awt.*;


public class Homework9 extends JFrame {
	public class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}
	
	public class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			JLabel hello = new JLabel("Hello");
			hello.setLocation (250, 120);
			hello.setSize(40, 40);
			hello.setForeground(Color.black);
			
			JLabel love = new JLabel("Love");
			love.setLocation (30, 150);
			love.setSize(40, 40);
			love.setForeground(Color.black);
			
			JLabel java = new JLabel("Java");
			java.setLocation (50, 40);
			java.setSize(40, 40);
			java.setForeground(Color.black);
			
			add(hello);
			add(love);
			add(java);
		}
	}
	
	
	
	public Homework9() {
		setTitle("Open Challenger 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Homework9();
	}
}
