package sdproject.com.client;

public class Student {
    String name;
    int id;
    String phone;
    String address;
    int age;
    String department;

    public Student(String name, int id, String phone, String address, int age, String department){
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.department = department;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printStudentInfo() {
        System.out.println(name + ":" + id + ":" + phone + ":" + address + ":" + age + ":" + department);
    }

    public static void main(String [] args){
        Student s = new Student("Amy", 1, "518-000-0000", "N/A", 18, "N/A");
        s.printStudentInfo();
    }
}
