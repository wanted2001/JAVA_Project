package day22;

class Threadsum extends Thread{
	int num1;
	int num2;
	int sum;
	
	public Threadsum() {}
	
	public Threadsum(int start, int end) {
		this.num1 = start;
		this.num2 = end;
	}
	
	public void run() {
		for(int i=num1; i<=num2; i++) {
			System.out.println("더할 수"+i);
			this.sum+=i;
		}
		System.out.println("합계:"+sum);
	}

	public int getSum() {
		return sum;
	}
	
	
}

public class Thread03 {
	
 
	public static void main(String[] args) {
		//1~50 , 51~100까지의 합을 구하는 두개의 Thread를 생성
		//그 결과를 출력
		
		//두개의 Thread가 실행되고 난후
		//thread 1~50까지의 합계 출력
		//thread 51~100까지의 합계 출력
		//thread1+thread2까지의 합계 출력
		System.out.println("main Start~!!!!!");
		
		Threadsum ts = new Threadsum(1,50);
		Threadsum ts2 = new Threadsum(51,100);
		ts.start();
		ts2.start();
		try {
			ts.join();
			Thread.sleep(10000);
			ts2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main End~!!!!");
		
		System.out.println("합계: "+(ts.getSum()+ts2.getSum()));
		
		
		
		
	}
}
