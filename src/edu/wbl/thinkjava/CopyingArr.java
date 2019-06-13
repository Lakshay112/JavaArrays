package edu.wbl.thinkjava;

import java.util.Arrays;

public class CopyingArr {

	public static void main(String[] args) {
		double[] a = new double[4];
	double[] b = a;
		a[0]=17.0;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		
		
		//double[] b = new double[3];
		for (int i = 0; i < 3; i++) {
		b[i] = a[i];
			//double[] b = Arrays.copyOf(a, 3);	
		System.out.println(b[i]);
		}
		
		
	}
	//double[] b = Arrays.copyOf(a, 3);

}
