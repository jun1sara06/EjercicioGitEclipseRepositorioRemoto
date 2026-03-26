import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIGitEclipse extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIGitEclipse frame = new GUIGitEclipse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIGitEclipse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//<<<<<<< HEAD
//=======
		JButton btnMaster = new JButton("New button");
//<<<<<<< HEAD
		btnMaster.setBounds(172, 10, 89, 23);
//>>>>>>> refs/remotes/origin/Rama_Lisset
//=======
		btnMaster.setBounds(175, 10, 85, 21);

		btnMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde el master.");
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnMaster);
		
//<<<<<<< HEAD
		JButton LissetButton = new JButton("LissetButton");
		LissetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde lisset boton :).");
			}
		});
		LissetButton.setBounds(149, 106, 135, 23);
		contentPane.add(LissetButton);
//=======
		JButton btnNewButton = new JButton("Boton Hola");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde el Boton Carol.");
			}
		});
		btnNewButton.setBounds(175, 119, 84, 20);
		contentPane.add(btnNewButton);
//>>>>>>> refs/remotes/origin/RamaCarol

	}
}
