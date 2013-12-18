package tipcalculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TipTailoringview extends View {

	
	TextField text[];
	Label value[];
	JSlider slidervalue[];
	
	Button applyBack;
	public void init(){
		 	
		setLayout(null);
		
			text = new TextField[5];
		 	value=new Label[5];
		 	slidervalue=new JSlider[5];
		 	applyBack=new Button("Apply");
		 	
		 	int x=10,y=-20;
		 	
		 	for (int i=0; i<5 ; i++){
		 		y=y+50;
		 		text[i] = new TextField(i);
		 		text[i].setBounds(x, y, 100, 20);
		 		add(text[i]);	
		 	
		 		
		 	}
		 	y=-20;
		 	x=140;
		 	for (int i=0; i<5 ; i++){
		 		y=y+50;
				slidervalue[i] = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
				slidervalue[i].setBounds(x, y, 100, 20);
				add(slidervalue[i]);		 		
			}
		 	
		 	y=-20;
		 	x=300;
for (int i=0; i<5 ; i++){
		 		y=y+50;
		 		value[i] = new Label();
		 		value[i].setBounds(x, y, 100, 20);
		 		add(value[i]);		 		
		 	}

applyBack.setBounds(400,100,100,20);
add(applyBack);

applyBack.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent arg1) {
		
	}
});



final int c=0;

for(int i=0;i<5;i++)
{
	
	slidervalue[i].addChangeListener(new ChangeListener() { 

		@Override
		
		
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
try
{
			value[c].setText(Integer.toString(slidervalue[c].getValue()));
			value[c+1].setText(Integer.toString(slidervalue[c+1].getValue()));
			value[c+2].setText(Integer.toString(slidervalue[c+2].getValue()));
			value[c+3].setText(Integer.toString(slidervalue[c+3].getValue()));
			value[c+4].setText(Integer.toString(slidervalue[c+4].getValue()));
			value[c+5].setText(Integer.toString(slidervalue[c+5].getValue()));
			value[c+6].setText(Integer.toString(slidervalue[c+6].getValue()));
			value[c+7].setText(Integer.toString(slidervalue[c+7].getValue()));
			value[c+8].setText(Integer.toString(slidervalue[c+8].getValue()));
			value[c+9].setText(Integer.toString(slidervalue[c+9].getValue()));
			value[c+10].setText(Integer.toString(slidervalue[c+10].getValue()));
			value[c+11].setText(Integer.toString(slidervalue[c+11].getValue()));
			value[c+12].setText(Integer.toString(slidervalue[c+12].getValue()));
			
}
catch(Exception e)
{
	}
		}
	});	
}


	}

		 	
				
			
				
	}	
	

