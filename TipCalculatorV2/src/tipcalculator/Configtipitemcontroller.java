package tipcalculator;

public class Configtipitemcontroller {
	private Configtipitemmodel configtipitemmodel;
	private Configtipitemview configtipitemview;

	public Configtipitemcontroller(Configtipitemmodel configtipitemmodel, Configtipitemview configtipitemview){
		this.configtipitemmodel=configtipitemmodel;
		this.configtipitemview=configtipitemview;
		
		
	}
	
	
public float getmintippercentagecon(){
		
		return configtipitemmodel.getmintippercentage();
	}

public void setmintippercentagecon(float mintippercentage){
		
		configtipitemmodel.setmintippercentage(mintippercentage);
	}

public float getmaxtippercentagecon(){
	
	return configtipitemmodel.getmaxtippercentage();
}

public void setmaxtippercentagecon(float maxtippercentage){
	
	configtipitemmodel.setmaxtippercentage(maxtippercentage);
}

public boolean getincludetax1con(){
	return configtipitemmodel.getincludetax1();
	
}
public void setincludetax1con(boolean includetax1){
	
	configtipitemmodel.setincludetax1(includetax1);
}

public boolean getincludedeductioncon(){
	return configtipitemmodel.getincludededuction();
	
}
public void setincludedeductioncon(boolean includededuction){
	
	configtipitemmodel.setincludededuction(includededuction);
}



}
