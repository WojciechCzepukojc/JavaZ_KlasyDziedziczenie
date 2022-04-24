package pl.sda.inheritance;

public class PersonMain {
    public static void main(String[] args) {

//        Person person = new Person("Jan", "Kowalski", "12589632541");     //nie można utwotrzyć obiektu klasy abstrakcyjnej
//
//        person.printYourself();

        Person student = new Student("Anna", "Nowak", "69875214563", "IT");

        student.printYourself();

//        person = student;
//        person.printYourself();
//
//        person.setSurname("Kowalska");

        student.printYourself();


    }
}
