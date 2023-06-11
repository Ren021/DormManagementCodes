import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VisitorDocumentation extends DormManagement {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VisitorDocumentation() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\visitorsDocumentation.png"));
		lblNewLabel.setBounds(0, 0, 1496, 943);
		contentPane.add(lblNewLabel);
	}
}
