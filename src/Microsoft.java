import java.util.ArrayList;
import java.util.Arrays;

public class Microsoft {

    public static void main(String[] args) {

        Employee emp1 = new Employee();//calling for default Employee method.
        System.out.println(emp1.toString());//Employee{name='null', jobTitle='null', ID=0, salary=10000.0, company name=Microsoft}

        emp1.name = "Ersin";
        emp1.ID = 100;
        emp1.jobTitle = "Technical manager";
        emp1.salary = 120000;

        Employee emp2 = new Employee("Efe", "QA lead", 200, 110000);


        ArrayList<Employee> team = new ArrayList<>();
        team.add(emp1);
        team.add(emp2);
        team.add(new Employee("Esen", "SDET", 300, 95000));


        double maxSalary = Double.MIN_VALUE;

        for (Employee each : team) {

            if (each.salary > maxSalary) {
                maxSalary = each.salary;//120000.0
            }
        }
        System.out.println(maxSalary);
        for (Employee each : team) {
            if (each.name.equals("Esen")) {
                System.out.println(each.jobTitle);//SDET
            }
        }
            for (Employee each1 : team) {
                System.out.println(each1.name + " is working for " + each1.companyName);
                /*
Ersin is working for Microsoft
Efe is working for Microsoft
Esen is working for Microsoft

                 */

            }


            System.out.println("---------------------------------------------------------------------");


            Employee.companyName = "Tesla";

            for (Employee each2 : team) {
                System.out.println(each2.name + " is working for " + each2.companyName);
             /*
Ersin is working for Tesla
Efe is working for Tesla
Esen is working for Tesla
              */
            }

        }
    }


