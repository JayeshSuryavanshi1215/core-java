package looping;

public class WhileNumberArePrimrORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=1,i=2,num=7;
	     while(i<=num)
	     {
	      if(num%i==0)
	      {
	    	  count++;
	       } 
	        i++;
	   }
	      if(count==2)
	        {
	             System.out.println(num+" is prime");
	        }
	       else
	       {
	             System.out.println(num+" is not prime!");
	        }
	
	}

}
