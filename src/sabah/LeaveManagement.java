/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sabah;

/**
 *
 * @author yazan
 */
public class LeaveManagement {
     
    private int leaveManagmentID;
    private String leaveName;
    private int durationMin;
    private int durationMax;

    public LeaveManagement(int leaveManagmentID, String leaveName, int durationMin, int durationMax) {
        this.leaveManagmentID = leaveManagmentID;
        this.leaveName = leaveName;
        this.durationMin = durationMin;
        this.durationMax = durationMax;
    }

    public int getLeaveManagmentID() {
        return leaveManagmentID;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public int getDurationMax() {
        return durationMax;
    }
    
    public String toString()
    {
     return leaveName + " " + durationMin + " " + durationMax;
    }
    
}
