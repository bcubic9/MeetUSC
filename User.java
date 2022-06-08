
import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class User {

    protected UUID userId;
    protected String password;
    protected String username;
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int age;
    protected ArrayList<String> hobby; 
    protected Boolean hasAgreedToTerms;
    protected Boolean profilesPublic;
    protected ArrayList<Group> favoriteGroups; 
    protected ArrayList<Group> groupsJoined = new ArrayList<Group>();
    protected boolean adminPrivileges;
    protected ArrayList<Group> authorOf;
    private String emailAddress;

    public User(String userName, String password, String firstName, String lastName)
    {
        this.userId = UUID.randomUUID();
        this.username = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;


    }
  
    public User(UUID userID, String password, String userName, String firstName, String lastName, String gender, int age, String userNumOfGroups, ArrayList<String> hobby, String emailAddress, String userAgreedToTerms, 
            String userProfileIsPublic, ArrayList<Group> favoriteGroups, String userAdminPrivileges)
    {
        this.userId = userID;
        this.password = password;
        this.username =userName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
        this.emailAddress = emailAddress;
        this.hasAgreedToTerms = Boolean.parseBoolean(userAgreedToTerms);
        this.profilesPublic = Boolean.parseBoolean(userProfileIsPublic);
        this.favoriteGroups = favoriteGroups;
        this.adminPrivileges = Boolean.parseBoolean(userAdminPrivileges);
       
    }

    public User()
    {
        this.userId = UUID.randomUUID();
        this.username = "Guest";
        this.password = "Guest1";
        this.firstName = "John";
        this.lastName = "Smith";
        this.gender = "Other";
        this.age = 18;
        this.hobby = null;
        this.emailAddress = "guest@email.com";
        this.hasAgreedToTerms = true;
        this.profilesPublic = true;
        this.favoriteGroups = null;
        this.adminPrivileges = false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
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

    public String getUserPassword() {
        return this.password;
    }

    public void setUserPassword(String password) {
        this.password = password;
    }
    
    public String getUserGender() {
        return gender;
    }

    public void setUserGender(String gender) {
        this.gender = gender;
    }

    public int getUserAge() {
        return age;
    }

    public void setUserAge(int age) {
        this.age = age;
    }

    public ArrayList<Group> getGroups() {
        return groupsJoined;
    }

    public void addToGroupsJoined(Group group) {
        groupsJoined.add(group);
    }

    public boolean getHasAgreedToTerms() {
        return hasAgreedToTerms;
    }

    public boolean getProfileIsPublic() {
        return profilesPublic;
    }
    public boolean getAdminPrivileges() {
        return adminPrivileges;
    }
}
