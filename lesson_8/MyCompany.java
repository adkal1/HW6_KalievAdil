package lesson_8;

public class MyCompany {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Adil Kaliev", "manager", "ad.kaliev@mail.com", "+77021111111", 50000, 30);
        employees[1] = new Employee("Tim Higa", "analyst", "tim.higa@mail.com", "+77021110011", 50000, 31);
        employees[2] = new Employee("Alex Asar", "engineer", "a.asar@mail.com", "+77021111000", 90000, 43);
        employees[3] = new Employee("Kevin Olast", "developer", "k.olast@mail.com", "+79021111111", 120000, 40);
        employees[4] = new Employee("Mark Alvost", "QA-specialist", "m.alvostv@mail.com", "+79031111111", 90000, 47);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printEmployee();
            }

        }
    }


}
