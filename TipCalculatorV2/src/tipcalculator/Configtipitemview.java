package tipcalculator;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Configtipitemview extends Applet {

	Label lblmintippercent;
	Label lblmaxtippercent;
	TextField txtmintippercent;
	TextField txtmaxtippercent;

	Label lbltax1;
	Label lbldeduction;
	CheckboxGroup radtaxgroup;
	Checkbox radyestax;
	Checkbox radnotax;

	CheckboxGroup raddeductiongroup;
	Checkbox radyesdeduction;
	Checkbox radnodeduction;
	Button backhome;

	
	
	public void init() {

	
		setLayout(null);
		lblmintippercent = new Label("Minimum Tip Percent");
		txtmintippercent = new TextField();

		lblmaxtippercent = new Label("Maximum Tip Percent");
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
		int x = 10;
		int y = 10;
		int width = 100;
		int height = 20;

		lblmintippercent.setBounds(x, y, width * 2, height);
		txtmintippercent.setBounds(x + (width * 2), y, width, height);

		lblmaxtippercent.setBounds(x, y + height, width * 2, height);
		txtmaxtippercent.setBounds(x + (width * 2), y + height, width, height);

		lbltax1.setBounds(x, y + (height * 2), width, height);
		radyestax.setBounds(x + width, y + (height * 2), width, height);
		radnotax.setBounds(x + (width * 2), y + (height * 2), width, height);

		lbldeduction.setBounds(x, y + (height * 3), width, height);
		radyesdeduction.setBounds(x + width, y + (height * 3), width, height);
		radnodeduction.setBounds(x + (width * 2), y + (height * 3), width,
				height);

		backhome.setBounds(x, y + (height * 4), width, height);
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

				txtmintippercent.setText(Float.toString(configtipitemcontroller
						.getmintippercentagecon()));
				txtmaxtippercent.setText(Float.toString(configtipitemcontroller
						.getmaxtippercentagecon()));

				if (configtipitemcontroller.getincludetax1con() == true) {
					
					radyestax.setState(true);
					radnotax.setState(false);
				}

				if (configtipitemcontroller.getincludetax1con() == false) {
					radyestax.setState(false);
					radnotax.setState(true);
				}

				if (configtipitemcontroller.getincludedeductioncon() == true) {
					radyesdeduction.setState(true);
					radnodeduction.setState(false);
				}

				if (configtipitemcontroller.getincludedeductioncon() == false) {
					radyesdeduction.setState(false);
					radnodeduction.setState(true);
				}

			}
		});

	}

}
