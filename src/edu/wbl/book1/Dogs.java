package edu.wbl.book1;

public class Dogs {
	
	String name;
	public static void main(String[] args) {
		
		Dogs dog1=new Dogs();
		dog1.bark();
		dog1.name="Bart";
		Dogs[] MyDogs=new Dogs[3];
		MyDogs[0]=new Dogs();
		MyDogs[1]=new Dogs();
		MyDogs[2]=dog1;
		MyDogs[0].name="Fred";
		MyDogs[1].name="Marge";
		System.out.print("last dog name is");
		System.out.println(MyDogs[2].name);
		int x=0;
		while(x<MyDogs.length){
			MyDogs[x].bark();
			x=x+1;
			
		}
	}
	
	public void bark(){
		System.out.println(name+" "+ "says Ruff");
		
	}
	
	public void eat(){
		System.out.println("Hello");
		
	}
		public void chaseCat(){
			System.out.println("This is chaseCat");
			
		}
}
