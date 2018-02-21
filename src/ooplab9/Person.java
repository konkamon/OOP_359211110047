package ooplab9;

public class Person {
    private String name;
    private String age;
    private Address Address;
    private Jop Jop;
    //constructor

    public Person(String name, String age, ooplab9.Address address, Jop jop) {
        this.name = name;
        this.age = age;
        Address = address;
        Jop = jop;
    }
    //gatter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ooplab9.Address getAddress() {
        return Address;
    }

    public void setAddress(ooplab9.Address address) {
        Address = address;
    }

    public Jop getJop() {
        return Jop;
    }

    public void setJop(Jop jop) {
        Jop = jop;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Address=" + Address +
                ", Jop=" + Jop +
                '}';
    }
}//class