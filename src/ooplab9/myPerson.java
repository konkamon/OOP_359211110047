package ooplab9;

public class myPerson {
    public static void main(String[] args) {
        Person person = new Person("BIW",22, new Address("133","Suratthani",
                "84190"),
                new Job("Business","9000"));
        System.out.println(person.toString());

        //edit data of object
        person.getJop().setSalary("1500");
        System.out.println(person.getJop().getPosition());
        System.out.println(person.getJop);


    }
}//class
