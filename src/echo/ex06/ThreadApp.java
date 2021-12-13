package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(new DigitRunableImpl());
		Thread thread1 = new Thread(new LowerThread());
		Thread thread2 = new Thread(new UpperThread());

		thread.start();
		thread1.start();
		thread2.start();

	}

}
