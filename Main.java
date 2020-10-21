class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class PeopleStats {

}

class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }

}
