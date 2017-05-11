package init;
import java.util.*;

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals){
		petalCount = petals;
		System.out.printf("Constructor w/ int arg only,petalCount = % 4d %n",petalCount);
	}
	Flower(String ss){
		System.out.printf("Constructor w/ String arg only, s="
				+ ss);
		s = ss;
	}
	Flower(String s,int petals){
		this(petals);
		//this(s); 
		//在构造函数里只能用一个this来调用其他的构造函数，并且必须在第一句
		this.s=s;
		//这里都叫s就可以用this来区分
		System.out.println("String & int args");
		//println 和print 区别就是一个有换行，arg都是string
	}
	Flower(){
		this("hi",47);
		System.out.println("default constructor (no args)");
	}
	void printPetalCount(){
		//this(11);
		System.out.printf("petalCount = " + petalCount + " s = "+ s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
}
