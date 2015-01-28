public class Collatz {
	
	public static void main(String[] args){
		if(Integer.parseInt(args[0]) < 100){
			int i = Integer.parseInt(args[0]);
			boolean run = true;
			
			System.out.println(i);
			
			while(run){
				if(i%2 == 0){
					i = i/2;
				}
				else {
					i = 3*i + 1;
				}
				System.out.println(i);
				if(i == 1){
					run = false;
				}
			}
		}
	}
	
}