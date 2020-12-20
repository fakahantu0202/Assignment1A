/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fakhruddin
 */
public class peserta {
    String firstName;
    String lastName;
       

public peserta(String firstName,String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    
}
public void setFirstName(String firstName){
    this.firstName = firstName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}
public String getFirstName(){
    return firstName;
}
public String getLastName(){
    return lastName;
}
public String toString(){
    return firstName + lastName;
}
}