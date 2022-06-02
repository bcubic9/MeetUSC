
import java.util.ArrayList;

public class User {

    private String userId;
    private String password;
    private String displayName;
    private String name;
    private String gender;
    private Integer age;
    private Integer date;
    private ArrayList<Group> groupsCreated;
    private Integer NumberOfGroup;
    private ArrayList<String> hobby;
    private String emailAddress;
    private Boolean hasAgreedToTerms;
    private Boolean profilesPublic;
    private ArrayList<Group> favoriteGroups;
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

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public List<Group> getFavoriteGroups() {
        return favoriteGroups;
    }
}
