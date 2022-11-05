public class Passenger {
    private String title,name,ID;
    private int phone, age;

    public Passenger(String title, String name, String ID, int phone, int age){

    this.age = age;
    this.phone = phone;
    this.ID = ID;
    this.name = name;
    this.title = title;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
