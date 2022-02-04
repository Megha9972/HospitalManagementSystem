package Hospital;

import java.util.Calendar;
import java.util.Scanner;

class Staff{
	String sId,sName,desg;
	int Salary;

    void new_Staff(){
	 Scanner input=new Scanner(System.in);
	 System.out.println("sId:-");
	 sId=input.nextLine();
	 System.out.println("sName:-");
	 sName=input.nextLine();
	 System.out.println("designation:-");
	 desg=input.nextLine();
	 System.out.println("Salary:-");
	 Salary=input.nextInt();
 }
    void staff_info()
    {
        System.out.println(sId + "\t" + sName + "\t" + desg + "\t" + Salary);
    
}
}

class Doctor{
	String dId,DName,specialist,doc_qual;
	int DRoom;
	
	void new_Doctor(){
		Scanner input=new Scanner(System.in);
		System.out.println("dId:-");
		dId=input.nextLine();
		System.out.println("DName:-");
		DName=input.nextLine();
		System.out.println("specialist:-");
		specialist=input.nextLine();
		System.out.println("doc_qual:-");
		doc_qual=input.nextLine();
		System.out.println("DRoom:-");
		DRoom=input.nextInt();
	}
	 void doctor_info()
	    {
	        System.out.println(dId + "\t" + DName + "  \t" + specialist + "  \t" + doc_qual + "  \t" + DRoom);
	    }
}

class Patient
{
	String pid, pname, disease, admit_status;
    int age;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("pid:-");
        pid = input.nextLine();
        System.out.print("pname:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    void patient_info()
    {
        System.out.println(pid + "\t" + pname + "   \t" + disease + "    \t" + admit_status+ "    \t" + age);
    }
}
class medicine{
String med_name, med_comp, exp_date;
int med_cost;
void new_medi()
{
    Scanner input = new Scanner(System.in);
    System.out.print("med_name:-");
    med_name = input.nextLine();
    System.out.print("med_comp:-");
    med_comp = input.nextLine();
    System.out.print("exp_date:-");
    exp_date = input.nextLine();
    System.out.print("med_cost:-");
    med_cost = input.nextInt();
    
}
void find_medi()
{
    System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
}
}

public class HospitalMngmt 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
     
     Calendar calendar=Calendar.getInstance();
     int count1=4, count2=4, count3=4, count4=4;
     System.out.println("\n------- ****------*****--------****-------------");
     System.out.println("   Wlcm To Hsptl Mngmt System Prjct");
     System.out.println("------*****-------******--------*****------------");
     
