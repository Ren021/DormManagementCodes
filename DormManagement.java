import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DormManagement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DormManagement frame = new DormManagement();
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
	public DormManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1512, 982);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton TenantsInandOutBtn = new JButton("");
		TenantsInandOutBtn.setBounds(158, 622, 555, 116);
		TenantsInandOutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TenantsInandOutBtn.setBorder(null);
		TenantsInandOutBtn.setContentAreaFilled(false);
		contentPane.add(TenantsInandOutBtn);
		
		JButton LandlordDatabaseBtn = new JButton("");
		LandlordDatabaseBtn.setBounds(158, 461, 555, 116);
		LandlordDatabaseBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		LandlordDatabaseBtn.setBorder(null);
		LandlordDatabaseBtn.setContentAreaFilled(false);
		contentPane.add(LandlordDatabaseBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\mainMenu.png"));
		lblNewLabel.setBounds(10, 0, 1512, 982);
		contentPane.add(lblNewLabel);
	}
}
