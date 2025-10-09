package Aug_30;
import java.util.Scanner;

class NareshIT {
    static String headOffice;
    static String supportMail;
    static String branchName;
    
    public static void setInput(String headOffice, String supportMail, String branchName) {
        NareshIT.headOffice = headOffice;
        NareshIT.supportMail = supportMail;
        NareshIT.branchName = branchName;
    }

    public static void displayHeadOffice() {
        System.out.println("Head Office: " + headOffice);
    }

    public static void branchDetails() {
        System.out.println("Support mail: " + supportMail);
        System.out.println("Branch Name: " + branchName);
    }
}

public class Institude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NareshIT ad1 = new NareshIT();

        System.out.println("Enter Head Office Name: ");
        String headOffice = sc.nextLine();

        System.out.println("Enter Support mail: ");
        String supportMail = sc.nextLine();

        System.out.println("Enter Branch Name: ");
        String branchName = sc.nextLine();

        ad1.setInput(headOffice, supportMail, branchName);

        NareshIT.displayHeadOffice();
        NareshIT.branchDetails();

    }
}
