/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sabah;

/**
 *
 * @author yazan
 */
import java.time.*;

public class EmployeesGeneralUsers extends AdminUsers{
    
    private int employeesID;
    private String gender;
    private String jobTitle;
    private String typeOfEmployment;
    private LocalDate employmentDate;
    private String employmentStatus;
    
     public EmployeesGeneralUsers(String name, String surname, String usernameEmail, String contactDetails, String password, 
             String gender, String jobTitle, String typeOfEmployment, LocalDate employmentDate, String employmentStatus) {
       
         super(name, surname, usernameEmail, jobTitle, password);
         this.gender = gender;
         this.jobTitle = jobTitle;
         this.typeOfEmployment = typeOfEmployment;
         this.employmentDate = employmentDate;
         this.employmentStatus = employmentStatus;
         
      
         
    }

    public int getEmployeesID() {
        return employeesID;
    }

    public String getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getTypeOfEmployment() {
        return typeOfEmployment;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }
    
    public String toString()
    {
     return super.toString() + "\t" + gender + "\t" + jobTitle + "\t" + typeOfEmployment + "\t" + employmentDate + "\t" + employmentStatus;
    }
    
}
