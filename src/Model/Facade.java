package Model;

import java.util.List;


public interface Facade {

	boolean registerUser(User user);
	boolean login(User user);
	boolean logout(User user);
	boolean createTournament(String tournamenName);
	boolean editTournament(int countTeams, List<String> teams, TournamentType ttype);
	boolean addEditor(String userName);
	boolean deleteEditor(String userName);
	boolean deleteTournament(String name);
	
}
