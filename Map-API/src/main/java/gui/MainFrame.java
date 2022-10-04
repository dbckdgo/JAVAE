package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.simple.parser.ParseException;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public JTextField address;
	public JLabel resAddress, resX, resY, jibunAddress, imageLable; // 라벨글자들

	public MainFrame(String title) {
		super(title); // 윈도우창제목

		// 위쪽에 라벨,주소입력,클릭 버튼
		JPanel pan = new JPanel();
		JLabel addressLbl = new JLabel("조소입력");
		address = new JTextField(50); // 입력창객체 생성 50 자까지
		JButton btn = new JButton("클릭");
		pan.add(addressLbl);
		pan.add(address);
		pan.add(btn);
		// 버튼을눌렸을때 현 클래스 MainFrame 객체를 매개 변수로 전
		btn.addActionListener(e -> {
			try {
				new NaverMap(this);
			} catch (IOException | ParseException e1) {
				e1.printStackTrace();
			}
		});
		// 지도입력라벤
		imageLable = new JLabel("지도보기");
		// 아래의주소정보 표시패널
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(4, 1));
		resAddress = new JLabel("도로명");
		jibunAddress = new JLabel("지번주소");
		resX = new JLabel("경도");
		resY = new JLabel("위도");
		pan1.add(resAddress);
		pan1.add(jibunAddress);
		pan1.add(resX);
		pan1.add(resY);

		// f레이아웃 설정
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, pan);
		add(imageLable, BorderLayout.CENTER);
		add(pan1, BorderLayout.SOUTH);

		setSize(730, 660);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
