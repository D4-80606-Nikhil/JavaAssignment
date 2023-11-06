package com.sunbeam.queOne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable{
	private Connection con ;


	public CandidateDao() throws Exception{
		con = DbUtil.getConnections();
	}

	public void close() {
		try {
			if(con!=null)
				con.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public int save(Candidate c) throws Exception {
		String query = "Insert into candidates Values(default,?,?,?)";
		int returnCount=0;
		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			returnCount = stmt.executeUpdate();
		}
		return returnCount;
	}

	public int update(Candidate c) throws Exception {
		String query = "Update candidates SET name = ? , party = ? ,votes = ? where id = ?";
		int returnCount = 0;

		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			returnCount = stmt.executeUpdate();
		}

		return returnCount;
	}

	public int deleteById(int id)  throws Exception {
		int returnCount = 0;
		String query = "Delete from candidates where id = ?";

		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.setInt(1, id);
			returnCount = stmt.executeUpdate();
		}

		return returnCount;	   
	}

	public Candidate findByID(int id) throws Exception{
		String query = "Select * from candidates where id = ?";
		Candidate cand;
		try(PreparedStatement stmt = con.prepareStatement(query)){
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			cand = new Candidate();
			cand.setId(rs.getInt("id"));
			cand.setName(rs.getString("name"));
			cand.setParty(rs.getString("party"));
			cand.setVotes(rs.getInt("votes"));
		}

		return cand;
	}

	public List<Candidate> findAll() throws Exception{
		List<Candidate> list = new ArrayList<Candidate>();
		String query = "Select * from candidates";
		Candidate cand;
		try(PreparedStatement stmt = con.prepareStatement(query)){
			ResultSet rs = stmt.executeQuery();


			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");

				cand = new Candidate(name,party,votes,id);
				list.add(cand);
			}
		}
		return list;
	}


	public List<Candidate> findByParty(String party) throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, party);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(name, party, votes,id);
					list.add(c);
				}


			}  

		}
		return list;
	}
	
	public List<PartyVotes> getPartywiseVotes() throws Exception{
		String query = "Select party,sum(votes) as total from candidates group by party";
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		try(PreparedStatement stmt = con.prepareStatement(query)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int votes = rs.getInt("total");
					String party = rs.getString("party");
					
					PartyVotes pv = new PartyVotes(party,votes);
					
					list.add(pv);
					
				}
			}
		}
		
		return list;
	}
}
