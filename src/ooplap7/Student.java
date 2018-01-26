package ooplap7;
//talking about student?
// 1.Student ID
// 2.Name
// 3.person ID
// 4.Address
// Access Control




public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //properties of Student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //Constructor
    //default constructor
    public Student (){}
    //create by own
    public Student (String id, String n, String pid, String a){
        //assige data to class properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.address = a;

    }
    //gatter and setter methods
    public String getId() {
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getpid() {
        return this.pid;
    }
    public void setpid(String pid){
        this.pid = pid;
    }
    public String address() {
        return this.address;
    }
    public void setaddress(String address){
        this.address = address;
    }
}//class
