import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Anjali.java" height="500" width="1000"></applet>
*/

public class Anjali extends Applet implements ActionListener {
	String msg = "Hello, This is Anjali Garg's Applet!!";
	int size = 15;
	Font f;
	Font f1 = new Font("Times New Roman", Font.BOLD, 20);
	Color color = new Color(255, 255, 255);
	Color r = new Color(255, 0, 0);
	Color b = new Color(0, 0, 255);
	Color g = new Color(0, 255, 0);
	Button plus = new Button("+");
	Button minus = new Button("-");
	Button red = new Button("Red");
	Button blue = new Button("Blue");
	Button green = new Button("Green");

	public void init() {
		setLayout(null);
		setBackground(Color.darkGray);
		plus.setLocation(20, 50);
		plus.setSize(120, 40);
		plus.setFont(f1);

		minus.setLocation(150, 50);
		minus.setSize(120, 40);
		minus.setFont(f1);

		red.setLocation(280, 50);
		red.setSize(120, 40);
		red.setFont(f1);

		blue.setLocation(410, 50);
		blue.setSize(120, 40);
		blue.setFont(f1);

		green.setLocation(540, 50);
		green.setSize(120, 40);
		green.setFont(f1);

		add(plus);
		add(minus);
		add(red);
		add(blue);
		add(green);
		green.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("+")) {
			size += 2;
		}
		if (str.equals("-")) {
			size -= 2;
		}
		if (str.equals("Red")) {
			color = r;
		}
		if (str.equals("Blue")) {
			color = b;
		}
		if (str.equals("Green")) {
			color = g;
		}
		repaint();
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		f = new Font("Times New Roman", Font.BOLD, size);
		g.setFont(f);
		g.setColor(color);
		g.drawString(msg, 150, 200);
	}

}
