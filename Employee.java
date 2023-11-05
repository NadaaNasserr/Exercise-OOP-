public class Employee {

    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, int salary){

    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary(){

         return this.salary = salary * 12;
    }
    public double raisedSalary(double percent){

       return this.salary = (percent * salary) /100 ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


