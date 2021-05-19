import java.util.Scanner;

public class Staff {
    String staffId;
    String name;
    String phoneNo;
    Float salary;

    void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Staff ID : ");
        staffId = s.nextLine();
        System.out.print("Enter Name : ");
        name = s.nextLine();
        System.out.print("Enter Phone No : ");
        phoneNo = s.nextLine();
        System.out.print("Enter Salary : ");
        salary = s.nextFloat();
    }

    void putDetails() {
        System.out.println("Staff Details : ");
        System.out.println("Staff Id : " + staffId);
        System.out.println("Name     : " + name);
        System.out.println("Phone No : " + phoneNo);
        System.out.println("Salary   : " + salary);
    }
}

class Teaching extends Staff {
    String domain;
    String pub;

    Teaching() {
        getDetails();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter domain : ");
        domain = s.nextLine();
        System.out.print("Enter publications : ");
        pub = s.nextLine();
    }

    void displayTeachingStaffDetails() {
        putDetails();
        System.out.println("Staff Domain : " + domain);
        System.out.println("Staff has published : " + pub);
    }
}

class Technical extends Staff {
    String skills;

    Technical() {
        getDetails();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter skills : ");
        skills = s.nextLine();
    }

    void displayTechnicalStaffDetails() {
        System.out.println("Skills : " + skills);
    }
}

class StaffDemo {
    public static void main(String[] args) {
        System.out.println("<Enter the details of teaching staff>");
        Teaching teachingStaff = new Teaching();

        System.out.println("<Enter the details of technical staff>");
        Technical techncicalStaff = new Technical();

        System.out.println("\nDetails of staff members : ");
        System.out.println("\n<Teaching staff>");
        teachingStaff.displayTeachingStaffDetails();

        System.out.println("\n<Techincal staff>");
        techncicalStaff.displayTechnicalStaffDetails();
    }
}
