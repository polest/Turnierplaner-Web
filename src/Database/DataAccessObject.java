package Database;

import java.util.List;

import Model.Tournament;
import Model.TournamentType;
import Model.User;

public interface DataAccessObject {

	boolean createUser(User user);
	boolean createEditor(String userName);
	boolean createTournament(String name);
	User getUserByUserName(String userName);
	User getUserByEmail(String userEmail);
	String  getUserPassword(String email);
	List <Tournament> getTournaments(String userName);
	Tournament getTournament(String name);
	boolean updateTournament(int countTeams, List<String> teams, TournamentType ttype);
	boolean updateUser(User user);
	boolean deleteUserByUserName(String userName);
	boolean deleteUserByEmail(String userEmail);
	boolean deleteEditorByUserName(String userName);
	boolean deleteEditorByEmail(String userEmail);
	boolean deleteTournament(String name);
	

}
