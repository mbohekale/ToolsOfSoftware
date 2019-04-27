package hotelTesting;
import java.io.Serializable;
/**
 * This class implements the user that can use as a template to get the various user
 * @author mboh ekale
 *
 */

public class User implements Serializable {
	private int id;
    private String name;
    private String password;
    /**
     * This constucts a user interface for id,name and password
     * @param id
     * @param name
     * @param password
     */
    public User(int id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public boolean authentification(int id, String password)
    {
        return this.id == id && this.password.equals(password);
    }
    
    public String toString()
    {
       return "Id: " + getId() + " Name: " + getName();
    }

}
