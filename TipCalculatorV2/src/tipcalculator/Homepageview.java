package tipcalculator;

import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.*;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Homepageview extends JApplet implements ActionListener {
float min=0,max=100;
boolean inctax=true,incdeduc=true;
	Label lblmintippercent;
	Label lblmaxtippercent;
	TextField txtmintippercent;
	TextField txtmaxtippercent;
	TextField text[];
	Label value[];
	Label slidervis[];
	JSlider slidervalue[];
	Button applyBack;
	Label lbltax1;
	Label lbldeduction;
	CheckboxGroup radtaxgroup;
	Checkbox radyestax;
	Checkbox radnotax;
int noofguest=0;
	float perpersontip=0;
	CheckboxGroup raddeductiongroup;
	Checkbox radyesdeduction;
	Checkbox radnodeduction;
	Button backhome;
Button buttiptailoring;
	
	Label lblnoofguest;
	TextField txtnoofguest;

	Label lblqos;
	JSlider sliderqos;
int chk=0;
float sumperperson=0;

	Label lblbilltotal;
	TextField txtbilltotal;
int check=1;
	Label lblbilldeduction;
	TextField txtbilldeduction;

	Label lbltax;
	TextField txttax;

	Label lbltipratename;
	Label lbltiprate;

	Label lbltotaltipname;
	Label lbltotaltip;

	Label lblperpersontipname;
	Label lblperpersontip;

	Label lbltotalname;
	Label lbltotal;
	Button calctotal;
	Button configtipitem;

	Label dollar1 = new Label();
	Label dollar2 = new Label();
	Label dollar3 = new Label();
	Label dollar4 = new Label();
	Label dollar5 = new Label();
	Label dollar6 = new Label();
	Label lhome;
	Label lconfig;
	Label ltiptailor;
	
	
	Label showslider;
	
	public void paint(Graphics g){
		
		if(check==1){
			
			lblmintippercent.setVisible(false);
			lblmaxtippercent.setVisible(false);
			txtmintippercent.setVisible(false);
			txtmaxtippercent.setVisible(false);

			lbltax1.setVisible(false);
			lbldeduction.setVisible(false);
			
			radyestax.setVisible(false);
			radnotax.setVisible(false);

			radyesdeduction.setVisible(false);
			radnodeduction.setVisible(false);
			backhome.setVisible(false);
			lconfig.setVisible(false);

			//tiptailor//
			
		 	for (int i=0; i<100 ; i++){
		 		text[i].setVisible(false);
		 	
		 		
		 	}
		 	
		 	for (int i=0; i<100 ; i++){
				slidervis[i].setVisible(false);
		 		slidervalue[i].setVisible(false);
				
			}
		 	
		 	
for (int i=0; i<100 ; i++){
		 		value[i].setVisible(false);
		 	}

applyBack.setVisible(false);
ltiptailor.setVisible(false);

			//tiptailor//
			
			
			if(inctax==true)
			{
				lbltax.setVisible(true);
				txttax.setVisible(true);
				
			}
			if(inctax==false)
			{
				txttax.setText("0.0");
				lbltax.setVisible(false);
				txttax.setVisible(false);
				
			}
			if(incdeduc==true)
			{
				lblbilldeduction.setVisible(true);
				txtbilldeduction.setVisible(true);
				
			}
			if(incdeduc==false)
			{
				txtbilldeduction.setText("0.0");
				lblbilldeduction.setVisible(false);
				txtbilldeduction.setVisible(false);
				
			}
			
			
			if(chk==1)
			{
				lbltotaltip.setText(Float.toString(sumperperson));
				
				perpersontip=sumperperson/noofguest;
				
				lblperpersontip.setText(Float.toString(sumperperson/noofguest));
		float tot=(sumperperson)+Float.parseFloat(txtbilltotal.getText());
				
		lbltotal.setText(Float.toString(tot));
		
		chk=0;
			}

		sliderqos.setMinimum((int)min);
		sliderqos.setMaximum((int)max);
			
			lblnoofguest.setVisible(true);
			txtnoofguest.setVisible(true);
			lblqos.setVisible(true);
			sliderqos.setMinimum((int)min);
				
			sliderqos.setVisible(true);
			showslider.setVisible(true);
			
			lblbilltotal.setVisible(true);
			
			txtbilltotal.setVisible(true);
			
			lbltipratename.setVisible(true);
			lbltiprate.setVisible(true);
			lbltotaltipname.setVisible(true);
			lbltotaltip.setVisible(true);
			lblperpersontipname.setVisible(true);
			lblperpersontip.setVisible(true);
			lbltotalname.setVisible(true);
			lbltotal.setVisible(true);
			calctotal.setVisible(true);
			configtipitem.setVisible(true);
			buttiptailoring.setVisible(true);
			
			lhome.setVisible(true);

			add(lblnoofguest);
			add(txtnoofguest);
			add(lblqos);
			add(showslider);

			add(sliderqos);
			add(lblbilltotal);
			add(txtbilltotal);
			add(lblbilldeduction);
			add(txtbilldeduction);
			add(lbltax);
			add(txttax);
			add(lbltipratename);
			add(lbltiprate);
			add(lbltotaltipname);
			add(lbltotaltip);
			add(lblperpersontipname);
			add(lblperpersontip);
			add(lbltotalname);
			add(lbltotal);
			add(calctotal);
			add(configtipitem);
			add(buttiptailoring);
			add(lhome);
this.validate();

//main//
			//config items//
			
			
			//config//
		
			check=10;
			//main//
			validate();
				
		}
		
		
		if(check==2)
		{

			//tiptailor//
			
		 	for (int i=0; i<100 ; i++){
		 		text[i].setVisible(false);
		 	
		 		
		 	}
		 	
		 	for (int i=0; i<100 ; i++){
				slidervis[i].setVisible(false);
		 		slidervalue[i].setVisible(false);
				
			}
		 	
		 	
for (int i=0; i<100 ; i++){
		 		value[i].setVisible(false);
		 	}

applyBack.setVisible(false);
ltiptailor.setVisible(false);

			
			
			
			
			//main//
			lblnoofguest.setVisible(false);
			txtnoofguest.setVisible(false);
			lblqos.setVisible(false);
			showslider.setVisible(false);
			sliderqos.setVisible(false);
			lblbilltotal.setVisible(false);
			txtbilltotal.setVisible(false);
			lblbilldeduction.setVisible(false);
			txtbilldeduction.setVisible(false);
			lbltax.setVisible(false);
			txttax.setVisible(false);
			lbltipratename.setVisible(false);
			lbltiprate.setVisible(false);
			lbltotaltipname.setVisible(false);
			lbltotaltip.setVisible(false);
			lblperpersontipname.setVisible(false);
			lblperpersontip.setVisible(false);
			lbltotalname.setVisible(false);
			lbltotal.setVisible(false);
			calctotal.setVisible(false);
			configtipitem.setVisible(false);
			buttiptailoring.setVisible(false);
			lhome.setVisible(false);
			
			//main//
			
			//config//
			
			lblmintippercent.setVisible(true);
			lblmaxtippercent.setVisible(true);
			txtmintippercent.setVisible(true);
			txtmaxtippercent.setVisible(true);

			lbltax1.setVisible(true);
			lbldeduction.setVisible(true);
			
			radyestax.setVisible(true);
			radnotax.setVisible(true);

			radyesdeduction.setVisible(true);
			radnodeduction.setVisible(true);
			backhome.setVisible(true);
			lconfig.setVisible(true);
			//config//
			add(lblmintippercent);
			add(lblmaxtippercent);
			add(txtmintippercent);
			add(txtmaxtippercent);

			add(lbltax1);
			add(lbldeduction);
			add(radyestax);
			add(radnotax);

			add(radyesdeduction);
			add(radnodeduction);
			add(backhome);
			add(lconfig);
			txtmintippercent.setText(Float.toString(min));
			txtmaxtippercent.setText(Float.toString(max));
			check=10;
		}
		
		if(check==3){

			
			lblnoofguest.setVisible(false);
			txtnoofguest.setVisible(false);
			lblqos.setVisible(false);
			showslider.setVisible(false);
			sliderqos.setVisible(false);
			lblbilltotal.setVisible(false);
			txtbilltotal.setVisible(false);
			lblbilldeduction.setVisible(false);
			txtbilldeduction.setVisible(false);
			lbltax.setVisible(false);
			txttax.setVisible(false);
			lbltipratename.setVisible(false);
			lbltiprate.setVisible(false);
			lbltotaltipname.setVisible(false);
			lbltotaltip.setVisible(false);
			lblperpersontipname.setVisible(false);
			lblperpersontip.setVisible(false);
			lbltotalname.setVisible(false);
			lbltotal.setVisible(false);
			calctotal.setVisible(false);
			configtipitem.setVisible(false);
			buttiptailoring.setVisible(false);
			lhome.setVisible(false);
			
			//main//
			
			//config//
			
			lblmintippercent.setVisible(false);
			lblmaxtippercent.setVisible(false);
			txtmintippercent.setVisible(false);
			txtmaxtippercent.setVisible(false);

			lbltax1.setVisible(false);
			lbldeduction.setVisible(false);
			
			radyestax.setVisible(false);
			radnotax.setVisible(false);

			radyesdeduction.setVisible(false);
			radnodeduction.setVisible(false);
			backhome.setVisible(false);
			lconfig.setVisible(false);

			
			int x=10,y=-20;
		 	
		 	for (int i=0; i<noofguest ; i++){
		 		y=y+50;
		 		text[i].setBounds(x, y+(i*20), 100, 20);
		 		text[i].setVisible(true);
		 		add(text[i]);	
	 	
		 		
		 	}
		 	
		 	
		 	
		 	y=-20;
		 	x=140;
		 	for (int i=0; i<noofguest ; i++){
		 		y=y+50;
		 		slidervis[i].setBounds(x, y+(i*20), 100, 20);
				
				slidervalue[i].setBounds(x, y+(i*20), 100, 20);
				slidervis[i].setVisible(true);
				slidervalue[i].setVisible(true);
				slidervalue[i].setValue((int)perpersontip);
				slidervalue[i].setMinimum((int)0);
				slidervalue[i].setMaximum((int)perpersontip+50);
				add(slidervis[i]);
				add(slidervalue[i]);		 		
			}
		 	
		 	y=-20;
		 	x=300;
for (int i=0; i<noofguest ; i++){
		 		y=y+50;
		 		value[i].setBounds(x, y+(i*20), 100, 20);
		 		value[i].setVisible(true);
		 		value[i].setText(Float.toString(perpersontip));
		 		add(value[i]);		 		
		 	}

applyBack.setBounds(400,100,100,20);
applyBack.setVisible(true);
ltiptailor.setVisible(true);
add(applyBack);

add(ltiptailor);

			check=10;
		}
		
			
			
		
	}
	
	
	public void init() {

		
		
		//setLayout(new BorderLayout());

		setLayout(new BorderLayout());

		//tiptailor//
		
		text = new TextField[100];
	 	value=new Label[100];
	 	slidervalue=new JSlider[100];
slidervis=new Label[100];
	 	applyBack=new Button("Apply");
	
	 	buttiptailoring=new Button("Tip Tailoring");
	 	
		for (int i=0; i<100 ; i++){
	 		text[i] = new TextField(i);
	 		
	 		
	 	}
		
		for (int i=0; i<100 ; i++){
	 		slidervis[i] = new Label("Double Click Here");
	 		
	 		
	 	}
	 	
	 	
	 	for (int i=0; i<100 ; i++){
	 		
	 		slidervalue[i] = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
			
		}
	 	
	 	
for (int i=0; i<100 ; i++){
	value[i] = new Label();
			 		
}


		
		
		
		lhome=new Label();
		lconfig=new Label();
		ltiptailor=new Label();
		lblnoofguest = new Label("No of Guest");
		txtnoofguest = new TextField();

		lblqos = new Label("Quality of Service");
		sliderqos = new JSlider(JSlider.HORIZONTAL, (int)min, (int)max, 50);
		showslider=new Label("Double Click here to view slider");

		lblbilltotal = new Label("Bill Total              $");
	
		txtbilltotal = new TextField();

		lblbilldeduction = new Label("Bill Deduction     $");
		txtbilldeduction = new TextField();

		lbltax = new Label("Tax                        $");
		txttax = new TextField();

		lbltipratename = new Label("Tip Rate (%)");
		lbltiprate = new Label(Integer.toString(sliderqos.getValue()));

		lbltotaltipname = new Label("Total Tip               $");
		lbltotaltip = new Label();

		lblperpersontipname = new Label("Per Person Tip   $");
		lblperpersontip = new Label();

		lbltotalname = new Label("Total                     $");
		lbltotal = new Label();

		calctotal = new Button("Calculate total");

		configtipitem = new Button("Configure Tip Items");

		dollar1 = new Label();
		dollar2 = new Label();
		dollar3 = new Label();
		dollar4 = new Label();
		dollar5 = new Label();
		dollar6 = new Label();
		

		
		int x = 10;
		int y = 10;
		int width = 100;
		int height = 20;

		lblnoofguest.setBounds(x, y*2, width, height);
		txtnoofguest.setBounds((x*3) + width, (y*2), width, height);

		lblqos.setBounds(x, (y*2) + height*2, width, height);
		sliderqos.setBounds((x*3) + width, (y*2) + height*2, width, height);
		showslider.setBounds((x*3) + width, (y*2) + height*2, width*2, height);

		lblbilltotal.setBounds(x, (y*2) + (height * 4), width, height);
		
		txtbilltotal.setBounds((x*3) + width, (y*2) + (height * 4), width, height);
		

		lblbilldeduction.setBounds(x, (y*2) + (height * 6), width, height);
		txtbilldeduction.setBounds((x*3) + width, (y*2) + (height * 6), width, height);
		

		lbltax.setBounds(x, (y*2) + (height * 8), width, height);
		txttax.setBounds((x*3) + width, (y*2) + (height * 8), width, height);

		lbltipratename.setBounds(x, (y*2) + (height * 10), width, height);
		lbltiprate.setBounds((x*3) + width, (y*2) + (height * 10), width, height);

		lbltotaltipname.setBounds(x, (y*2) + (height * 12), width, height);
		lbltotaltip.setBounds((x*3) + width, (y*2) + (height * 12), width, height);

		lblperpersontipname.setBounds(x, (y*2) + (height * 14), width, height);
		lblperpersontip.setBounds((x*3) + width, (y*2) + (height * 14), width, height);

		lbltotalname.setBounds(x, (y*2) + (height * 16), width, height);
		lbltotal.setBounds((x*3) + width, (y*2) + (height * 16), width, height);

		calctotal.setBounds((x*2), (y*2) + (height * 18), width, height);
		configtipitem.setBounds((x*2), (y*2) + (height * 20), width + 10, height);
		buttiptailoring.setBounds((x*2),(y*2) + (height * 22),width+10,height);
		
		
//main//


			
		//config//
		
		lblmintippercent = new Label("Minimum Tip Percent                        $");
		txtmintippercent = new TextField();

		lblmaxtippercent = new Label("Maximum Tip Percent                        $");
		txtmaxtippercent = new TextField();

		lbltax1 = new Label("Include Tax");
		lbldeduction = new Label("Include Deduction");
		radtaxgroup = new CheckboxGroup();

		radyestax = new Checkbox("Yes", radtaxgroup, true);

		radnotax = new Checkbox("No", radtaxgroup, false);

		raddeductiongroup = new CheckboxGroup();

		radyesdeduction = new Checkbox("Yes", raddeductiongroup, true);

		radnodeduction = new Checkbox("No", raddeductiongroup, false);
		backhome = new Button("Apply");
		int x1 = 10;
		int y1 = 10;
		int width1 = 100;
		int height1 = 20;

		
		lblmintippercent.setBounds(x1, y1, width1 * 2, height1);
		txtmintippercent.setBounds((x1*3) + (width1 * 2), y1, width1, height1);

		lblmaxtippercent.setBounds((x1), y1 + height1*2, width1 * 2, height1);
		txtmaxtippercent.setBounds((x1*3) + (width1 * 2), y1 + height1*2, width1, height1);

		lbltax1.setBounds((x1), y1 + (height1 * 4), width1, height1);
		radyestax.setBounds((x1*2) + width1, y1 + (height1 * 4), width1, height1);
		radnotax.setBounds((x1*3) + (width1 * 2), y1 + (height1 * 4), width1, height1);

		lbldeduction.setBounds((x1), y1 + (height1 * 6), width1, height1);
		radyesdeduction.setBounds((x1*2) + width1, y1 + (height1 * 6), width1, height1);
		radnodeduction.setBounds((x1*3) + (width1 * 2), y1 + (height1 * 6), width1,height1);

		backhome.setBounds((x1*2), y1 + (height1 * 8), width1, height1);
		
		

		
				
		backhome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {

				Configtipitemmodel configtipitemmodel = new Configtipitemmodel();

				configtipitemmodel.setmintippercentage(Float
						.parseFloat(txtmintippercent.getText()));
				configtipitemmodel.setmaxtippercentage(Float
						.parseFloat(txtmaxtippercent.getText()));

				if (radyestax.getState() == true) {
					configtipitemmodel.setincludetax1(true);
				} else {
					configtipitemmodel.setincludetax1(false);
				}

				if (radnotax.getState() == true) {
					configtipitemmodel.setincludetax1(false);
				} else {
					configtipitemmodel.setincludetax1(true);
				}

				if (radyesdeduction.getState() == true) {
					configtipitemmodel.setincludededuction(true);
				} else {
					configtipitemmodel.setincludededuction(false);
				}

				if (radnodeduction.getState() == true) {
					configtipitemmodel.setincludededuction(false);
				} else {
					configtipitemmodel.setincludededuction(true);
				}

				Configtipitemview configtipitemview = new Configtipitemview();

				Configtipitemcontroller configtipitemcontroller = new Configtipitemcontroller(
						configtipitemmodel, configtipitemview);

				//txtmintippercent.setText(Float.toString(configtipitemcontroller
					//	.getmintippercentagecon()));
				
			
				//txtmaxtippercent.setText(Float.toString(configtipitemcontroller
					//	.getmaxtippercentagecon()));

				min=Float.parseFloat(txtmintippercent.getText());
				max=Float.parseFloat(txtmaxtippercent.getText());
				
				
				if (configtipitemcontroller.getincludetax1con() == true) {
					
					radyestax.setState(true);
					radnotax.setState(false);
					inctax=true;
				}

				if (configtipitemcontroller.getincludetax1con() == false) {
					radyestax.setState(false);
					radnotax.setState(true);
					inctax=false;
				}

				if (configtipitemcontroller.getincludedeductioncon() == true) {
					radyesdeduction.setState(true);
					radnodeduction.setState(false);
					incdeduc=true;
				}

				if (configtipitemcontroller.getincludedeductioncon() == false) {
					radyesdeduction.setState(false);
					radnodeduction.setState(true);
					incdeduc=false;
				}
				check=1;
				repaint();
			}
		});

		final int crt=0;
		for(int i=0;i<100;i++)
		{
			slidervis[i].addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					
					try{
					slidervalue[crt].setVisible(true);
					slidervis[crt].setVisible(false);
					slidervalue[crt+1].setVisible(true);
					slidervis[crt+1].setVisible(false);
					slidervalue[crt+2].setVisible(true);
					slidervis[crt+2].setVisible(false);
					slidervalue[crt+3].setVisible(true);
					slidervis[crt+3].setVisible(false);
					slidervalue[crt+4].setVisible(true);
					slidervis[crt+4].setVisible(false);
					slidervalue[crt+5].setVisible(true);
					slidervis[crt+5].setVisible(false);
					slidervalue[crt+6].setVisible(true);
					slidervis[crt+6].setVisible(false);
					slidervalue[crt+7].setVisible(true);
					slidervis[crt+7].setVisible(false);
					slidervalue[crt+8].setVisible(true);
					slidervis[crt+8].setVisible(false);
					slidervalue[crt+9].setVisible(true);
					slidervis[crt+9].setVisible(false);
					slidervalue[crt+10].setVisible(true);
					slidervis[crt+10].setVisible(false);
					slidervalue[crt+11].setVisible(true);
					slidervis[crt+11].setVisible(false);
					slidervalue[crt+12].setVisible(true);
					slidervis[crt+12].setVisible(false);
		
					}
					
					catch(Exception e1)
					{
						
					}
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		final int c=0;

		for(int i=0;i<100;i++)
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
		
		//config//

		sliderqos.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub

				lbltiprate.setText(Integer.toString(sliderqos.getValue()));
			}
		});

		calctotal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Homepagemodel model = new Homepagemodel();
				model.setnoofguest(Float.parseFloat(txtnoofguest.getText()));
				
				noofguest=Integer.parseInt(txtnoofguest.getText());
				
				model.setslidermin(sliderqos.getMinimum());
				model.setslidermax(sliderqos.getMaximum());
				model.setbilltotal(Float.parseFloat(txtbilltotal.getText()));
				model.setbilldeduction(Float.parseFloat(txtbilldeduction
						.getText()));
				model.settax(Float.parseFloat(txttax.getText()));
				model.settiprate(Float.parseFloat(lbltiprate.getText()));
				Homepageview view = new Homepageview();

				Homepagecontroller controller = new Homepagecontroller(model,
						view);
				
				if(chk==0)
					
