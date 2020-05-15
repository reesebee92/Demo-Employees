/**
 * Employee class
 * 
 * This class will generate the employee data including name, date and address.
 * There are 2 available constructors as well as getter, and setter methods for
 * every instance variable available. A display message is provided to print
 * employee details.
 * 
 * @author sDantzler
 */

public class Employee {
   // instance variables
   private String name;
   private String date;
   private String address;

   // default Employee constructor
   public Employee() {
      name = "None";
      date = "None";
      address = "None";
   }

   // parameterized Employee constructor
   public Employee(String n, String d, String a) {
      name = n;
      date = d;
      address = a;
   }

   /**
    * getName
    * 
    * This method will return the name
    */
   public String getName() {
      return name;
   }// end getName method

   /**
    * setName
    * 
    * This method will set the name
    * 
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   }// end setName method

   /**
    * getDate
    * 
    * This method will return the date
    */
   public String getDate() {
      return date;
   }// end getDate method

   /**
    * setDate
    * 
    * This method will set the date
    * 
    * @param date
    */
   public void setDate(String date) {
      this.date = date;
   }// end setDate method

   /**
    * getAddress
    * 
    * This method will return the address
    */
   public String getAddress() {
      return address;
   }// end getAddress method

   /**
    * setAddress
    * 
    * This method will set the address
    * 
    * @param address
    */
   public void setAddress(String address) {
      this.address = address;
   }// end setAddress method

   /**
    * display
    * 
    * This method will print the employee information
    */
   public void display() {
      System.out.print(name + "   " + date + "   " + address);
   }// end display method

}// end class Employee
