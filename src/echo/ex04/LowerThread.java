package echo.ex04;

public class LowerThread extends Thread{

	@Override
	public void run() { // 출장 준비 코드
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
	
	
}
