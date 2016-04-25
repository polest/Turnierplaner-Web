package Model;

public class UserData {
    public String username;
    String email;
    int age;
    String choice;

    public void setUsername( String value )
    {
        username = value;
    }

    public void setEmail( String value )
    {
        email = value;
    }

    public void setAge( int value )
    {
        age = value;
    }

    public void setChoice( String value )
    {
    	choice = value;
    }
    
    public String getUsername() { return username; }

    public String getEmail() { return email; }

    public int getAge() { return age; }
    
    public String getChoice() { return choice; }
}