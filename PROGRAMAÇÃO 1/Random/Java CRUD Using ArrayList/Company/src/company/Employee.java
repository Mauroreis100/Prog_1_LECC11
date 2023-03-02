package company;
public class Employee {
    private String empName;
    private Department empDep;
    private int empAge;
    private char empGender;

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getEmpDep() {
        return empDep;
    }

    public void setEmpDep(Department empDep) {
        this.empDep = empDep;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public char getEmpGender() {
        return empGender;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }
    
}
