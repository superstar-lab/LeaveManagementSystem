/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sabah;

/**
 *
 * @author yazan
 */
public class AdminUsers {
    
    private String usersID;
    private String name;
    private String surname;
    private String usernameEmail;
    private String contactDetails;
    private String password;

    public AdminUsers( String name, String surname, String uernameEmail, String contactDeatils, String password) {
        this.name = name;
        this.surname = surname;
        this.usernameEmail = uernameEmail;
        this.contactDetails = contactDeatils;
        this.password = password;
    }

    public String getUsersID() {
        return usersID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUernameEmail() {
        return usernameEmail;
    }

    public String getContactDeatils() {
        return contactDetails;
    }

    public String getPassword() {
        return password;
    }
    
    public String toString()
    {
        
        return name + "\t" + surname + "\t" + usernameEmail + "\t" + contactDetails + "\t" + password;
        
    }
    
}
