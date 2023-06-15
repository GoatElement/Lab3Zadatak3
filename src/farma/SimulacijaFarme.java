package farma;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
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
	
	private Label labelaNovac = new Label("Novac: 2000");
	private Button dugmeKokoska = new Button("Kokoska (300)");
	
	

	private void populate() {
		
		Panel contentMain = new Panel(new BorderLayout());	
		Panel contentDesno = new Panel(new GridLayout(0,1));//dodati na east
		Panel contentCentar= new Njiva(5,5);
		
		
		contentDesno.add(labelaNovac);
		contentDesno.add(dugmeKokoska);
		contentMain.add(contentDesno,BorderLayout.EAST);
		contentMain.add(contentCentar,BorderLayout.CENTER);
		
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
