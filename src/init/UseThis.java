package init;
import java.util.*;

public class UseThis {
	static int i;
	
	UseThis(int j){
		i=j;
	}
	private int add(){
		
		//System.out.println(++i);
		return ++i;
	}
	
	private void add2(){
		System.out.println(add());
		System.out.println(this);
	}
	
	public static void main (String[] args){
		UseThis a=new UseThis(1);
		a.add2();
	}
}
