/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sabah;

/**
 *
 * @author yazan
 */
public class Departments {
    
    private String departmentID;
    private String department;

    public Departments(String department) {
        this.department = department;
    }

    public String getDepartmentID() {
        return departmentID;
    }
    
    public String departmentID(String ID)
    {
     this.departmentID = ID;
     return departmentID;
    }

    public String getDepartment() {
        return department;
    }
    
    public String toString()
    {
     return department + "\n";
    }
    
    
    
}
