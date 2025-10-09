package Aug_25;

public class FamilyName {
    static String address;
    String name;
    int age;
    String qualification;
    static String collegeName="Jharkhand Rai University";

    public static void familyDetails(){
        FamilyName.address = "Manikbad";

        // Object 1
        FamilyName f1 = new FamilyName();
        f1.name = "Sonu";
        f1.age = 25;
        f1.qualification = "MCA";

        // Object 2
        FamilyName f2 = new FamilyName();
        f2.name = "Monu";
        f2.age = 30;
        f2.qualification = "B.Tech";

        System.out.println("Address: " + FamilyName.address);
        System.out.println("Name: " + f1.name);
        System.out.println("Age: " + f1.age);
        System.out.println("Qualification: " + f1.qualification);
        System.out.println("College Name: "+FamilyName.collegeName);

        System.out.println("-----------------------------------------------------");

        System.out.println("Address: " + FamilyName.address);
        System.out.println("Name: " + f2.name);
        System.out.println("Age: " + f2.age);
        System.out.println("Qualification: " + f2.qualification);
        System.out.println("College Name: "+FamilyName.collegeName);
    }

    public static void main(String []args) {
        familyDetails();
    }
}
