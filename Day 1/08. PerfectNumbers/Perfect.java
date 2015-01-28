public class Perfect {
	
	public static void main(String[] args){
		int sum = 1;
		int number = Integer.parseInt(args[0]);
		for(int i = 2;i<number;i++){
			if(number % i == 0){
				sum += i;
			}
		}
		if(sum == number){
			System.out.println(number + " is perfect!");
		}
		else{
			System.out.println(number + " is not perfect! :(");
		}
	}
	
}