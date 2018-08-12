//This page contains the business logic to calculate standard deviation and mean
package test2;
import java.io.*;   
import java.util.*;




public class StudentService implements Serializable
{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private WinningResult w=new WinningResult();
	double mean=0,StdDevSum=0;
	double sd=0;
	String[] display;
	ArrayList<Student> sdlist=new ArrayList<Student>();
	
	 
	public ArrayList<Student> getSdlist() {
		return sdlist;
	}

	public void setSdlist(ArrayList<Student> sdlist) {
		this.sdlist = sdlist;
	}

	public WinningResult Calculations(Student s) //Calculates Mean and Standard deviation 
	{
		 
		int i = 0;
	    double sum = 0;	   
	    int[] numbers = new int [10];
	    String[] RafData;
      	    try{
	        
	        if(!s.getRaffleT().isEmpty())
	        {
	    		 RafData = s.getRaffleT().split(",");
	             for(String j:RafData)
	             {
	            	numbers[i] = Integer.parseInt(j);
	                sum = sum + numbers[i];
	             }	       
	             mean=sum/RafData.length;
	             w.setMean(mean);
	             for ( i=0; i<RafData.length ; i++)
				    {
		            StdDevSum = StdDevSum + Math.pow(numbers[i] - w.getMean(), 2);
				    }
		            sd=Math.sqrt(StdDevSum/(numbers.length));
		            w.setSd(sd);
	            	return w;                      
	        }
            
	    }

	    catch(Exception e)
	        {
	            System.out.println(e);
	        }
      	    return w;
        
	    }
	
	 		 
		
		 
	     

	}
