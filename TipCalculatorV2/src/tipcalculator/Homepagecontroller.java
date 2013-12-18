package tipcalculator;

public class Homepagecontroller {

private float totaltip;
private float perpersontip;
private float total;



private String serviceType;
public float tottip;
private Homepagemodel model;
private Homepageview view;
public Homepagecontroller(Homepagemodel model, Homepageview view){
	this.model=model;
	this.view=view;
	
	
}


public float gettipratecon(){
	
	return model.gettiprate();
}

public void settipratecon(float tiprate){

	model.settiprate(tiprate);
	
	
}


public float getnoofguestcon(){
	
	return model.getnoofguest();
}

public void setnoofguestcon(float noofguest){

	model.setnoofguest(noofguest);
	
	
}

public float getslidermincon(){
	
	return model.getslidermin();
	
}

public void setslidermincon(float slidermin){

model.setslidermin(slidermin);;
}

public float getslidermaxcon(){
	return model.getslidermax();
}

public void setslidermaxcon(float slidermax){

model.setslidermax(slidermax);
}
public float getbilltotalcon()
{
	
return model.getbilltotal();	
}

public void setbilltotalcon(float billtotal){
model.setbilltotal(billtotal);

}
public float getbilldeductioncon(){
return model.getbilldeduction();

}
public void setbilldeductioncon(float billdeduction){

model.setbilldeduction(billdeduction);
}
public float gettaxcon(){
return model.gettax();
}
public void settaxcon(float tax){
model.settax(tax);

}
/*
public float calctotaltip(){
	
	totaltip=(model.getbilltotal()-model.getbilldeduction()+model.gettax())*(model.gettiprate()/100);
	return totaltip;
	
}

public float calcperpersontip(){
	perpersontip=totaltip/model.getnoofguest();
return perpersontip;
}
public float calctotal()
{
	total=model.getbilltotal()+totaltip;
	return total;
}

*/



public float calctotaltip(){
	
	HomepageServicelocator servicelocator = new HomepageServicelocator(model,view);
	Businessservice businessService;
	businessService = servicelocator.getBusinessService("calculatetotaltipservice");  //ask for handle//
    
	
	return businessService.doProcessing();        //call the service//
    
/*	totaltip=(getbilltotalcon()-getbilldeductioncon()+gettaxcon())*(gettipratecon()/100);
	return totaltip;
	*/
}

public float calcperpersontip(){
	HomepageServicelocator servicelocator = new HomepageServicelocator(model,view);
	Businessservice businessService;
	businessService = servicelocator.getBusinessService("calculateperpersontipservice");  //ask for handle//
    return businessService.doProcessing();          //call the service//
    
	
	/*perpersontip=totaltip/getnoofguestcon();
return perpersontip;
*/
}
public float calctotal()
{
	HomepageServicelocator servicelocator = new HomepageServicelocator(model,view); 
	Businessservice businessService;
	businessService = servicelocator.getBusinessService("calculatetotalservice");   //ask for handle//
return businessService.doProcessing();         //call the service//

	
	/*total=getbilltotalcon()+totaltip;
	return total;
*/
}

}


