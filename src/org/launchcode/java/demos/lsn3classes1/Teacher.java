package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher (String aFirstName, String aLastName, String aSubject, int aYearsTeaching){
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.subject = aSubject;
        this.yearsTeaching = aYearsTeaching;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName (String aFirstname){
        this.firstName = aFirstname;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName (String aLastName){
        this.lastName = aLastName;
    }

     public String getSubject(){
        return this.subject;
     }
    public void setSubject (String aSubject){
        this.subject = aSubject;
    }

     public int getYearsTeaching(){
        return this.yearsTeaching;
     }
    public void setYearsTeaching (int aYearsTeaching){
        this.yearsTeaching = aYearsTeaching;
    }








}
