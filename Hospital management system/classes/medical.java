package classes;
import java.util.*;
import interfaces.*;


public class medical implements iMedical

{
    public String med_name;
    public String med_comp;
    public String exp_date;
    public int med_cost;
    public int count;
    private Scanner input;
    public void new_medi()
    {

        input = new Scanner(System.in);

        System.out.print("\t\t\t\tname:-");
        med_name = input.nextLine();

        System.out.print("\t\t\t\tcomp:-");
        med_comp = input.nextLine();

        System.out.print("\t\t\t\texp_date:-");
        exp_date = input.nextLine();

        System.out.print("\t\t\t\tcost:-");
        med_cost = input.nextInt();

        System.out.print("\t\t\t\tno of unit:-");
        count = input.nextInt();

    }

    public void find_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + " \t" + exp_date + "     \t" + med_cost);
    }
}