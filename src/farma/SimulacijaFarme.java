package farma;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimulacijaFarme extends Frame {
	
	private Label labelaNovac = new Label("Novac: ");
	
	
	
	public Label getLabelaNovac() {
		return labelaNovac;
	}

	public void setLabelaNovac(String s) {
		this.labelaNovac = new Label(s);
	}

	private void populate() {
		
		Panel contentMain = new Panel(new BorderLayout());	
		Panel contentDesno = new Panel(new GridLayout(0,1));//dodati na east
		
		contentDesno.add(getLabelaNovac());
		
	}
	
	public SimulacijaFarme()
	{
	setTitle("Farma"); 
	setBounds(700, 200, 500, 400);
	
	populate();
	pack();
	
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			super.windowClosing(e);
			dispose();
		}
	});
	
	addComponentListener(new ComponentAdapter() {
		@Override
		public void componentResized(ComponentEvent e) {
			super.componentResized(e);
			populate();
			pack();
		}
	});
	
	setVisible(true);
	
	}

}
