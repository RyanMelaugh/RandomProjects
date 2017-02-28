package eckalpse;

/**
 * Indiv, The individual actor objects, used to create actors with templates or add templates later.
 * @author ryan.melaugh
 *
 */
public class Indiv extends Actor{
	
	/**Default empty constr.*/
	Indiv(){
		//Use of this should result in a blank default template that results in generic behaviour
	}
	
	//Replace Object with relative template.
	/**Constr for passing and intialising template to instance*/
	Indiv(ActivityFULL f){
		//Use of this should provide a template but generic routine.
		System.out.print(f.genHunger());
		System.out.println("gj");
		
	}
	
	//Replace Both Objects with their relative created objects.
	/**Constr for passing and intialisnig job and template to instance*/
	Indiv(Object objJob, Object Temp){
		//Proper use of Actor, will supply Actor with a template and routine that is set within the Actor class specifically itself
	}
	
	
	//Replace Obkect with relative template.
	/**
	 * Intialise template, for use if new template needs added or non was intialised on creation.
	 * @param obj
	 */
	public void intialiseTemplateToInstance(Object obj){
		
	}
	
	
	
	
	
	

}
