package Users;

public class Bank_workers {
    private String name;
    private String Area_of_work;
    private String department;

    public Bank_workers(String name, String area_of_work, String department) {
        this.name = name;
        Area_of_work = area_of_work;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea_of_work() {
        return Area_of_work;
    }

    public void setArea_of_work(String area_of_work) {
        Area_of_work = area_of_work;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void Details(){
        System.out.println("Name:"+" "+name);
        System.out.println("Area_of_work:"+" "+Area_of_work);
        System.out.println("Department:"+" "+department);
    }
}
