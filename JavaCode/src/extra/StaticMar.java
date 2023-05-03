package extra;

import java.awt.Color;
import java.io.PrintWriter;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class StaticMar {
	public static int n = 8;
	public static int boom = 8;
	public static Color cl = Color.CYAN.brighter();
	public static Color clo = Color.YELLOW.brighter();
	public static Color cli = Color.YELLOW.brighter();
	public static int Time =0;


	public StaticMar() {
		this.Time = 0;
	}

	public void setN(int x) {
		this.n = x;
		this.boom = x;
		System.out.println(n);
	}

	public void setBoom(int x) {
		if (x == 4) {
			this.boom += 0*this.n;
			System.out.println("easy");
			System.out.println("click easy");
			
		}
		if (x == 8) {
			this.boom += 0.5 * this.n;
			System.out.println("click normal");
		}
		if (x == 16) {
			System.out.println("click hard");
			this.boom += 1 * this.n;
		}
	}
	
	public static Icon imgboom = new ImageIcon(StaticMar.class.getResource("mine-icon.png"));
	public static Icon imghelp = new ImageIcon(StaticMar.class.getResource("Button-Help-icon.png"));
}
