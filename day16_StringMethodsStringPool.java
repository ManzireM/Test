package day16_StringMethod;

public class day16_StringMethodsStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a String variable str
		//assing value of Sunday is Java Day
		//get it all uppercase
		//get last two characters
		//get the posioin of is
		//check wheater word java esits in str
		//get the index of 3rd word(Without knowing)
		
		String name="Sunday is Java Day";
	String up=name=name.toUpperCase();
		System.out.println(up);

		
		
	//using char to find last to character 	
	int count=name.length();
	char beforeLast=name.charAt(count-2);
	char last=name.charAt(count-1);
		
	System.out.println(beforeLast+""+last);
	
	
	
	
	//use by subString
	
	System.out.println(name.substring(count-2));

	
	
	//use by substring
	
	System.out.println(name.substring(count-2, count));
	
	
	
		// does sting has "is"
		int x=name.indexOf("IS");
		System.out.println(x);
		
		
		System.out.println(name.contains("JAVA"));
		
int Y=name.indexOf("");
System.out.println(name.substring(Y+1,Y+3));


		
		
	}

}
