package 연습하기;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.simple.parser.ParseException;

import gui.NaverMap;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel resTitle, resUrl;

	public MainFrame(String titles) {
		super(titles); // 윈도우창제목

		JLabel lable = new JLabel();
		JPanel pan = new JPanel();
		JButton btn = new JButton("클릭");

		resTitle = new JLabel("타이틀");

//		pan.setLayout(new GridLayout(1, 10));
		pan.add(resTitle);

		pan.add(btn);

		btn.addActionListener(e -> {
			try {
				new ApiExplorer2(this);
			} catch (IOException | ParseException e1) {
				e1.printStackTrace();
			}
		});

		setLayout(new BorderLayout());
		add(BorderLayout.WEST, pan);

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
