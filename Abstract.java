/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/

abstract class Abstract {
	public abstract void cheese();
	  // Regular method
	  public void dough() {
	    System.out.println("Pizza");
	  }
	}

	// Subclass (inherit from Abstract)
	class pineapple extends Abstract {
	  public void cheese() {
	    // The body of cheese() is provided here
	    System.out.println("Its a Hawaaian Pizza");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    pineapple p = new pineapple(); // Create a pineapple object
	    p.cheese();
	    p.dough();
	  }
}
