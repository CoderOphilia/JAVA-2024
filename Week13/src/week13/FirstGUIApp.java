package week13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FirstGUIApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFullname;
	private JPanel mainContentPane;
	private JButton btnShowButton;
	private JButton btnClose;
	private JLabel monthText;
	private JTextField userMonthvalue;
	private JButton MonthCount;
	private final ButtonGroup buttonGroupofStudents = new ButtonGroup();
	private JRadioButton rdbn2;
	private JRadioButton rdbtn1;
	private JCheckBox fullTime;
	private JLabel lblNewLabel_1;
	private JComboBox faculty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUIApp frame = new FirstGUIApp();
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
	public FirstGUIApp() {
		buildComponents();
		addEventHandling();
	}
	
	private void buildComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainContentPane = new JPanel();
		mainContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("FIRST GUI APP");

		setContentPane(mainContentPane);
		
		btnShowButton = new JButton("Show Mesage");
		btnShowButton.setIcon(new ImageIcon(FirstGUIApp.class.getResource("/resources/download_done_24dp_5F6368_FILL0_wght400_GRAD0_opsz24.png")));
		
		btnClose = new JButton("Close");
		
		btnClose.setIcon(new ImageIcon(FirstGUIApp.class.getResource("/resources/close.png")));
		btnClose.setForeground(new Color(255, 0, 0));
		btnClose.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		
		textFullname = new JTextField();
		textFullname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Full Name");
		
		monthText = new JLabel("Enter  the Year");
		
		userMonthvalue = new JTextField();
		userMonthvalue.setColumns(10);
		
		MonthCount = new JButton("Click here to see the months");
		
		rdbtn1 = new JRadioButton("Grad Student");
		buttonGroupofStudents.add(rdbtn1);
		rdbtn1.setSelected(true);
		
		rdbn2 = new JRadioButton("Undergrad Student");
		buttonGroupofStudents.add(rdbn2);
		
		fullTime = new JCheckBox("Check if you are a full time student");
		
		faculty = new JComboBox();
		faculty.setModel(new DefaultComboBoxModel(new String[] {"Teacher1", "Teacher2", "Teacher3"}));
		
		lblNewLabel_1 = new JLabel("Select The faculty");
		
		GroupLayout gl_mainContentPane = new GroupLayout(mainContentPane);
		gl_mainContentPane.setHorizontalGroup(
			gl_mainContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainContentPane.createSequentialGroup()
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addGap(47)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainContentPane.createSequentialGroup()
									.addComponent(btnShowButton, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
									.addGap(51)
									.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_mainContentPane.createSequentialGroup()
									.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_mainContentPane.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_mainContentPane.createSequentialGroup()
											.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(monthText)
												.addComponent(lblNewLabel_1))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(faculty, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(userMonthvalue, Alignment.LEADING))))
									.addGap(95)
									.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbn2, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtn1)
										.addComponent(fullTime)))))
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addGap(203)
							.addComponent(MonthCount)))
					.addContainerGap(77, Short.MAX_VALUE))
		);
		gl_mainContentPane.setVerticalGroup(
			gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainContentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(rdbtn1)
						.addComponent(textFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(monthText)
								.addComponent(userMonthvalue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbn2)))
					.addGap(18)
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(fullTime)
						.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(faculty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(MonthCount)
					.addGap(45)
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnShowButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		mainContentPane.setLayout(gl_mainContentPane);
	}
	
	private void addEventHandling() {
		btnShowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String status = "";
				if(rdbtn1.isSelected()) {
					status = "Grad Student";
				}
				else if(rdbn2.isSelected()) {
					status = "Undergrad Student";
				}
				
				boolean fullT = true;
				String status1 = "";
				if(fullTime.isSelected()) {
					status1 = "Full Time";
				}
				else {
					status1 = "Part Time";
				}
				String faculty1 = faculty.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "FIRST GUI APPLICATION");
				JOptionPane.showMessageDialog(null, "Welcome " + textFullname.getText() + " is a " + status + " with status as " + status1 + " with the prof " + faculty1 );
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		MonthCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year = userMonthvalue.getText();
			}
		});
	}
}



