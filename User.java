
import java.util.ArrayList;

public class User {

    protected String userId;
    protected String password;
    protected String displayName;
    protected String name;
    protected String gender;
    protected Integer age;
    protected Integer date;
    protected ArrayList<Group> groupsCreated;
    protected Integer NumberOfGroup;
    protected ArrayList<String> hobby;
    protected String emailAddress;
    protected Boolean hasAgreedToTerms;
    protected Boolean profilesPublic;
    protected ArrayList<Group> favoriteGroups;
    protected ArrayList<Category> categoriesOfInterest = null;

    public User(String displayName)
    {
        this.displayName = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<String> getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList<String> hobby) {
        this.hobby = hobby;
    }

    public ArrayList<Group> getFavoriteGroups() {
        return favoriteGroups;
    }
}
