package classes;
import java.util.*;
import interfaces.iLab;


public class lab  implements iLab

{
    public String fecility;
    public int lab_cost;
    private Scanner input = new Scanner(System.in);
    public void new_feci()
    {
        System.out.print("\t\t\t\tfecility:-");
        fecility = input.nextLine();

        System.out.print("\t\t\t\tcost:-");
        lab_cost = input.nextInt();

    }

    public void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);

    }
}