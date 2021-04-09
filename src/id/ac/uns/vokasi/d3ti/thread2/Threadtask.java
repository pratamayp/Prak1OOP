package id.ac.uns.vokasi.d3ti.thread2;

public class Threadtask extends Thread {
	
	public Threadtask(String nama) {
		super (nama);
	}
	
	public static synchronized void tampil(String nama) {
		for(int j=0;j<4;j++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread " + nama + " berada diposisi " +j);
			}
		}
	
	public void run() {
		tampil(getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadtask l1=new Threadtask("l1");
		Threadtask l3=new Threadtask("l3");
		l1.setPriority(MAX_PRIORITY);
		l1.start();
		l3.start();
		ThreadExtend l2=new ThreadExtend("l2");
		ThreadExtend l4=new ThreadExtend("l4");
		l2.start();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			//TODO Auto-generate catch block
			e.printStackTrace();
		}
		l4.start();
	}

}
