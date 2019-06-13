package edu.wbl.arrays;

public class MaxMin {
	public int max(int[] a){
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	public int min(int[] a){
		int min=a[0];//1234
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];	
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] a={12,13,14,15,1,5,6,7,};
		MaxMin mm=new MaxMin();
		System.out.println("Maximum value in the array is::"+mm.max(a));
		System.out.println("Minimun value in the aray is::"+mm.min(a));
	}

}
