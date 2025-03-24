package lesson_8;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, long salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println("Full Name: "+ fullName);
        System.out.println("Age: "+age);
        System.out.println("Position: "+position);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);
        System.out.println("Salary: "+salary);
    }

    public int getAge() {
        return age;
    }
}
