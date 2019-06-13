package edu.wbl.arrays;

public class Avereage {
	
	public static void main(String[] args) {
		double nums[]={10,20,30,40};
		double result=0;
		for(int i=0;i<nums.length;i++){
			result=result+ nums[i];
			System.out.println("avg num is"+result/nums.length);
		}
	}

}
