package echo.ex06;

public class LowerThread implements Runnable{

	@Override
	public void run() { // 출장 준비 코드
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
	
	
}
