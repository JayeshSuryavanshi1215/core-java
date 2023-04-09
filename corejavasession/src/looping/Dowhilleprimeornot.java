package looping;
import java.util.Scanner;
public class Dowhilleprimeornot {
	void prime()
    {
    	   char ch ;
    	   do {
    		   Scanner sc = new Scanner(System.in);
    		   System.out.println("Enter a Number =");
    		   int num=sc.nextInt();
    		   int count=1,i=2;
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
	    	      System.out.println("Do you want to continue ? press y/n");
	    	      ch=sc.next().charAt(0);
	    	}while(ch=='y' || ch=='Y'); 
    	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dowhilleprimeornot obj=new Dowhilleprimeornot();
		obj.prime();
	}

}
