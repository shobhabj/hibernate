package com.hib;
// Generated Jun 27, 2017 10:47:46 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private int personid;
     private Certificate certificate;
     private String pname;

    public Person() {
    }

	
    public Person(int personid) {
        this.personid = personid;
    }
    public Person(int personid, Certificate certificate, String pname) {
       this.personid = personid;
       this.certificate = certificate;
       this.pname = pname;
    }
   
    public int getPersonid() {
        return this.personid;
    }
    
    public void setPersonid(int personid) {
        this.personid = personid;
    }
    public Certificate getCertificate() {
        return this.certificate;
    }
    
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
}


