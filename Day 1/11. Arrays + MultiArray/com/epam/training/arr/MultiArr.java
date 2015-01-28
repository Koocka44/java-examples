package com.epam.training.arr;

public class MultiArr {
	
    public static void main(String[] args){
		int[][] arr = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		int sum = 0;
		for(int i = 0; i< arr.length; i++){
			for(int j = 0; j< arr[0].length; j++){
				System.out.print(arr[i][j]+"\t");
				sum += arr[i][j];
			}
			System.out.print("\n");
		}
		
		int[] sorosszegek = {0,0,0};
		int[] oszloposszegek = {0,0,0};
		
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				sorosszegek[i] += arr[i][j];
				oszloposszegek[j] += arr[i][j];
			}
		}
		System.out.println("----------------------------------------");
		for(int i = 0; i< arr.length; i++){
			for(int j = 0; j< arr[0].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("|\t");
			System.out.print(sorosszegek[i]);
			System.out.print("\n");
		}
		for(int i = 0; i < oszloposszegek.length; i++){
			System.out.print("--\t");
		}
		System.out.print("/");
		System.out.print("\n");
		for(int i = 0; i < oszloposszegek.length; i++){
			System.out.print(oszloposszegek[i]+"\t");
		}
		
		System.out.print("\t");
		System.out.print(sum);
    }
	
}
