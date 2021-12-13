package echo.ex06;

public class DigitRunableImpl implements Runnable{ //implements Runnable을 인스턴스로 가지고 있다는 소리 run을 무조건 만들어야 실행가능

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
	
	

}
