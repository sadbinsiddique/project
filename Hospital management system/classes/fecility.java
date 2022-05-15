package classes;
import java.util.*;
import interfaces.*;


public class fecility implements iFecility

{
    public String fec_name;
    private Scanner input = new Scanner(System.in);
    public void add_feci()

    {
        System.out.print("\t\t\t\tfecility:-");
        fec_name = input.nextLine();
    }

    public void show_feci()
    {
        System.out.println(fec_name);
    }
}