package com.sunbeam.queOne;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.quetwo.*;

public class BookDataInputStream {
	
	public static int menu() {
		int choice;
		System.out.println("0. Exit\n");
		System.out.println("1. Add new Book in List.\n");
		System.out.println("2. Display all books.\n");
		System.out.println("3. Search a book with given isbn.\n");
		System.out.println("4. Delete a book at given index.\n");
		System.out.println("5. Delete a book with given isbn.\n");
		System.out.println("6. Sort books by isbn in asc order.\n");
		System.out.println("7. Sort books by price in desc order.\n");
		System.out.println("8. Reverse the list.\n");
		System.out.println("9. Delete a book with given name.\n");
		System.out.println("10. Save Book in a File Using Object\n");
		System.out.println("11. Load Book from File. Using Object\n");
		System.out.println("12. Load Book in a file using data stream\n");
		System.out.println("13. Load Book from file using data stream\n");
		Scanner scn = new Scanner(System.in);
		choice = scn.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuChoice ; int index; Book ref; 
		String isbn,name;
		ArrayList<Book> list = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		
		while((menuChoice= menu())!=0) {
			switch(menuChoice) {
			
			case 0://exit
				break;
			case 1://Add new Book in list
				Book book = new Book();
				book.accept();
				list.add(book);
				break;
			case 2://Display all books
//					System.out.println(list.toString());
					for(Book ele:list) {
						ele.display();
					}
					System.out.println("---------------");
				break;
			case 3://Search a book with given index
				System.out.println("Enter Index : ");
				index = scn.nextInt();
				list.get(index).display();
				break;
			case 4://Delete a book with given index
				System.out.println("Enter Index:");
				index = scn.nextInt();
				 ref = list.remove(index);
				 System.out.print("Deleted Item is : "+ref);
				break;
			case 5://Delete a book with given isbn
				ref = new Book();
				System.out.println("Enter ISBN: ");
				isbn = scn.next();
				ref.setIsbn(isbn);
				
				if(list.contains(ref)) {
					System.out.println("Book Removed : "+list.remove(ref));
				}else {
					System.out.println("No Book Found .");
				}
				
				break;
			case 6://Sort books by isbn in asc order
				list.sort(new SortingAscComparator());
				
				break;
			case 7://Sort books by isbn in desc order
				list.sort(new SortingDescComparator());
				break;
			case 8://Reverse the list.
				Collections.reverse(list);
				break;
			case 9: // Delete a book with given name
				System.out.println("Enter Name : ");
				name= scn.next();
				
				for(Book ele:list) {
					if(ele.getAuthorName().equals(name)) {
						System.out.println("Book Removed :"+ list.remove(ele));
					}
				}
				break;
				
			case 10: // save book in file
				try(FileOutputStream fout = new FileOutputStream("books.bin")){
					try(ObjectOutputStream out = new ObjectOutputStream(fout)){
						out.writeObject(list);
						System.out.println("Books added in File:)");
					}
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 11://Load the book from file
				try(FileInputStream fin = new FileInputStream("books.bin")){
					try(ObjectInputStream oin = new ObjectInputStream(fin)){
						List<Book> bookObj = (List<Book>)oin.readObject();
						
						System.out.println(bookObj);
					}
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				break;
				
			case 12://load the book in file via data stream
				try(FileInputStream fout = new FileInputStream("databooks.bin")){
					try(DataInputStream dis = new DataInputStream(fout)){
						while(true) {	
						Book bookObj = new Book();
						 bookObj.setIsbn(dis.readUTF());
						 bookObj.setPrice(dis.readDouble());
						 bookObj.setAuthorName(dis.readUTF());
						 bookObj.setQuantity(dis.readInt());
						 list.add(bookObj); 
						}
						
						
					}catch(EOFException eof) {
						//do nothing
					}
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 13: //load the book from file via data stream
				try(FileOutputStream fout = new FileOutputStream("databooks.bin")){
					try(DataOutputStream dos = new DataOutputStream(fout)){
						
						for(Book b:list) {
							dos.writeUTF(b.getIsbn());
							dos.writeDouble(b.getPrice());
							dos.writeUTF(b.getAuthorName());
							dos.write(b.getQuantity());
							System.out.println(b);
						}
						   
						
					}
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
				break;
				
			default:
				System.out.println("Wrong choice :) ");
				break;
			
			}
		}
	}
	
}
