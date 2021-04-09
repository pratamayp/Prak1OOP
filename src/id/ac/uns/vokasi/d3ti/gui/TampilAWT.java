package id.ac.uns.vokasi.d3ti.gui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TampilAWT extends Frame implements WindowListener {
	
	String nim, nama, jk, tmp_lahir, tgl_lahir, alamat;
	TextField cnim, cnama, ctmp_lahir, ctgl_lahir;
	TextArea calamat;
	Choice cjk;
	Button bt;
	
	public TampilAWT() {
		super("Biodata");
		Panel p = new Panel();
		add(p);
		p.setLayout(new GridLayout(7, 2));
		
		p.add(new Label("NIM"));
		p.add(cnim = new TextField());
		
		p.add(new Label("Nama"));
		p.add(cnama = new TextField());
		
		p.add(new Label("Jenis Kelamin"));
		cjk = new Choice();
		cjk.add("Laki-laki");
		cjk.add("Perempuan");
		p.add(cjk);
		
		p.add(new Label("Tempat Lahir"));
		p.add(ctmp_lahir = new TextField());
		
		p.add(new Label("Tanggal Lahir"));
		p.add(ctgl_lahir = new TextField());
		
		p.add(new Label("Alamat"));
		p.add(calamat = new TextArea());
		
		p.add(new Label());
		
		p.add(bt = new Button("Simpan"));
		addWindowListener(this);
		setSize(250, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TampilAWT();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(ABORT);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean action(Event evt, Object what) {
		// TODO Auto-generated method stub
		if(what.equals("Simpan")) {	
			nim = cnim.getText();
			nama = cnama.getText();
			tmp_lahir = ctmp_lahir.getText();
			tgl_lahir = ctgl_lahir.getText();
			alamat= calamat.getText();
			jk = cjk.getSelectedItem().toString();
			
			System.out.println(nim);
			System.out.println(nama);
			System.out.println(jk);
			System.out.println(tmp_lahir);
			System.out.println(tgl_lahir);
			System.out.println(alamat);
			
		}
		
		return true;
	}
}
