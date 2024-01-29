package applications;

import java.util.Scanner;

public class Tourism {

	public static void main(String[] args) 
	{
		South south=new South(6);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=s.next();
		System.out.println(" Hi Mr/Mrs "+name+" Thanks for choosing "+south.company_name);
		while(true)
		{
			System.out.println("Please select which place would you like to visit in the above list");
			String option=s.next();
			if(option.equalsIgnoreCase("kedharnath"))
			{
				south.kedharnath();
			}
			else if(option.equalsIgnoreCase("Goa"))
				south.goa();
			else if(option.equalsIgnoreCase("Dispur"))
				south.dispur();
			else if(option.equalsIgnoreCase("Gokarna"))
				south.gokarna();
			else if(option.equalsIgnoreCase("Araku"))
				south.araku();
			System.out.println("Whould you like to book this trip");
			String decision=s.next();
			if(decision.equalsIgnoreCase("yes"))
			{
				System.out.println("You have to pay 15% of total amount to book this trip");
				System.out.println("Enter your mobile number we will call you soon");
				long num=s.nextLong();
				south.setMobile_num(num);
				south.getMobile_num();
				System.out.println("Thank you for giving number we will get back to you");
			}
			else
			{
				System.out.println("hope you will book later");
				break;
			}
		}
	}

}
interface India
{

	public void kedharnath();
	public void goa();
	public void dispur();
	public void arunachalam();
	void gokarna();
	void araku();
}
abstract class North implements India
{ 
	int places;
	static int price;
	String company_name="Global Tourism";
	North(int places)
	{
		this.places=places;
		System.out.println("Wellcome to "+company_name);
		System.out.println("Which is friendly flatform for travellers");
		System.out.println("We are currently covering "+this.places+" places");
		System.out.println("1.Kedharnath\n2.Goa\n3.Dispur\n4.Arunachalam\n5.Gokarna\n6.Araku");
	}
	public void kedharnath()
	{ 
		price=9800;
		System.out.println("The kedharnath trip cosists of 3 Nights and 4 days ");
		System.out.println("4 days is must and should to visit the all places surrounding");
		System.out.println("2 days food is free remaing days we can't provide food");
		System.out.println("Five start rooms will be provided for 3 nights");
		System.out.println("The total amount for this trip is "+price);
	}
	public void goa()
	{
		price=7500;
		System.out.println("The Goa trip cosists of 2 Nights and 3 days ");
		System.out.println("3 days is must and should to visit the all places surrounding");
		System.out.println("2 days food is free remaing days we can't provide food");
		System.out.println("Five start rooms will be provided for 2 nights");
		System.out.println("The total amount for this trip is "+price);
	}
	abstract public void dispur(); 
	abstract public void arunachalam();
	abstract public void gokarna();
	abstract public void araku();
}
abstract class East extends North
{
	
	East(int places) 
	{
		super(places);
		
	}
	public void dispur()
	{
		price=8800;
		System.out.println("The Dispur trip cosists of 3 Nights and 4 days ");
		System.out.println("4 days is must and should to visit the all places surrounding");
		System.out.println("2 days food is free remaing days we can't provide food");
		System.out.println("Five start rooms will be provided for 3 nights");
		System.out.println("The total amount for this trip is "+price);
	}
	abstract public void arunachalam();
	abstract public void gokarna();
	abstract public void araku();
}
class South extends East
{ 
	long mobile_num;
	public long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}
	South(int places) 
	{
		super(places);
		
	}
	public void arunachalam() 
	{
		price=5100;
		System.out.println("The Anuranachalam trip cosists of 1 Night and 2 days ");
		System.out.println("2 days is must and should to visit the all places surrounding");
		System.out.println("1 day food is free remaing days we can't provide food");
		System.out.println("Five start rooms will be provided for 1 nights");
		System.out.println("The total amount for this trip is "+price);
	}
	public void gokarna()
	{
		price=6000;
		System.out.println("The Gokarna trip cosists of 2 Nights and 3 days ");
		System.out.println("3 days is must and should to visit the all places surrounding");
		System.out.println("2 days food is free remaing days we can't provide food");
		System.out.println("Five start rooms will be provided for 2 nights");
		System.out.println("The total amount for this trip is "+price);
	}
	public void araku()
	{
		price=6500;
		System.out.println("The Araku trip cosists of 2 Nights and 3 days ");
		System.out.println("3 days is must and should to visit the all places surrounding");
		System.out.println("2 days food is free remaing days we can't provide food");
		System.out.println("Five start rooms will be provided for 2 nights");
		System.out.println("The total amount for this trip is "+price);
	}
}