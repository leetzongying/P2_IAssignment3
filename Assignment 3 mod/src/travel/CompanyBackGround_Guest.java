package travel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;

public class CompanyBackGround_Guest extends JFrame {

	private JPanel contentPane;
	private JTextField nameCompany;
	private JTextField nameCEO;
	private JTextField yearEstab;
	private JTextField webSite;
	private JTextField telNO;
	private JTextField emailTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackGround_Guest frame = new CompanyBackGround_Guest();
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
	public CompanyBackGround_Guest() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyBackGround_Guest.class.getResource("/icon_pics/small-axe.png")));
		setTitle("Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 765, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(537, 383, 110, 39);
		panel.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Name of company:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(79, 22, 194, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNameOfCeo = new JLabel("Name of CEO:");
		lblNameOfCeo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNameOfCeo.setBounds(79, 71, 175, 39);
		panel.add(lblNameOfCeo);
		
		JLabel lblYearEstablished = new JLabel("Year Established");
		lblYearEstablished.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblYearEstablished.setBounds(79, 120, 175, 39);
		panel.add(lblYearEstablished);
		
		JLabel lblWebsite = new JLabel("Website:");
		lblWebsite.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWebsite.setBounds(79, 169, 175, 39);
		panel.add(lblWebsite);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tel No:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(79, 224, 175, 39);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Email:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(79, 288, 175, 39);
		panel.add(lblNewLabel_3_2);
		
		nameCompany = new JTextField();
		nameCompany.setEditable(false);
		nameCompany.setFont(new Font("Tahoma", Font.BOLD, 17));
		nameCompany.setText(CompanyBackGround_Admin.company);
		nameCompany.setBounds(329, 22, 360, 39);
		panel.add(nameCompany);
		nameCompany.setColumns(10);
		
		nameCEO = new JTextField();
		nameCEO.setEditable(false);
		nameCEO.setFont(new Font("Tahoma", Font.BOLD, 17));
		nameCEO.setText(CompanyBackGround_Admin.ceo);
		nameCEO.setColumns(10);
		nameCEO.setBounds(329, 71, 360, 39);
		panel.add(nameCEO);
		
		yearEstab = new JTextField();
		yearEstab.setEditable(false);
		yearEstab.setFont(new Font("Tahoma", Font.BOLD, 17));
		yearEstab.setText(CompanyBackGround_Admin.year);
		yearEstab.setColumns(10);
		yearEstab.setBounds(329, 120, 360, 39);
		panel.add(yearEstab);
		
		webSite = new JTextField();
		webSite.setEditable(false);
		webSite.setFont(new Font("Tahoma", Font.PLAIN, 17));
		webSite.setText(CompanyBackGround_Admin.web);
		webSite.setColumns(10);
		webSite.setBounds(329, 169, 360, 39);
		panel.add(webSite);
		
		telNO = new JTextField();
		telNO.setEditable(false);
		telNO.setFont(new Font("Tahoma", Font.PLAIN, 17));
		telNO.setText(CompanyBackGround_Admin.tel);
		telNO.setColumns(10);
		telNO.setBounds(329, 224, 360, 39);
		panel.add(telNO);
		
		emailTF = new JTextField();
		emailTF.setEditable(false);
		emailTF.setFont(new Font("Tahoma", Font.PLAIN, 17));
		emailTF.setText(CompanyBackGround_Admin.mel);
		emailTF.setColumns(10);
		emailTF.setBounds(329, 288, 360, 39);
		panel.add(emailTF);
	}

}
