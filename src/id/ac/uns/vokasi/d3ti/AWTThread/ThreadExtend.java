package id.ac.uns.vokasi.d3ti.AWTThread;

public class ThreadExtend extends Thread {
	
	public ThreadExtend(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 9; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread :"+getName()+" posisi" +i);
		}
	}
	
	public static void main(String[] args) {
		ThreadExtend vespa = new ThreadExtend("vespa");
		ThreadExtend sekuter = new ThreadExtend("sekuter");
		vespa.run();
		sekuter.run();
		System.out.println("proses lain");
	}
	
}
