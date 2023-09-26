import java.util.Scanner;

class Staff {
    private int staffId;
    private String name;
    private String phone;
    private double salary;

    public Staff(int staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public void display() {

        System.out.println("----------------------- Details of the Staff " + name + "-----------------------");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: $" + salary);
    }
}

class Teaching extends Staff {
    private String domain;
    private int publications;

    public Teaching(int staffId, String name, String phone, double salary, String domain, int publications) {
        super(staffId, name, phone, salary);
        this.domain = domain;
        this.publications = publications;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publications);
    }
}

class Technical extends Staff {
    private String skills;

    public Technical(int staffId, String name, String phone, double salary, String skills) {
        super(staffId, name, phone, salary);
        this.skills = skills;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Skills: " + skills);
    }
}

class Contract extends Staff {
    private int period;

    public Contract(int staffId, String name, String phone, double salary, int period) {
        super(staffId, name, phone, salary);
        this.period = period;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Contract Period (months): " + period);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Staff You Want to add : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println(
                    "---------------------- Enter Teaching Staff Details for Staff #" + i + " ----------------------");
            System.out.print("Staff ID: ");
            int staffId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Domain: ");
            String domain = scanner.nextLine();
            System.out.print("Publications: ");
            int publications = scanner.nextInt();

            Teaching teachingStaff = new Teaching(staffId, name, phone, salary, domain, publications);
            System.out.println("Teaching Staff Details:");
            System.out.println();
            teachingStaff.display();
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(
                    "---------------------- Enter Technical Staff Details for Staff #" + i + " ----------------------");
            System.out.print("Staff ID: ");
            int staffId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Skills: ");
            String skills = scanner.nextLine();

            Technical technicalStaff = new Technical(staffId, name, phone, salary, skills);
            System.out.println("Technical Staff Details:");
            System.out.println();
            technicalStaff.display();

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(
                    "---------------------- Enter Contract Staff Details for Staff #" + i + " ----------------------");
            System.out.print("Staff ID: ");
            int staffId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Contract Period (months): ");
            int period = scanner.nextInt();

            Contract contractStaff = new Contract(staffId, name, phone, salary, period);
            System.out.println("Contract Staff Details:");
            System.out.println();
            contractStaff.display();
            System.out.println();
        }

        scanner.close();
    }
}

