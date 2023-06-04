package company;
import java.util.*;
public class Company {
    ArrayList<Employee> emplist = new ArrayList<>();
    ArrayList<Department> deplist = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Company com = new Company();
        while (true) {            
         System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡይብህንም");
         System.out.println("ጅ   Press [1] for Register   ጅ");
         System.out.println("ጅ   Press [2] for Display    ጅ");
         System.out.println("ጅ   Press [3] for Search     ጅ");
         System.out.println("ጅ   Press [0] for Exit       ጅ");
         System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡይብህንም");
         int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter 1 to Register Department");
                    System.out.println("Enter 2 to Register Employee");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            com.registerDep();
                            break;
                        case 2:
                            com.registerEmp();
                            break;
                        default:
                            System.out.println("Invalid");
                    }
                    break;
                case 2:
                    System.out.println("Enter 1 to View Department");
                    System.out.println("Enter 2 to View Employee");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            com.listDep();
                            break;
                        case 2:
                            com.listEmp();
                            break;
                        default:
                         System.out.println("Invalid");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    public void registerEmp(){
        Employee emp = new Employee();
        System.out.println("Enter name");
        emp.setEmpName(input.next());
        System.out.println("Select Department");
        listDep();
        emp.setEmpDep(deplist.get(input.nextInt()-1));
        System.out.println("Enter Age");
        emp.setEmpAge(input.nextInt());
        System.out.println("Enter gender");
        emp.setEmpGender(input.next().charAt(0));
        emplist.add(emp);
    }
    public void registerDep(){
        Department dep = new Department();
        System.out.println("Enter Name");
        dep.setDepName(input.next());
        System.out.println("Enter ID");
        dep.setDepID(input.next());
        deplist.add(dep);
    }

    public void listEmp(){
        int index = 1;
        for (Employee employee : emplist) {
            System.out.println(index+". Name: "+employee.getEmpName()+" Department: "+employee.getEmpDep().getDepName()+" Age: "+employee.getEmpAge());
            index++;
        }
 
    }
    public void listDep(){
       int index = 1;
        for (Department department : deplist) {
            System.out.println(index+". Name: "+department.getDepName()+" ID: "+department.getDepID());
            index++;
        }
    }
}
