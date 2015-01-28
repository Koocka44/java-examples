public class C2F {
	
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Wrong arguments!");
		}
		else {
			int type = Integer.parseInt(args[0]);
			int value = Integer.parseInt(args[1]);
			if(type == 0){
				double retVal = value * (9.0/5.0) + 32;
				System.out.println(value+" C in F:"+retVal);
			}
			else {
				double retVal = (value-32)*5.0/9.0;
				System.out.println(value+" F in C:"+retVal);
			}
		}
	}
	
}