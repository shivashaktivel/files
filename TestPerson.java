package Practice;
import java.util.Date;

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        long totalMilliseconds = elapsedTime;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        this.day = (int) (totalHours / 24) + 1;

        int totalDays = (int) (totalHours / 24);
        int year = 1970;

        while (totalDays >= (isLeapYear(year) ? 366 : 365)) {
            totalDays -= isLeapYear(year) ? 366 : 365;
            year++;
        }

        this.year = year;

        int[] daysUntilMonth = {
                0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334
        };

        if (isLeapYear(year)) {
            for (int i = 2; i < daysUntilMonth.length; i++) {
                daysUntilMonth[i]++;
            }
        }

        int i;
        for (i = 0; i < daysUntilMonth.length; i++) {
            if (daysUntilMonth[i] >= totalDays) {
                break;
            }
        }

        this.month = i;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Employee: " + super.toString();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Faculty: " + super.toString();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return "Staff: " + super.toString();
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john.doe@example.com");
        Student student = new Student("Alice Smith", "456 Elm St", "555-5678", "alice.smith@example.com", Student.JUNIOR);
        Employee employee = new Employee("Bob Johnson", "789 Oak St", "555-9101", "bob.johnson@example.com", "Room 101", 50000, new MyDate(2024, 4, 15));
        Faculty faculty = new Faculty("Jane Brown", "101 Pine St", "555-1212", "jane.brown@example.com", "Room 202", 60000, new MyDate(2022, 8, 30), "9am-5pm", "Professor");
        Staff staff = new Staff("Mike Wilson", "303 Cedar St", "555-3141", "mike.wilson@example.com", "Room 303", 40000, new MyDate(2023, 1, 10), "Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
