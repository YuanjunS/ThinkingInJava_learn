package init;

//Using finalize() to detect an object that 
//has not been properly cleaned up.
//If not using finalize(),this error might never be found.

class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	//if one of books not check in after garbage collection
	protected void finalize(){
		if(checkedOut)
			System.out.println("error:checked out");
		//super.finalize();
	}
}
public class TerminationCondition {
	public static void main (String[] args){
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		//System.gc();
	}

}
