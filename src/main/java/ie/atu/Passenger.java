package ie.atu;

//G00380316

import javax.lang.model.element.Name;

public class Passenger {
    private String phone,title,name,ID;
    private int age;

    public Passenger(String title, String name, String ID, String phone, int age){
        this.age = age;
        this.phone = phone;
        this.ID = ID;
        this.name = name;
        this.title = title;

        if(age<16){
            throw new IllegalArgumentException("Error Message, age less than 16");
        }

        if(ID.length()<10){
            throw new IllegalArgumentException("Error Message, minimum of 10 characters");
        }

        if(phone.length()<7){
            throw new IllegalArgumentException("Error Message, minimum of 7 characters");
        }

        if(name.length()<3){
            throw new IllegalArgumentException("Error Message, minimum of 3 characters");
        }

        if((title!="Mr")&&(title!="Mrs")&&(title!="Ms")){
            throw new IllegalArgumentException("Error Message,can only be Mr,Mrs or Ms");
        }
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
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
