import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	  ArrayList<Integer> balls = new ArrayList<Integer>();	  
          for(int i = num; i > 0; i/= 10) balls.add(i%10);
	  digitList = new ArrayList<Integer>();
	  for(int i = balls.size()-1; i >= 0; i--){
	    digitList.add(balls.get(i)); 
	  }	    
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitList.size()-1; i++) if(digitList.get(i+1) <= digitList.get(i)) return false; 		
 	 return true; 
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
