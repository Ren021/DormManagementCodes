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

public class VisitorDocumentation extends DormManagement {

	private JPanel contentPane;
	private JTextField NameVdTf;
	private JTextField TemperatureVdBtn;

	/**
	 * Create the frame.
	 */
	public VisitorDocumentation() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NameVdTf = new JTextField();
		NameVdTf.setBorder(null);
		NameVdTf.setBounds(117, 275, 599, 76);
		NameVdTf.setOpaque(false); 
		contentPane.add(NameVdTf);
		NameVdTf.setColumns(10);
		
		TemperatureVdBtn = new JTextField();
		TemperatureVdBtn.setBounds(117, 419, 298, 76);
		TemperatureVdBtn.setBorder(null);
		TemperatureVdBtn.setOpaque(false); 
		contentPane.add(TemperatureVdBtn);
		TemperatureVdBtn.setColumns(10);
		
		JComboBox RoomNoVVdCb = new JComboBox();
		RoomNoVVdCb.setBorder(new LineBorder(new Color(0, 0, 0)));
		RoomNoVVdCb.setBounds(117, 567, 298, 76);
		contentPane.add(RoomNoVVdCb);
		
		JButton SubmitVdBtn = new JButton("");
		SubmitVdBtn.setBounds(106, 677, 222, 66);
		SubmitVdBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SubmitVdBtn.setBorder(null);
		SubmitVdBtn.setContentAreaFilled(false);
		contentPane.add(SubmitVdBtn);
		
		JButton BackVdBtn = new JButton("");
		BackVdBtn.setBounds(356, 677, 222, 66);
		BackVdBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BackVdBtn.setBorder(null);
		BackVdBtn.setContentAreaFilled(false);
		contentPane.add(BackVdBtn);
		
		JButton DisposeVdBtn = new JButton("");
		DisposeVdBtn.setBounds(1424, 0, 51, 76);
		DisposeVdBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DisposeVdBtn.setBorder(null);
		DisposeVdBtn.setContentAreaFilled(false);
		contentPane.add(DisposeVdBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\visitorsDocumentation (1).png"));
		lblNewLabel.setBounds(0, 0, 1496, 943);
		contentPane.add(lblNewLabel);
	}
}
