package Uno;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class UnoApplication {

	private JFrame frmUno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnoApplication window = new UnoApplication();
					window.frmUno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UnoApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUno = new JFrame();
		frmUno.setTitle("Uno");
		frmUno.setBounds(100, 100, 450, 300);
		frmUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
