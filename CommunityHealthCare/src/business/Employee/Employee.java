/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

import business.Doctor.Doctor;
import business.Person.Person;

/**
 * 
 *
 * @author manali
 */
public class Employee extends Person {
    
    private String name;
    private String userName;
    private int id;
    private static int count = 1;
   
    public Employee() {
        id = count;
        count++;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("username : "+ userName);
        this.userName = userName;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
 
    
}
