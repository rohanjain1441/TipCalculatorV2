package tipcalculator;

public class Homepagemodel extends Model {

	private float noofguest;
	private float slidermin;
	private float slidermax;
	private float billtotal;
	private float billdeduction;
	private float tax;
	
	private float totaltip;
	private float perpersontip;
	private float tiprate;
	private float total;
	
	
	public float getnoofguest(){
		
		return noofguest;
	}
	
	public void setnoofguest(float noofguest){
		
		this.noofguest=noofguest;
		
	}
	
public float gettiprate(){
		
		return tiprate;
	}
	
	public void settiprate(float tiprate){
		
		this.tiprate=tiprate;
		
	}
	
	
	
public float getslidermin(){
		
		return slidermin;
		
	}

public void setslidermin(float slidermin){
	
	this.slidermin=slidermin;
}

public float getslidermax(){
	return slidermax;
}

public void setslidermax(float slidermax){
	
	this.slidermax=slidermax;
}
public float getbilltotal()
{
return billtotal;	
}
public void setbilltotal(float billtotal){
	this.billtotal=billtotal;
	
}
public float getbilldeduction(){
	return billdeduction;
	
}
public void setbilldeduction(float billdeduction){
	
	this.billdeduction=billdeduction;
}
public float gettax(){
	return tax;
}
public void settax(float tax){
	this.tax=tax;
	
}
}
