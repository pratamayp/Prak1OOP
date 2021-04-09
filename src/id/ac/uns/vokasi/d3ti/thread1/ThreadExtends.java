package id.ac.uns.vokasi.d3ti.thread1;

public class ThreadExtends extends Thread {
	public ThreadExtends(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread: " + getName() + " posisi: " + i);
		}
	}

	public static void main(String[] args) {
		
		ThreadExtends vespa = new ThreadExtends("vespa");
		ThreadExtends sepeda = new ThreadExtends("sepeda");
		vespa.start();
		sepeda.start();
	}

	

}
