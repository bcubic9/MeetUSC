
import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class User {

    protected UUID userId;
    protected String password;
    protected String userName;
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int age;
    protected Date dateCreated;
    protected ArrayList<String> hobby; 
    protected Boolean hasAgreedToTerms;
    protected Boolean profilesPublic;
    protected ArrayList<Group> favoriteGroups; 
    protected boolean adminPrivileges;
    protected ArrayList<Group> authorOf;
    private String emailAddress;

  
    public User(UUID userID, String password, String userName, String firstName, String lastName, String gender, int age, 
            Date dateCreated, String userNumOfGroups, ArrayList<String> hobby, String emailAddress, String userAgreedToTerms, 
            String userProfileIsPublic, ArrayList<Group> favoriteGroups, String userAdminPrivileges)
    {
        this.userId = userID;
        this.password = password;
        this.userName =userName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.dateCreated = dateCreated;
        this.hobby = hobby;
        this.emailAddress = emailAddress;
        this.hasAgreedToTerms = Boolean.parseBoolean(userAgreedToTerms);
        this.profilesPublic = Boolean.parseBoolean(userProfileIsPublic);
        this.favoriteGroups = favoriteGroups;
        this.adminPrivileges = Boolean.parseBoolean(userAdminPrivileges);
       
    }

    public User(String userName)
    {

    }

    public User(String username, String password)
    {
        
    }

    public User(String userName, String password, String id)
    {
        /**
         * Ignore parameters, to be modified by Denise.
         * This is the guest constructor for User.
         * It should be a default setting that does not change.
         * I will call this in the UI under the .guestlogin() method which will automatically pass these credentials in.
         */
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
        return null;
    }

    public void setHobby(ArrayList<String> hobby) {
        //this.hobby = hobby;
    }

    public ArrayList<Group> getFavoriteGroups() {
        return null;
    }

    public String getUserPassword() {
        return this.password;
    }
    
    public String getUserGender() {
        return this.gender;
    }

    public int getUserAge() {
        return this.age;
    }

    public String getUserCreationDate() {
        return dateCreated;
    }

    public int getNumberOfGroups() {
        return numGroupsCreated;
    }

    public boolean getHasAgreedToTerms() {
        return false;
    }

    public boolean getProfileIsPublic() {
        return false;
    }
    public boolean getAdminPrivileges() {
        return false;
    }
    public boolean getAuthorPrivileges() {
        return false;
    }

    public String getCategoriesOfInterest() {
        return this.categoriesOfInterest;
    }
}
