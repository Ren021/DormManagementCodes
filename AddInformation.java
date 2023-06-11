import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;

public class AddInformation extends DormManagement {

	private JPanel contentPane;
	private JTextField NameAiTf;
	private JTextField ContactAiTf;
	private final JButton DisposeAiBtn = new JButton("");

	/**
	 * Create the frame.
	 */
	public AddInformation() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NameAiTf = new JTextField();
		NameAiTf.setBounds(117, 271, 600, 73);
		NameAiTf.setBorder(null);
		NameAiTf.setOpaque(false); 
		contentPane.add(NameAiTf);
		NameAiTf.setColumns(10);
		
		ContactAiTf = new JTextField();
		ContactAiTf.setBounds(117, 411, 600, 73);
		ContactAiTf.setBorder(null);
		ContactAiTf.setOpaque(false); 
		contentPane.add(ContactAiTf);
		ContactAiTf.setColumns(10);
		
		JComboBox RoomNoAiCb = new JComboBox();
		RoomNoAiCb.setBorder(new LineBorder(new Color(0, 0, 0)));
		RoomNoAiCb.setBorder(null);
		RoomNoAiCb.setOpaque(false); 
		RoomNoAiCb.setBounds(117, 551, 306, 73);
		contentPane.add(RoomNoAiCb);
		
		JComboBox RentDueDateAiCb = new JComboBox();
		RentDueDateAiCb.setBorder(new LineBorder(new Color(0, 0, 0)));
		RentDueDateAiCb.setBorder(null);
		RentDueDateAiCb.setOpaque(false);
		RentDueDateAiCb.setBounds(797, 271, 306, 73);
		contentPane.add(RentDueDateAiCb);
		
		JComboBox RentsStatusAiCb = new JComboBox();
		RentsStatusAiCb.setBorder(new LineBorder(new Color(0, 0, 0)));
		RentsStatusAiCb.setBorder(null);
		RentsStatusAiCb.setOpaque(false);
		RentsStatusAiCb.setBounds(797, 411, 306, 73);
		contentPane.add(RentsStatusAiCb);
		
		JButton SubmitAiBtn = new JButton("");
		SubmitAiBtn.setBounds(106, 678, 223, 65);
		SubmitAiBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SubmitAiBtn.setBorder(null);
		SubmitAiBtn.setContentAreaFilled(false);
		contentPane.add(SubmitAiBtn);
		
		JButton BackAiBtn = new JButton("");
		BackAiBtn.setBounds(356, 678, 223, 65);
		BackAiBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackAiBtn.setBorder(null);
		BackAiBtn.setContentAreaFilled(false);
		contentPane.add(BackAiBtn);
		
		JButton DisposeAddIBtn = new JButton("");
		DisposeAddIBtn.setBounds(1429, 21, 45, 44);
		DisposeAddIBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DisposeAddIBtn.setBorder(null);
		DisposeAddIBtn.setContentAreaFilled(false);
		contentPane.add(DisposeAddIBtn);

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\tenants Info.png"));
		lblNewLabel.setBounds(0, 0, 1496, 943);
		contentPane.add(lblNewLabel);
	}

}
