/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

import java.util.Date;

/**
 *
 * @author 1795545
 */
public class Student extends Person {

    String studentID;
    
    
    
    public Student (String nom, String prenom, Date dateNaissance){
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateBirth = dateNaissance;
        this.studentID = createStudentId(nom, prenom, dateNaissance);
    }

    private String createStudentId(String lName, String fName, Date date) {
        String end = date.getYear() + "-" + date.getMonth();
        return lName.substring(0,3) + fName.charAt(0) + end;
    }

    
    public String getStudentId(){
        return studentID;
    }
    
    public void setStudentId(String student_id){
        this.studentID = student_id;
    }

    public void study() {
        System.out.println("I study");
    }
    
}
