package demo;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField code;
	public JLabel Juga, DungRakrate, Siga, Goga, Zeoga, Georaeryang, Stype, VsYesterday, Time;

	public MainFrame(String title) throws IOException {
		super(title);

		JPanel pan = new JPanel();
		JLabel codelb = new JLabel("주소입력");
		JButton btn = new JButton("클릭");
		code = new JTextField(50); // 입력창객체 생성 50 자까지
		pan.add(codelb);
		pan.add(code);
		pan.add(btn);

		btn.addActionListener(e -> {
			try {
				new Project1(this);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});

		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(9, 1));
		Juga = new JLabel("주가");
		DungRakrate = new JLabel("등락률");
		Siga = new JLabel("시가");
		Goga = new JLabel("고가");
		Zeoga = new JLabel("저가");
		Georaeryang = new JLabel("거래량");
		Stype = new JLabel("타입");
		VsYesterday = new JLabel("전일대비");
		Time = new JLabel("시간");
		pan1.add(Juga);
		pan1.add(DungRakrate);
		pan1.add(Siga);
		pan1.add(Goga);
		pan1.add(Zeoga);
		pan1.add(Georaeryang);
		pan1.add(Stype);
		pan1.add(VsYesterday);
		pan1.add(Time);

		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, pan);
		add(pan1, BorderLayout.WEST);
		setSize(730, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
