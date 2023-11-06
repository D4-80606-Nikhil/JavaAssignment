package com.sunbeam.queOne;

public class Candidate {
	private int id;
     private String name;
     private String party;
     private int votes;
     
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getParty() {
		return party;
	}
	
	public final int getId() {
		return id;
	}
	
	public final void setParty(String party) {
		this.party = party;
	}
	public final int getVotes() {
		return votes;
	}
	public final void setVotes(int votes) {
		this.votes = votes;
	}
	public final void setId(int id) {
		this.id = id;
	}
	
	public Candidate(String name, String party, int votes,int id) {
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Candidate [id = "+id+", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}
	
     
     
}
