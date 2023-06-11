import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StatusChecker extends DormManagement {

	private JPanel contentPane;
	private JTextField SearchScTf;
	private JButton SearchScBtn;
	private JButton BackScBtn;
	private JButton DisposeScBtn;

	/**
	 * Create the frame.
	 */
	public StatusChecker() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SearchScTf = new JTextField();
		SearchScTf.setBounds(406, 428, 783, 85);
		SearchScTf.setBorder(null);
		SearchScTf.setOpaque(false); 
		contentPane.add(SearchScTf);
		SearchScTf.setColumns(10);
		
		SearchScBtn = new JButton("");
		SearchScBtn.setBounds(286, 414, 115, 114);
		SearchScBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SearchScBtn.setBorder(null);
		SearchScBtn.setContentAreaFilled(false);
		contentPane.add(SearchScBtn);
		
		BackScBtn = new JButton("");
		BackScBtn.setBounds(645, 785, 222, 64);
		BackScBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackScBtn.setBorder(null);
		BackScBtn.setContentAreaFilled(false);
		contentPane.add(BackScBtn);
		
		DisposeScBtn = new JButton("");
		DisposeScBtn.setBounds(1429, 24, 46, 45);
		DisposeScBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DisposeScBtn.setBorder(null);
		DisposeScBtn.setContentAreaFilled(false);
		contentPane.add(DisposeScBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\search (2).png"));
		lblNewLabel.setBounds(0, 0, 1496, 943);
		contentPane.add(lblNewLabel);
		
	}

}
