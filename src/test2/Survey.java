//This page is the managed bean which controls various other classes
package test2;
import java.io.*; 
import java.util.ArrayList;




import javax.faces.bean.*;

@ManagedBean
public class Survey 
	{
	Student stud = new Student();
	WinningResult wr=new WinningResult();
	StudentService s1=new StudentService();
	public String showVal;
     ArrayList<Student> students = new ArrayList<Student>();
     private String listing;

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	public WinningResult getWr() {
		return wr;
	}

	public void setWr(WinningResult wr) {
		this.wr = wr;
	}

	public StudentService getS() {
		return s1;
	}

	public void setS(StudentService s1) {
		this.s1 = s1;
	}
	

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	
	public String getListing() {
		return listing;
	}

	public void setListing(String listing) {
		this.listing = listing;
	}
	public void addData() throws IOException, java.io.IOException {//Writing data to the file
        
		
	    FileWriter add = new FileWriter("abcd.txt",true);
	    try
	        {
	    	add.append(stud.getFname()+"^"+stud.getLname()+"^"+stud.getSaddress()+"^"
	                 +stud.getCity()+"^"+stud.getState()+"^"+stud.getZip()+"^"+stud.getEmail()+"^"+
	                 stud.getTphn()+"^"+stud.getDate()+"^"+stud.getRadiob()+"^"+stud.getRaffleT()+"^"+System.getProperty( "line.separator" ));
	       
	         }
	        
	    finally
	        {
	    	add.close();
	        }
	    }

	 public String readData() throws FileNotFoundException, IOException{//Read data from a file
	        
		String Info = null; 
	      
	    try {
	    	
	        BufferedReader readerData = new BufferedReader(new FileReader("abcd.txt"));

	        StringBuilder buildData = new StringBuilder();
	        
	        String dataEntry = readerData.readLine();
		       
	        while (dataEntry != null) {
		    String element[]=dataEntry.split("\\^");
		    System.out.println("Inside file writer");
		    
		    Student st=new Student();
		    
		    st.setFname(element[0]);
		    st.setLname(element[1]);
		    st.setSaddress(element[2]);
		    st.setCity(element[3]);
		    st.setState(element[4]);
		    st.setZip(element[5]);
		    st.setEmail(element[6]);
		    st.setTphn(element[7]);
		    st.setDate(element[8]);
		    st.setRadiob(element[9]);
		      st.setRaffleT(element[10]);
		    
		    
		     students.add(st);
		    dataEntry = readerData.readLine();
	        }  
	
	        Info = buildData.toString();

	      
	    }
	    catch(Exception e){ 
	         System.out.println("Error");
	    }
	    
	    System.out.println("Info" + Info);
	    return Info;
	      
	    }
	public String submitAction()throws IOException//Action controller method for submit button
	{
		 addData();		
		 showVal = readData();
		    wr=s1.Calculations(stud);
		if(wr.getMean()>=90)
		{
		  	
          	return "WinningResult";
		}
		else
		{
		  	
		  	System.out.println(stud.getFname());

		  	return"SimpleAcknowledgement";	

   	}	
				}
	 
		
	
	public String listsurveyAction() throws IOException {//Action Controller method for displaying list of students who gave survey
        try
        {
        	showVal = readData();
        }
        catch (FileNotFoundException e) {
	        e.printStackTrace();
        }
        return "ListSurvey";
    }

	
	public String cancelAction()
	{
		return "CancelReturn";
	}
	
	}
