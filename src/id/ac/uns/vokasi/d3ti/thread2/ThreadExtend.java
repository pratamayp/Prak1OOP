package id.ac.uns.vokasi.d3ti.thread2;

public class ThreadExtend extends Thread {
	
	public ThreadExtend(String nama) {
		super(nama);
	}
	
	public void run() {
		for(int i=0;i<4;i++) {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread " + getName() + " berada diposisi " +i);
	}
}


}
