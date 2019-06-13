package edu.wbl.arrays;

public class DuplicateArray {
	/*public static void main(String[] args) {
		int[] a={1,2,3,3,4,5,6,6,6};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && i!=j){
					System.out.println("Duplicate elements is "+a[j] );
					
				}
			}
			
		}
	}
*/
	public int dup(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == arr.length-1){
				System.out.println(arr[i]);
				
			}else{
				System.out.println();
			}
			
			
		}
		return 0;
		
	}
}
