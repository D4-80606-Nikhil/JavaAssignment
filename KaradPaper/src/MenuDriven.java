import java.util.List;
import java.util.Scanner;

public class MenuDriven {

	
	public static int menu() {
	   int choice=0;
	   
	   System.out.print("\n0. Exit");
	   System.out.print("\n1. Add new Batch");
	   System.out.print("\n2. Display all batches");
	   System.out.print("\n3. Add new Module");
	   System.out.print("\n4. Display Modules of given batch");
	   System.out.print("\n5. Delete module by name for given batch id");
	   System.out.print("\n6. Display modulewise total days for given batch id.");
	   System.out.print("\n7. Edit Module");
	   System.out.print("\n8. Display number of days for each course for each faculty");
	   Scanner scn = new Scanner(System.in);
	   choice = scn.nextInt();
	   
	   return choice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuChoice = 0;
		Scanner scn = new Scanner(System.in);
		BatchesDao batchdao = new BatchesDao();
		ModulesDao modDao = new ModulesDao();		
		while((menuChoice = menu())!=0) {
			switch(menuChoice) {
			case 1://Add new Batch
				System.out.println("Enter Id :");
				int id = scn.nextInt();
				System.out.println("Enter Name :");
				String name = scn.next();
				System.out.println("Enter Courses :");
				String courses = scn.next();
				
				Batches batch = new Batches(id,name,courses);
				
				 int count = batchdao.addBatch(batch);
				 
				 if(count != 0) {
					 System.out.println("Rows Affected : "+ count);
				 }else {
					 System.out.println("No Changes");
				 }
				
				break;
			case 2://display all batch	
				
				List<Batches> list = batchdao.displayBatch();
				list.forEach(e->System.out.println(e));
				
				break;
			case 3://Add new Module
				System.out.println("Enter Id : ");
				id = scn.nextInt();
				
				System.out.println("Enter Name : ");
				name = scn.next();
				
				System.out.println("Enter Date : (dd-mm-yyyy) ");
				String date = scn.next();
				
				System.out.println("Enter days : ");
				int days = scn.nextInt();
				
				System.out.println("Enter faculty : ");
				String faculty = scn.next();
				
				System.out.println("Enter batchid : ");
				int batchid = scn.nextInt();
				
				Modules mod = new Modules(id,name,date,days,faculty,batchid);
				count = modDao.addModules(mod);
				
				 if(count != 0) {
					 System.out.println("Rows Affected : "+ count);
				 }else {
					 System.out.println("No Changes");
				 }
				
				break;
			case 4://Display Modules of given Batch
				
				System.out.println("Enter Batch iD : ");
				batchid = scn.nextInt();
				
				List<Modules> batchList = modDao.DisplayModuleGivenBatch(batchid);
				batchList.forEach(e->System.out.println(e));
				
				break;
			case 5://Delete module by name for given batch id
				System.out.println("Enter Batch id :");
				id = scn.nextInt();
				
				System.out.println("Enter Name : ");
				name = scn.next();
				
				count = modDao.DeleteModuleByName(name, id);
				
				 if(count != 0) {
					 System.out.println("Rows Affected : "+ count);
				 }else {
					 System.out.println("No Changes");
				 }
				
				
				break;
			case 6://	Display modulewise total days for given batch id
				
				List<ResultModules> rmlist = modDao.DisplayTotaldaysgivenId();
				rmlist.forEach(System.out::println);
				
				break;
			case 7://Edit modules
				
				System.out.println("Enter Id : ");
				id = scn.nextInt();
				
				System.out.println("Enter Name : ");
				name = scn.next();
				
				System.out.println("Enter Date : (dd-mm-yyyy) ");
				date = scn.next();
				
				System.out.println("Enter days : ");
				days = scn.nextInt();
				
				System.out.println("Enter faculty : ");
				faculty = scn.next();
				
				System.out.println("Enter batchid : ");
				batchid = scn.nextInt();
				
				mod = new Modules(id,name,date,days,faculty,batchid);
				count = modDao.editmodule(mod);
				
				 if(count != 0) {
					 System.out.println("Rows Affected : "+ count);
				 }else {
					 System.out.println("No Changes");
				 }
				
				break;
			case 8://	 Display number of days for each course for each faculty
				
				List<FacultyTotal> ftlist = modDao.displaydatesforFaculty();
				ftlist.forEach(System.out::println);
				
				break;
			case 0://exit
				break;
			default:
				System.out.println("Wrong Choice");
				break;
				
			}
		}
		
		System.out.println("Bye Bye >");

	}

}
