package classes;
import java.util.*;
import interfaces.*;

public class doctor implements iDoctor

{
    public String did;
    public String dname;
    public String specilist;
    public String appoint;
    public String doc_qual;
    public int droom;
    private Scanner input = new Scanner(System.in);
    
    public doctor()
    {

    }
    
    public doctor(String did,String dname,String specilist,String appoint, String doc_qual, int droom)
    {
        this.did=did;
        this.dname=dname;
        this.specilist=specilist;
        this.appoint=appoint;
        this.doc_qual=doc_qual;
        this.droom=droom;

    }

    public void setDid(String did)
    {
        this.did=did;
    }
    public String getDid()
    {
        return did;
    }

    
    public void new_doctor()
    {
        System.out.print("\t\t\t\tid:-");
        did = input.nextLine();

        System.out.print("\t\t\t\tname:-");
        dname = input.nextLine();

        System.out.print("\t\t\t\tspecilization:-");
        specilist = input.nextLine();

        System.out.print("\t\t\t\twork time:-");
        appoint = input.nextLine();

        System.out.print("\t\t\t\tqualification:-");
        doc_qual = input.nextLine();

        System.out.print("\t\t\t\troom no.:-");
        droom = input.nextInt();

    }


    public void doctor_info()

    {
        System.out.println(did + "\t" + dname + "    \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);

    }
    /*octor getdDoctor(String did)
     {
        doctor mm = null;
            for(int i = 0;i<d.length; i++){
                if(doctor[i] !=null){
                    if (doctor[i].getDid()==did){
                        mm = d[i];
                        break;
                        }
                    }
                }
            return mm;
        }*/

    

    

    public boolean contains(String string) {
        return false;
    }
}