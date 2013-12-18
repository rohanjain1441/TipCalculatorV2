package tipcalculator;

public class Homepagecalculatetotaltipservice implements Businessservice{
public float totaltip;
	
	private Homepagemodel model;
	private Homepageview view;
	
	public Homepagecalculatetotaltipservice(Homepagemodel model, Homepageview view){
		this.model=model;
		this.view=view;
		
		
	}
	
		public float doProcessing() {
		
//	Homepagecontroller c1=new Homepagecontroller(model, view);
		
	totaltip=(model.getbilltotal()-model.getbilldeduction()+model.gettax())*(model.gettiprate()/100);
	return totaltip;
	
	//totaltip=(c1.getbilltotalcon()-c1.getbilldeductioncon()+c1.gettaxcon())*(c1.gettipratecon()/100);
		//return totaltip;
		
		
		
		// TODO Auto-generated method stub
		
	}


	
}
