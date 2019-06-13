package edu.wbl.book1;

public class Hobbits {
	String name;
	public static void main(String[] args) {
		Hobbits[] hb =new Hobbits[3];
		int z=0;
		while(z<2){
			z=z+1;
			hb[z]=new Hobbits();
			hb[z].name="Aryav";
		}
		if(z==1){
			hb[z].name="frodo";
			
			
		}
		else if(z==2){
			hb[z].name="Lakshay";
				}
		System.out.println(hb[z].name+" "+"is a");
		System.out.println("Good Habit Name");
		
	}

}