   System.out.print("\n Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
   System.out.println("\t\t\t Time: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
     
     Staff[] s=new Staff[20]; 
     Doctor[] d=new Doctor[25];
     Patient[] p=new Patient[50];
     medicine[] m=new medicine[100];
     
     for(int i=0;i<20;i++)
    	 s[i]=new Staff();
     
     for(int i=0;i<25;i++)
        d[i]=new Doctor();
     
     for(int i=0;i<50;i++)
        p[i]=new Patient();
     
     for(int i=0;i<100;i++)
       m[i]=new medicine();
     
     s[0].sId="25";
     s[0].sName="Vijay";
     s[0].desg="Worker";
     s[0].Salary=5000;
     s[1].sId="25";
     s[1].sName="ajay";
     s[1].desg="Nurse";
     s[1].Salary=10000;
     s[2].sId="25";
     s[2].sName="Prasanna";
     s[2].desg="Worker";
     s[2].Salary=7000;
     s[3].sId="25";
     s[3].sName="Jambi";
     s[3].desg="StaffNurse";
     s[3].Salary=15000;
     
     d[0].dId="50";
     d[0].DName="Shivaram";
     d[0].specialist="Physician";
     d[0].doc_qual="MBBS/MD";
     d[0].DRoom=5;
     d[1].dId="70";
     d[1].DName="Shankar";
     d[1].specialist="Dermatalogist";
     d[1].doc_qual="BDA";
     d[1].DRoom=10; 
     d[2].dId="80";
     d[2].DName="Shravya";
     d[2].specialist="Orthopedician";
     d[2].doc_qual="MBBS/MD";
     d[2].DRoom=15;
     d[3].dId="50";
     d[3].DName="Pranitha";
     d[3].specialist="Gynacologist";
     d[3].doc_qual="MBBS";
     d[3].DRoom=25;
     
     p[0].pid="75";
     p[0].pname="Anand";
     p[0].disease="Fever";
     p[0].admit_status="y";
     p[0].age=30;
     p[1].pid="65";
     p[1].pname="Pankaj";
     p[1].disease="Cancer";
     p[1].admit_status="y";
     p[1].age=25;
     p[2].pid="85";
     p[2].pname="Paaru";
     p[2].disease="Malaria";
     p[2].admit_status="N";
     p[2].age=40;
     p[3].pid="15";
     p[3].pname="Shanti";
     p[3].disease="Chlorea";
     p[3].admit_status="y";
     p[3].age=50;
     
     m[0].med_name = "Corex";
     m[0].med_comp = "Cino pvt";
     m[0].exp_date = "9-5-21";
     m[0].med_cost = 55;
  
     m[1].med_name = "Nytra";
     m[1].med_comp = "Ace pvt";
     m[1].exp_date = "4-4-22";
     m[1].med_cost = 500;
    
     m[2].med_name = "Brufa";
     m[2].med_comp = "Reckitt";
     m[2].exp_date = "12-7-22";
     m[2].med_cost = 50;
 
     m[3].med_name = "Pride";
     m[3].med_comp = "DDF pvt";
     m[3].exp_date = "12-4-22";
     m[3].med_cost = 1100;
     
     Scanner input = new Scanner(System.in);
     int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1;
     while (status == 1)
     {
    	 System.out.println("\n -----------******---------------*******------------------");
         System.out.println("                        ****MAIN MENU****");
         System.out.println("-----------******---------------------*******--------------");
         System.out.println("1.Doctors  2. Patients  3.Medicines  4. Staff ");
         System.out.println("----------------------*****--------------------*****----------");
         choice = input.nextInt();
         switch (choice)
         {
             case 1:
                 {
                  System.out.println("----------------******---------------*******----------");
                  System.out.println("                     ***DOCTOR SECTION***");
                  System.out.println("-----------------******--------------------******------");
                     s1 = 1;
                     while (s1 == 1)
                     {
                         System.out.println("1.Add New Entry \n2.Existing Doctors List");
                         c1 = input.nextInt();
                         switch (c1)
                         {
                             case 1:
                                 {
                                     d[count1].new_Doctor();count1++;
                                     break;
                                 }
                             case 2:
                                 {
                                     System.out.println("---------------******--------------*****------------------------");
                                     System.out.println("id \t Name   \t Specilist   \t Qualification \t Room No");
                                     System.out.println("----------------******-------------******------------------------");
                                     for (j = 0; j < count1; j++)
                                     {
                                         d[j].doctor_info();
                                     }
                                     break;
                                 }
                         }
                         System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                         s1 = input.nextInt();
                     }
                     break;
                 }
             case 2:
                 {
                     System.out.println("----------------------*****-----------------------******----------");
                     System.out.println("                     ***PATIENT SECTION***");
                     System.out.println("------------------------*****---------------------*****---------");
                     s2 = 1;
                     while (s2 == 1)
                     {
                         System.out.println("1.Add New Entry\n2.Existing Patients List");
                         c1 = input.nextInt();
                         switch (c1)
                         {
                             case 1:
                                 {
                                     p[count2].new_patient();count2++;
                                     break;
                                 }
                             case 2:
                                 {
                                     System.out.println("-----------------*****--------------------------****----------");
                                     System.out.println("id \t Name \t Disease \t Admit Status \t Age");
                                     System.out.println("--------------------*****--------------------*****------------");
                                     for (j = 0; j < count2; j++) {
                                         p[j].patient_info();
                                     }
                                     break;
                                 }
                         }
                         System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                         s2 = input.nextInt();
                     }
                     break;
                 }
             case 3:
                 {
                     s3 = 1;
                     System.out.println("---------------------------------*****-------------------*****-------");
                     System.out.println("                    ****MEDICINE SECTION****");
                     System.out.println("-------------------------------*****------------------------*****-------");
                     while (s3 == 1)
                     {
                         System.out.println("1. Add New Entry\n2. Existing Medicines List");
                         c1 = input.nextInt();
                         switch (c1)
                         {
                             case 1:
                                 {
                                     m[count3].new_medi();count3++;
                                     break;
                                 }
                             case 2:
                                 {
                                     System.out.println("--------------------------*****-----------------------*****---------");
                                     System.out.println("Name \t Company \t Expiry Date \t Cost");
                                     System.out.println("-------------------------------*****------------------*****-----------");
                                     for (j = 0; j < count3; j++) {
                                         m[j].find_medi();
                                     }
                                     break;
                                 }
                         }
                         System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                         s3 = input.nextInt();
                     }
                     break;
                 }
             
             
             case 4:
                 {
                     s4 = 1;
                     System.out.println("--------------------*****-----------*****----------");
                     System.out.println("               ***STAFF SECTION**s*");
                     System.out.println("-------------------------*****-------------******-----------");
                     while (s4 == 1)
                     {
                         System.out.println("1. Add New Entry ");
                         c1 = input.nextInt();
                         switch (c1)
                         {
                             case 1:
                                 {
                                     s[count4].new_Staff();count4++;
                                     break;
                                 }
                                
                     }
                     System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                     s4 = input.nextInt();
                 }
                 break;
             }
                            
                          
             default:
                 {
                     System.out.println(" You Have Enter Wrong Choice!!!");
                 }
         
         System.out.println("\nReturn to MAIN MENU Press 1");
         status = input.nextInt();
         }
         
     }
	
	}
}

 




