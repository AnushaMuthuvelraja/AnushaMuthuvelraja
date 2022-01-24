package week1.day1;

public class Mobile {
	
	
	
	public void sendMsg(String msg)
	
	{
		
		System.out.println("Your sent message is:" +msg);
	}
	
	public long saveContact(long number)
	{
		
		return number;
		//System.out.println("Your contact saved:" + name);
	}
public long makeCall()
{
	  
	
	long phno=7914567894L;
	return phno;
}



public static void main(String[] args)
{
	
	Mobile object= new Mobile();
	
	object.sendMsg("hai");
	System.out.println("Your contact is saved:" +object.saveContact(7914567894L));
	System.out.println("You can make call to this number " +object.makeCall());
	
}

}
