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

public class LeaveRequest {
    
    private String leaveRequestID;
    private String employeeID;
    private String leaveManagementID;
    private String departmentID;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    
    private EmployeesGeneralUsers employees;

    public LeaveRequest(String employeeID, String leaveManagementID, String departmentID, LocalDate dateFrom, LocalDate dateTo) {
        this.employeeID = employeeID;
        this.leaveManagementID = leaveManagementID;
        this.departmentID = departmentID;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
    
    public String getName()
    {
     return employees.getName();
    }
    
    
    public String getLeaveRequestID() {
        return leaveRequestID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getLeaveManagementID() {
        return leaveManagementID;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }
    
    public String toString()
    {
     return employeeID + "\t" + leaveManagementID + "\t" + departmentID + "\t" + dateFrom + "\t" + dateTo;
    }
    
  
    
}
