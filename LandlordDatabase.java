import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LandlordDatabase extends DormManagement {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public LandlordDatabase() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton TenantsBtn = new JButton("");
		TenantsBtn.setBounds(0, 0, 754, 154);
		TenantsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TenantsBtn.setBorder(null);
		TenantsBtn.setContentAreaFilled(false);
		contentPane.add(TenantsBtn);
		
		JButton VisitorsBtn = new JButton("");
		VisitorsBtn.setBounds(757, 0, 739, 154);
		VisitorsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		VisitorsBtn.setBorder(null);
		VisitorsBtn.setContentAreaFilled(false);
		contentPane.add(VisitorsBtn);
		
		JButton DisposeDbBtn = new JButton("");
		DisposeDbBtn.setBounds(1422, 871, 52, 61);
		DisposeDbBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DisposeDbBtn.setBorder(null);
		DisposeDbBtn.setContentAreaFilled(false);
		contentPane.add(DisposeDbBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\database.png"));
		lblNewLabel.setBounds(0, 0, 1496, 943);
		contentPane.add(lblNewLabel);
		
		
	}
}
