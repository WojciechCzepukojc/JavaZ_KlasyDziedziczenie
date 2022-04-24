package pl.sda.inheritance;



public abstract class Person {

    protected String name;

    protected String surname;

    protected String pesel;


    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        setPesel(pesel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }
    //walidacja wszystkich setterów
    // sprawdzenie pesel za pomocą regexp
    public void setPesel(String pesel) {
        if (pesel == null || pesel.length() != 11){
            throw new IllegalArgumentException("Pesel is invalid");
        }
            this.pesel = pesel;
        }
        public abstract void printYourself();
    }

