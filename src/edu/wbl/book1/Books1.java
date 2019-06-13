package edu.wbl.book1;

class Books{
	String title;
	String author;
}

public class Books1 {
	public static void main(String[] args) {
		Books[] myBooks=new Books[3];
		myBooks[0]=new Books();
		myBooks[1]=new Books();
		myBooks[2]=new Books();

		myBooks[0].title="java";
		myBooks[1].title="react JS";
		myBooks[2].title="Node JS";
		myBooks[0].author="Kumar";
		myBooks[1].author="Vivek";
		myBooks[2].author="Pragyaaan";
		int x=0;
		while(x<3){
			System.out.println(myBooks[x].title);
			System.out.println("by");
			System.out.println(myBooks[x].author);
		x=x+1;
		}
	
	}
}


