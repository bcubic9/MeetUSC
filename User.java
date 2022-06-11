
import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;

public class User {

    protected UUID userId;
    protected String password;
    protected String userName;
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int age;
    protected String email;
    protected ArrayList<String> hobby;
    protected Boolean hasAgreedToTerms;
    protected Boolean profilesPublic;
    protected boolean adminPrivileges;
    protected ArrayList<Category> categoriesOfInterest = new ArrayList<Category>();
    protected ArrayList<UUID> groupsJoined = new ArrayList<UUID>();
    protected ArrayList<UUID> authorOf; // groups created. professor wants arraylist of uuid so we can then access those
                                        // groups later.
    private String emailAddress;
    //create new user constructor
    public User(String userName, String password, String firstName, String lastName) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        //consider adding default values
        this.gender = "None Selected";
        this.age = 0;
        this.email = "None given";
        this.hobby = new ArrayList<String>();
        hasAgreedToTerms = false;
        profilesPublic = true;
        adminPrivileges = false;
        authorOf = new ArrayList<UUID>();
    }
    //connected to the datareader class
    public User (UUID userID, String userPass, String userUserName, String userFirstName, String userLastName, String userGender, int userAge, 
                 ArrayList<String> userHobbies, String userEmail, boolean userAgreedToTerms, boolean userProfileIsPublic,
                 ArrayList<Category> userCategoriesOfInterest, ArrayList<UUID> groupsJoined, boolean userAdminPrivileges, ArrayList<UUID> userAuthorOf) {
        this.userId = userID;
        this.password = userPass;
        this.userName = userUserName;
        this.firstName = userFirstName;
        this.lastName = userLastName;
        this.gender = userGender;
        this.age = userAge;
        this.hobby = userHobbies;
        this.email = userEmail;
        this.hasAgreedToTerms = userAgreedToTerms;
        this.profilesPublic = userProfileIsPublic;
        this.categoriesOfInterest = userCategoriesOfInterest;
        this.groupsJoined = groupsJoined;
        this.adminPrivileges = userAdminPrivileges;
        this.authorOf = userAuthorOf;
    }

    public User(UUID userID, String password, String userName, String firstName, String lastName, String gender,
            int age, String userNumOfGroups, ArrayList<String> hobby, String emailAddress, String userAgreedToTerms,
            String userProfileIsPublic, ArrayList<Group> favoriteGroups, String userAdminPrivileges, UUID authorOf) {
        this.userId = userID;
        this.password = password;
        this.userName = userName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
        this.emailAddress = emailAddress;
        this.hasAgreedToTerms = Boolean.parseBoolean(userAgreedToTerms);
        this.profilesPublic = Boolean.parseBoolean(userProfileIsPublic);
        this.adminPrivileges = Boolean.parseBoolean(userAdminPrivileges);
        this.authorOf.add(authorOf); // need to make this a uuid
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUserPassword() {
        return this.password;
    }

    public String getUserGender() {
        return this.gender;
    }

    public int getUserAge() {
        return this.age;
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

    public ArrayList<UUID> getGroupsCreated() {
        return authorOf;
    }

    public ArrayList<UUID> getJoinedGroups() {
        return groupsJoined;
    }

    public ArrayList<Category> getCategoriesOfInterest() {
        return categoriesOfInterest;
    }
}
