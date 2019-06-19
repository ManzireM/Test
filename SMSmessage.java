package day16_StringMethod;

public class SMSmessage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a string variable SMSmessage assigne:
		
		
		String SMSmessage="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

		
//Create 3 String variables, sender, phoneNumber, message
		String sender;
		String phoneNumber;
		String message;
		
//by using indexOf and substring methods, retrieve related information from SMSmessage string and assign to those 3 variables
sender=SMSmessage.substring(SMSmessage.indexOf("<")+1,SMSmessage.indexOf(">"));
System.out.println(sender);

phoneNumber=SMSmessage.substring(SMSmessage.indexOf("[")+1, SMSmessage.indexOf("]"));
System.out.println(phoneNumber);

message=SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
System.out.println(message);
	}

}
