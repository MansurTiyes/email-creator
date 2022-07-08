import java.util.Scanner;

public class Email {
    private String firstName; // John
    private String lastName; // Smith
    private String password; // Your password is: ANJI*5J1NE
    private String department;
    private String email; // john.smith@sales.aecompany.com
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alernateEmail;
    private String companySuffix = "aecompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength); // 10
        System.out.println("Your password is: " + this.password); // Your password is: ANJI*5J1NE

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    /**       New workerJohn. Department Codes:
     *        1 for Sales
     *        2 for Development
     *        3 for Accounting
     *        0 for none
     *        Enter the department code:
     *        ?
     *       Department: ?
     */
    private String setDepartment() {

        System.out.println("New worker" + firstName + ". Department Codes:\n1 for Sales\n2 for Development \n3 for Accounting \n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice;
        switch (depChoice = in.nextInt()) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            default:
                return "";
        }
    }

    private String randomPassword(int length) { // ANJI*5J1NE
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) { // 10
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlernateEmail(String altEmail) {
        this.alernateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlernateEmail() {
        return alernateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}