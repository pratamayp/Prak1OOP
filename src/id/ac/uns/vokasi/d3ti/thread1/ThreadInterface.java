package id.ac.uns.vokasi.d3ti.thread1;

public class ThreadInterface extends mainThread implements Runnable {

	String name;

	public ThreadInterface(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		jalan(name);
	}

	public static void main(String[] args) {
		
		Thread vespa = new Thread(new ThreadInterface("vespa"));
		Thread sepeda = new Thread(new ThreadInterface("sepeda"));
		vespa.start();
		sepeda.start();

	}

}
