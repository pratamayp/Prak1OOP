package id.ac.uns.vokasi.d3ti.thread1;

public class MethodSinkronisasi extends Thread {

	public MethodSinkronisasi(String name) {
		super(name);
	}

	public static synchronized void tampil(String nama) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread: " + nama + " posisi: " + i);
		}
	}

	public void run() {
		tampil(getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread odong = new Thread(new MethodSinkronisasi("odong"));
		Thread andong = new Thread(new MethodSinkronisasi("andong"));
		odong.start();
		andong.start();
	}

}
