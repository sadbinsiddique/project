package classes;
import java.util.*;
import interfaces.*;




public class patient implements iPatient

{
    public String pid;
    public String pname;
    public String disease;
    public String sex;
    public String admit_status;
    public int age;
    private Scanner input = new Scanner(System.in);
    public void new_patient()

    {
        System.out.print("\t\t\t\tid:-");
        pid = input.nextLine();

        System.out.print("\t\t\t\tname:-");
        pname = input.nextLine();

        System.out.print("\t\t\t\tdisease:-");
        disease = input.nextLine();

        System.out.print("\t\t\t\tsex:-");
        sex = input.nextLine();

        System.out.print("\t\t\t\tadmit_status:-");
        admit_status = input.nextLine();

        System.out.print("\t\t\t\tage:-");
        age = input.nextInt();

    }

    public void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
    /*public void removepatient() throws ConcurrentModificationException{
        String ides;
        Scanner af = new Scanner(System.in);
        System.out.println("Enter Phone");
        ides=af.next();
    }*/

    

        

        

}
