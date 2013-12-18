package tipcalculator;

public class Configtipitemmodel extends Model {
	private float mintippercentage;
	private float maxtippercentage;
	private boolean includetax1;
	private boolean includededuction;
	
	public float getmintippercentage(){
		
		return mintippercentage;
	}

public void setmintippercentage(float mintippercentage){
		
		this.mintippercentage=mintippercentage;
	}

public float getmaxtippercentage(){
	
	return maxtippercentage;
}

public void setmaxtippercentage(float maxtippercentage){
	
	this.maxtippercentage=maxtippercentage;
}

public boolean getincludetax1(){
	return includetax1;
	
}
public void setincludetax1(boolean includetax1){
	
	this.includetax1=includetax1;
}

public boolean getincludededuction(){
	return includededuction;
	
}
public void setincludededuction(boolean includededuction){
	
	this.includededuction=includededuction;
}


}
