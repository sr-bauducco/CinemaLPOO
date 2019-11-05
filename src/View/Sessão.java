package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class Sessão extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sessão frame = new Sessão();
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
	public Sessão() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel LaranjaMecânica = new JPanel();
		LaranjaMecânica.setBackground(new Color(169, 169, 169));
		LaranjaMecânica.setBounds(10, 11, 414, 75);
		panel.add(LaranjaMecânica);
		LaranjaMecânica.setLayout(null);
		
		JButton B1 = new JButton("16:30");
		B1.setForeground(new Color(30, 144, 255));
		B1.setBackground(new Color(30, 144, 255));
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblLaranjaMecnica = new JLabel("Laranja Mec\u00E2nica");
		lblLaranjaMecnica.setBounds(41, 0, 197, 24);
		LaranjaMecânica.add(lblLaranjaMecnica);
		lblLaranjaMecnica.setForeground(new Color(30, 144, 255));
		lblLaranjaMecnica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		B1.setBounds(41, 46, 61, 23);
		LaranjaMecânica.add(B1);
		
		JButton B2 = new JButton("18:30");
		B2.setBackground(new Color(30, 144, 255));
		B2.setForeground(new Color(30, 144, 255));
		B2.setBounds(175, 46, 61, 23);
		LaranjaMecânica.add(B2);
		
		JButton B3 = new JButton("20:30");
		B3.setBackground(new Color(30, 144, 255));
		B3.setForeground(new Color(30, 144, 255));
		B3.setBounds(310, 46, 61, 23);
		LaranjaMecânica.add(B3);
		
		JPanel OResgateDoSoldadoRyan = new JPanel();
		OResgateDoSoldadoRyan.setBackground(new Color(169, 169, 169));
		OResgateDoSoldadoRyan.setBounds(10, 95, 414, 75);
		panel.add(OResgateDoSoldadoRyan);
		OResgateDoSoldadoRyan.setLayout(null);
		
		JLabel lblOResgateDo = new JLabel("O Resgate do Soldado Ryan");
		lblOResgateDo.setForeground(new Color(30, 144, 255));
		lblOResgateDo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOResgateDo.setBounds(45, 11, 259, 19);
		OResgateDoSoldadoRyan.add(lblOResgateDo);
		
		JButton B4 = new JButton("17:40");
		B4.setForeground(new Color(30, 144, 255));
		B4.setBackground(new Color(30, 144, 255));
		B4.setBounds(45, 52, 61, 23);
		OResgateDoSoldadoRyan.add(B4);
		
		JButton B5 = new JButton("19:20");
		B5.setBackground(new Color(30, 144, 255));
		B5.setForeground(new Color(30, 144, 255));
		B5.setBounds(176, 52, 61, 23);
		OResgateDoSoldadoRyan.add(B5);
		
		JButton B6 = new JButton("21:00");
		B6.setForeground(new Color(30, 144, 255));
		B6.setBackground(new Color(30, 144, 255));
		B6.setBounds(314, 52, 61, 23);
		OResgateDoSoldadoRyan.add(B6);
		
		JPanel TurmadaMônica = new JPanel();
		TurmadaMônica.setBackground(new Color(169, 169, 169));
		TurmadaMônica.setBounds(10, 181, 414, 69);
		panel.add(TurmadaMônica);
		TurmadaMônica.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Truma da M\u00F4nica: La\u00E7os");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(49, 11, 177, 19);
		TurmadaMônica.add(lblNewLabel);
		
		JButton B7 = new JButton("16:45");
		B7.setForeground(new Color(30, 144, 255));
		B7.setBackground(new Color(30, 144, 255));
		B7.setBounds(49, 46, 61, 23);
		TurmadaMônica.add(B7);
		
		JButton B8 = new JButton("18:20");
		B8.setBackground(new Color(30, 144, 255));
		B8.setForeground(new Color(30, 144, 255));
		B8.setBounds(177, 46, 61, 23);
		TurmadaMônica.add(B8);
	}

}
