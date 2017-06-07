package reusedCode;

class WaterSource{
	private String s;
	WaterSource(){
		System.out.println("WaterSource()");
		s = "sun";
	}
	public String toString(){
		return s;
	}
}
//toString() is rewrite
public class SprinklerSystem {
	private String value;
	private WaterSource source = new WaterSource();
	
	private int i;
	private float f;
	public String toString(){
		return "valve = " + value + " " +"\n" +
				"i = " + i + " " + "f = " + f + " " +
				"source = " + source;
		//source is force converted to String
		//return "s";
	}
	public static void main(String[] args){
		WaterSource source2;
		int ii;
		ii=0;
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
		//force converted to String
	}

}
