package interview;

public class FinalizeConcept {
	public static void main(String args[])
	{
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		f1=null;
		f2=null;
		System.gc();
	}
	//before garbage collector we called finalize method to clean up the processing
	/*The java.lang.Object.finalize() is called by the
	 *  garbage collector on an object when 
	 *  garbage collection determines
	 *   that there are no more references to the object. A subclass overrides 
	 *   the finalize method to dispose of system resources or 
	 *   to perform other cleanup.*/
	

}
