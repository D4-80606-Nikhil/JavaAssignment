package com.sunbeam.queOne;
import java.util.*;

public class Tester {
  
	public static int menu() {
		int choice;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("\n0. Exit");
		System.out.println("\n1. Add Candidates");
		System.out.println("\n2. Update Candidates");
		System.out.println("\n3. Delete by ID");
		System.out.println("\n4. Find by Id");
		System.out.println("\n5. Display All");
		System.out.println("\n6. Display all by Party");
		System.out.println("\n7. Display all Party Votes");
		choice = scn.nextInt();
		return choice ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int menuChoice;
		
		while((menuChoice = menu())!=0) {
			switch(menuChoice) {
			case 0://exit
				break;
			case 1://Add candidates
				System.out.print("\nEnter ID : ");
				int id = scn.nextInt();
				
				System.out.print("\nEnter Name : ");
				String name = scn.next();
				
				System.out.print("\nEnter Party : ");
				String party = scn.next();
				
				System.out.print("\nEnter Votes : ");
				int votes = scn.nextInt();
				
				Candidate cand = new Candidate(name,party,votes,id);
				
				try (CandidateDao candDao = new CandidateDao()){
				
				int count = candDao.save(cand);
				
				if(count != 0) {
					System.out.println("Rows Affected : "+count);
				}else {
					System.out.println("No Rows Affected");
				}
				}catch(Exception ex) {
				   ex.printStackTrace();	
				}
				
				break;
			case 2://update candidates
				System.out.print("\nEnter ID : ");
				id = scn.nextInt();
				
				System.out.print("\nEnter Name : ");
				name = scn.next();
				
				System.out.print("\nEnter Party : ");
				party = scn.next();
				
				System.out.print("\nEnter Votes : ");
				votes = scn.nextInt();
				
               cand = new Candidate(name,party,votes,id);
				
				try (CandidateDao candDao = new CandidateDao()){
				
				int count = candDao.update(cand);
				
				if(count != 0) {
					System.out.println("Rows Affected : "+count);
				}else {
					System.out.println("No Rows Affected");
				}
				}catch(Exception ex) {
				   ex.printStackTrace();	
				}
				
				break;
			case 3://delete by id
				System.out.println("Enter Id : ");
				id = scn.nextInt();
				try (CandidateDao cd = new CandidateDao()){
				
				int count = cd.deleteById(id);
				
				if(count != 0) {
					System.out.println("Rows Affected : "+count);
				}else {
					System.out.println("No Rows Affected");
				}
				
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
				break;
			case 4://find all by id
				System.out.println("Enter ID : ");
				id = scn.nextInt();
				
				try (CandidateDao cd = new CandidateDao()){
					
					Candidate candidate =  cd.findByID(id);
					System.out.println(candidate);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
				break;
			case 5://display all
				
				try(CandidateDao cd = new CandidateDao()) {
					
					List<Candidate> list = cd.findAll();
					
					list.forEach((t -> System.out.println(t)));
//					System.out.println(list);
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
				break;
			case 6://display all by party
			    System.out.println("Enter Party name : ");
			    party = scn.next();
                try (CandidateDao cd = new CandidateDao()){
                	
                	List<Candidate> list  = cd.findByParty(party);
                	
                	list.forEach((c -> System.out.println(c)));
                	
                }catch(Exception edx) {
                	edx.printStackTrace();
                }
				
				break;
			case 7://display all party votes
				
				try (CandidateDao cd = new CandidateDao()){
					List<PartyVotes> list = cd.getPartywiseVotes();
					list.forEach(c -> System.out.println(c));
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
				break;
			}	
		}
       
		System.out.println("Bye Bye.");
	}

}
