package 윈도우프로그래밍;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Window win = new Window();
 win.setWidth(300);
 win.setIsVisible(true);
 win.setHeigth(200);

 System.out.println(win.getHeigth());
 System.out.printf("이거는%d %d",win.getHeigth(),win.getWidth());
	}

}
