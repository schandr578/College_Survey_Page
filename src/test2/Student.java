//This is the Student class which contains references to the survey form
package test2;

import java.io.*;


public class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname;
    private String lname;
    private String saddress;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String tphn;
    public String[] chekbox;
    private String radiob;
    private String dropd;
    public String raffleT;
    public String date;
    public String comments;
    

    
public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getSaddress() {
		return saddress;
	}


	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}


  public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


  public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
		public String getTphn() {
		return tphn;
	}


	public void setTphn(String tphn) {
		this.tphn = tphn;
	}


public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}



	
public String[] getChekbox() {
		return chekbox;
	}


	public void setChekbox(String[] chekbox) {
		this.chekbox = chekbox;
	}


public String getRadiob() {
		return radiob;
	}


	public void setRadiob(String radiob) {
		this.radiob = radiob;
	}

	

public String getDropd() {
		return dropd;
	}


	public void setDropd(String dropd) {
		this.dropd = dropd;
	}


	public String getRaffleT() {
		return raffleT;
	}


	public void setRaffleT(String raffleT) {
		this.raffleT = raffleT;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}
 