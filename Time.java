import java.io.*;
import java.util.*;
public class Time 
{
		private int hour,min,sec;
	
	Time(int hour, int min, int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	public Time add(Time t)
	{
		Time temp= new Time(0,0,0);
		temp.sec=temp.sec+t.sec+sec;
		if(temp.sec>=60)
		{	
			temp.min=temp.sec/60;
			temp.sec=temp.sec%60;
		}
		temp.min=temp.min+t.min+min;
		if(temp.min>=60)
		{	
			temp.hour=temp.min/60;
			temp.min=temp.min%60;
		}
		temp.hour=temp.hour+t.hour+hour;
		
		return temp;
	}
	public void display()
	{
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
	}

}

class TestTime
{
	public static void main(String args[])
	{
		Time t1=new Time(2,45,36);
		Time t2=new Time(5,32,49);
		Time result=t1.add(t2);
		
		result.display();
	}
}