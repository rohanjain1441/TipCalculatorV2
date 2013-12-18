package tipcalculator;

public class HomepageServicelocator {

	Homepagemodel model;
	Homepageview view;
	public HomepageServicelocator(Homepagemodel model, Homepageview view){
		this.model=model;
		this.view=view;
		
		
	}

	
	public Businessservice getBusinessService(String serviceType){
		 


		
		if(serviceType.equalsIgnoreCase("calculatetotaltipservice")){
	         return new Homepagecalculatetotaltipservice(model, view); //return handle//
	      }
		 
		 else if(serviceType.equalsIgnoreCase("calculateperpersontipservice")) {
	         return new Homepagecalculateperpersontipservice(model,view);  //return handle//
	      }
		 
		 else //if(serviceType.equalsIgnoreCase("calculatetotalservice")) {
		 {
			 return new Homepagecalculatetotalservice(model,view);   //return handle//
		 }
	      }
	}

