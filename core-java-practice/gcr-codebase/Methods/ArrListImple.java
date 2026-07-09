//create a array list and add objects in it emp{ integer empid, string empname, double empsalary} and print the array list
import java.util.ArrayList;

public class ArrListImple {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ankit", 50000.0));
        list.add(new Employee(2, "Amit", 60000.0));
        list.add(new Employee(3, "Akhilesh", 70000.0));

        System.out.println("Array List: " + list);
    }
    
}

class Employee {
    int empid;
    String empname;
    double empsalary;

    Employee(int empid, String empname, double empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "empid=" + empid + ", empname='" + empname + '\'' + ", empsalary=" + empsalary + '}';
    }
}
