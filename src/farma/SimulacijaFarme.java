package farma;

import java.awt.Frame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimulacijaFarme extends Frame {
	
	private void populate() {
		// TODO Auto-generated method stub
		
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
