package day16_StringMethod;

import java.util.Scanner;

public class MethodStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Task
 * Ask for user to enter a name
 * check whether the name started with A
 * and ended with x
 * 
 * get the last index of letter a 
 * 
 * 
 * if the name has more than 2 characters do these 
 * get the middle letter
 * if the name has odd length get single char
 * if the name has even length get both chars
 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=scan.next();
		
		// check whether the name started with A
		 // and ended with x
		if(name.startsWith("a")&&(name.endsWith("x"))){
			System.out.println("name matches");
		}else{
			System.out.println("Name did not match");
		}
		
	// get the last index of letter a 
		System.out.println(name.lastIndexOf("a"));
		
		
		//if the name has more than 2 characters do these 
		 // get the middle letter
		if(name.length()>2) {
			if(name.length()%2==1){
			System.out.println(name.charAt(name.length()/2));
}else {System.out.println(name.charAt(name.length()/2+(name.charAt(name.length()/2)-1)));
	
}
}
}
}