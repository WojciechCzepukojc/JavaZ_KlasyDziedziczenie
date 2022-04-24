package pl.sda.inheritance;

public class Student extends Person {

    private String department;


    public Student(String name, String surname, String pesel, String department) {
        super(name, surname, pesel);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void printYourself() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", pesel: " + pesel + ", Department: " + department);

    }
}
