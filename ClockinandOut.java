import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ClockinandOut extends DormManagement {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ClockinandOut() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox NameCbBtn = new JComboBox();
		NameCbBtn.setBounds(119, 268, 272, 76);
		NameCbBtn.setBorder(null);
		NameCbBtn.setOpaque(false); 
		contentPane.add(NameCbBtn);
		
		JButton TimeInCioBtn = new JButton("");
		TimeInCioBtn.setBounds(117, 531, 220, 65);
		TimeInCioBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TimeInCioBtn.setBorder(null);
		TimeInCioBtn.setContentAreaFilled(false);
		contentPane.add(TimeInCioBtn);
		
		JButton TimeOutCioBtn = new JButton("");
		TimeOutCioBtn.setBounds(370, 531, 220, 65);
		TimeOutCioBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TimeOutCioBtn.setBorder(null);
		TimeOutCioBtn.setContentAreaFilled(false);
		contentPane.add(TimeOutCioBtn);
		
		JButton BackCioBtn = new JButton("");
		BackCioBtn.setBounds(119, 641, 228, 65);
		BackCioBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackCioBtn.setBorder(null);
		BackCioBtn.setContentAreaFilled(false);
		contentPane.add(BackCioBtn);
		
		JButton DisposeCioBtn = new JButton("");
		DisposeCioBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DisposeCioBtn.setBorder(null);
		DisposeCioBtn.setContentAreaFilled(false);
		contentPane.add(DisposeCioBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\ClockInandOut (2).png"));
		lblNewLabel.setBounds(0, 11, 1496, 943);
		contentPane.add(lblNewLabel);
	}

}
