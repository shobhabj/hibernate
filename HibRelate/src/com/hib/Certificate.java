package com.hib;
// Generated Jun 27, 2017 10:47:46 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Certificate generated by hbm2java
 */
public class Certificate  implements java.io.Serializable {


     private int id;
     private String name;
     private Set persons = new HashSet(0);

    public Certificate() {
    }

	
    public Certificate(int id) {
        this.id = id;
    }
    public Certificate(int id, String name, Set persons) {
       this.id = id;
       this.name = name;
       this.persons = persons;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getPersons() {
        return this.persons;
    }
    
    public void setPersons(Set persons) {
        this.persons = persons;
    }




}


