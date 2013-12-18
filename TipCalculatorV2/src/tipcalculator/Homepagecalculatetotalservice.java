package tipcalculator;

public class Homepagecalculatetotalservice implements Businessservice{
float total;
	private Homepagemodel model;
	private Homepageview view;
	
	
	public Homepagecalculatetotalservice(Homepagemodel model, Homepageview view){
		this.model=model;
		this.view=view;
		
		
	}
	
		
	public float doProcessing() {
			
			//Homepagecontroller c1=new Homepagecontroller(model, view);
		
		total=model.getbilltotal()+((model.getbilltotal()-model.getbilldeduction()+model.gettax())*(model.gettiprate()/100));
		return total;
	
		//total=c1.getbilltotalcon()+c1.tottip;
		//return total;
		// TODO Auto-generated method stub
		
	}

}
