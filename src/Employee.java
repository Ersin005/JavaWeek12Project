public class Employee {


/*``Task 1:
Employee:
    attribute/fields/variables
name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields

 */


    public String name, jobTitle;
    public int ID;
    public double salary;
    public static String companyName;


    static {
     companyName="Microsoft";//company is fixed for every employee.
    }

    public Employee(){

        salary=10000;//every body will get 10000 fix.
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }





}
