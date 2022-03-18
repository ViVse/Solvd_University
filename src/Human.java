abstract class Human {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String email;

    public Human(String name, String surname, int age)  {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return  phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name + " " + surname + ": " + age;
    }
}