{
					lbltotaltip.setText(Float.toString(controller.calctotaltip()));
					perpersontip=controller.calcperpersontip();
					
				lblperpersontip.setText(Float.toString(perpersontip));
				lbltotal.setText(Float.toString(controller.calctotal()));
				}
				if(chk==1)
				{
					lbltotaltip.setText(Float.toString(sumperperson));
					
					
					lblperpersontip.setText(Float.toString(sumperperson/noofguest));
			float tot=(sumperperson)+Float.parseFloat(txtbilltotal.getText());
					
			lbltotal.setText(Float.toString(tot));
			
			//chk=0;
				}
				

			}
		});

		configtipitem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {
				
								check=2;
								
				repaint();

			}
		});
		
		buttiptailoring.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {

				if(txtnoofguest.getText().length()>0 && lblperpersontip.getText().length()>0){
					
					check=3;
					
					repaint();

				}
					
			}
		});
		
		
		applyBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {

				sumperperson=0;
				for(int i=0;i<noofguest;i++)
				{
					
					sumperperson=sumperperson+Float.parseFloat(value[i].getText());
				
				}
				
				chk=1;
				check=1;
				repaint();
				
			}
		});

		
			
		showslider.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				showslider.setVisible(false);
				sliderqos.setVisible(true);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		

	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			
		}
	}


