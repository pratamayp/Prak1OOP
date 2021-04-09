package id.ac.uns.vokasi.d3ti.thread;

public class ThreadInterface implements Runnable {

	String name;
	
	public ThreadInterface(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<9; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread : " +name+ "posisi " +i);
		}
	}
	
	public static void main(String m[]) {
		Thread roadbike = new Thread(new ThreadInterface("roadbike"));
		Thread seli = new Thread(new ThreadInterface("seli"));
		seli.setPriority(10);
		roadbike.setPriority(1);
		
		roadbike.start();
		try {
			roadbike.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		seli.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Status aktif roadbike = " +roadbike.isAlive());	
	
	}
	
}
