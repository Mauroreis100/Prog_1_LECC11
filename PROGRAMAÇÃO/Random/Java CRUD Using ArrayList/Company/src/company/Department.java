package company;

public class Department {

    private String depName;
    private String depID;

    public Department() {
    }

    public Department(String depName, String depID) {
        this.depName = depName;
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

}
