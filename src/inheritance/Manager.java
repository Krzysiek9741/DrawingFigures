package inheritance;

import java.util.ArrayList;

public class Manager extends Employee {

    private ArrayList<Employee> subordinates = new ArrayList<Employee>();

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(ArrayList<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
        employee.setManager(this);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}
