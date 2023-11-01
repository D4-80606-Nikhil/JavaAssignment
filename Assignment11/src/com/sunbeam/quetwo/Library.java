package com.sunbeam.quetwo;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
   
   public static int menuDisplay(Scanner sc) {
//	   int choice
	   System.out.println("0. Exit\n"+
			   "1. Add new book in list.\n"
	   		+ "2. Display all books in forward order.\n"
	   		+ "3. Delete book of given id\n"
	   		+ "4. Check if book with given isbn is in list or not\n"
	   		+ "5. Delete all books in list\n"
	   		+ "6. Display number of books in list");
//	   Scanner sc = new Scanner(System.in);
	   return  sc.nextInt();
//	   return choice;
			   
   }
	
   public static void main(String[] args) {
	   int menuChoice ;
	   ArrayList<Book> books = new ArrayList<>();
	   Scanner scn = new Scanner(System.in);
	   do {
		   menuChoice = menuDisplay(new Scanner(System.in));
		   int id;
		   switch(menuChoice) {
		   case 0: //exit
			   break;
		   case 1: //Add new book in list
			   books.add(new Book().accept());
			   break;
		   case 2: //Display all books  in forward order
			   for(Book ele:books) {
				   ele.display();
			   }
			   break;
		   case 3://Delete book of given id
			   System.out.print("Enter the Book ID : ");
			   id = scn.nextInt();
			   for(Book obj :books) {
				   if(obj.getId() == id) {
					   books.remove(obj);
				   }
			   }
			  
			   break;
		   case 4://Check if book with given isbn is in list or not
			   System.out.print("Enter the Book ISBN : ");
			   Book b = new Book();
			   b.setIsbn(scn.next());
			   if(books.contains(b) ){
				   System.out.println("Book is present");
			   }else {
				   System.out.println("Not Available");
			   }
			   break;
		   case 5://Delete all books in list
			   books.clear();
			   break;
		   case 6://Display number of books in list
			   System.out.print(books.size());
			   break;
			default:
				System.out.println("You Entered the wrong choice ");
				break;  
		   }   
	   }while(menuChoice != 0);
   }
}
