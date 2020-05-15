/**
 * DemoEmployees class
 * 
 * This class will create 3 new Employees: 1 Salaried Employee and 2 Hourly
 * Employees. Each employee will display all the attributes of the superclass
 * employee as well as the added attributes included within each specified
 * subclass.
 * 
 * @author sDantzler
 */
public class DemoEmployees {

   public static void main(String[] args) {

      SalariedEmployee se = new SalariedEmployee("Janet Day", "10/23/2004",
            "12 Way, Durham, NC, 23675", 75000);

      HourlyEmployee he1 = new HourlyEmployee("Jon Smith", "2/28/2010",
            "563 Ct, Raleigh, NC, 67032", 20, 30);

      HourlyEmployee he2 = new HourlyEmployee("Joan Long", "7/13/2020",
            "17 Pl, Columbia, MD, 23674", 25.50, 45.8);

      System.out.println("Salaried Employee Demo:");
      System.out.println();
      System.out.println(
            "Name        Hire Date    Address                     Salary");
      se.display();

      System.out.println();
      System.out.println("Hourly Employee Demo:");
      System.out.println();
      System.out.println(
            "Name        Hire Date   Address                    Pay/hr  Hours  Earnings Per Year");
      he1.display();
      he2.display();
   }// end main method

}// end DemoEmployees class
