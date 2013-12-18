package tipcalculator;

public class Homepagecalculateperpersontipservice implements Businessservice{
float perpersontip;
	private Homepagemodel model;
	private Homepageview view;
	
	public Homepagecalculateperpersontipservice(Homepagemodel model, Homepageview view){
		this.model=model;
		this.view=view;
		
		
	}
	

	
	public float doProcessing() {
		//Homepagecontroller c1=new Homepagecontroller(model, view);
		
		
		perpersontip=((model.getbilltotal()-model.getbilldeduction()+model.gettax())*(model.gettiprate()/100))/model.getnoofguest();
		return perpersontip;
		
	//	perpersontip=c1.tottip/c1.getnoofguestcon();
		//return perpersontip;
		
		// TODO Auto-generated method stub
		
	}

}
