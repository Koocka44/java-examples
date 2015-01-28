package com.epam.training.arr;

public class Arr {
	
    public static void main(String[] args){
		int[] arrA = {1, 2, 3};
		
		int sum = Arr.sum(arrA);
		int avg = Arr.avg(arrA);
		String joinWoSep = join(arrA);
		String joinSep = join(arrA,'@');
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		System.out.println("join without sep: "+joinWoSep);
		System.out.println("join with sep: "+joinSep);
    }
	
	private static int sum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	private static int avg(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}
	
	private static int[] norm(int[] arr){
		int sum = Arr.sum(arr);
		double[] norm = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			norm[i] = arr[i]/sum;
		}
		return sum/arr.length;
	}
	
	private static String join(int[] arr){
		String retVal = "" + arr[0];
		for(int i = 1; i < arr.length; i++){
			retVal = retVal + "," + arr[i];
		}
		return retVal;
	}
	
	private static String join(int[] arr,char separator){
		String retVal = "" + arr[0];
		for(int i = 1; i < arr.length; i++){
			retVal = retVal + separator + arr[i];
		}
		return retVal;
	}
}