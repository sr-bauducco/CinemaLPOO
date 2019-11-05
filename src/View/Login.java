package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField CampoMatrícula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		CampoMatrícula = new JPasswordField();
		CampoMatrícula.setBounds(120, 105, 241, 20);
		panel.add(CampoMatrícula);
		
		JLabel Matrícula = new JLabel("N\u00B0 Matr\u00EDcula");
		Matrícula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Matrícula.setBounds(29, 105, 81, 17);
		panel.add(Matrícula);
		
		JLabel LoginDoFuncionario = new JLabel("Login do Funcion\u00E1rio");
		LoginDoFuncionario.setForeground(new Color(0, 0, 0));
		LoginDoFuncionario.setBackground(new Color(255, 255, 255));
		LoginDoFuncionario.setFont(new Font("Tahoma", Font.BOLD, 14));
		LoginDoFuncionario.setBounds(134, 25, 144, 36);
		panel.add(LoginDoFuncionario);
		
		JButton Comfirmar = new JButton("Comfirmar");
		Comfirmar.setBackground(new Color(192, 192, 192));
		Comfirmar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Comfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String matricula = CampoMatrícula.getText();
				if(matricula.isEmpty()){
					JOptionPane.showMessageDialog(null, "ERRO 404");
				}else {
					
				}
				
				
			}
		});
		Comfirmar.setBounds(178, 179, 89, 23);
		panel.add(Comfirmar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(51, 11, 64, 64);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/View/team (2).png")));
	}
}
