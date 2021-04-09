package id.ac.uns.vokasi.d3ti.thread;

public class SinkronThread extends Thread{

	public static int sumber = 0;
	
	public SinkronThread(String name) {
		super(name);
	}
	
	public void run() {
		tampil(getName());
	}
	
	public static synchronized void tampil(String nama) {
		for(int i = 0; i < 9; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sumber = sumber+i;
			System.out.println("Thread " +nama+" Pada posisi :" +i+ " sumber berisi " + sumber);
		}
	}

	public static void main(String[] args) {
		SinkronThread kuda = new SinkronThread("kuda");
		kuda.start();
		
		SinkronThread kelinci= new SinkronThread("kelinci");
		kelinci.start();
	}
	
}
