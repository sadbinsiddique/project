package classes;
import java.util.*;
import interfaces.*;

public class staff implements iStaff
{
    public String sid;
    public String sname;
    public String desg;
    public String sex;
    public int salary;
    private Scanner input = new Scanner(System.in);


    public void new_staff()
    {
        System.out.print("\t\t\t\tid:-");
        sid = input.nextLine();

        System.out.print("\t\t\t\tname:-");
        sname = input.nextLine();

        System.out.print("\t\t\t\tdesigination:-");
        desg = input.nextLine();

        System.out.print("\t\t\t\tsex:-");
        sex = input.nextLine();

        System.out.print("\t\t\t\tsalary:-");
        salary = input.nextInt();
    }



    public void staff_info()

    {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t\t" + salary +"\t\t" + desg );
    }

}