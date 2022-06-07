
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
    protected Date date;
    protected String hobby; //need to change it to String[] or arraylist<String> later
    protected String emailAddress;
    protected Boolean hasAgreedToTerms;
    protected Boolean profilesPublic;
    protected String favoriteGroups; //needs to be changed back to ArrayList<Group> data type later.
    protected String categoriesOfInterest; //needs to be changed back to ArrayList<Group> data type later.
    protected boolean adminPrivileges;
    protected ArrayList<Group> authorOf;

    //May need to change the userID to UUIDMaker.
    public User(UUID userID, String userPass, String userDisplayName, String userName, String userGender, String userAge, 
            String userCreationDate, String userNumOfGroups, String userHobbies, String userEmail, String userAgreedToTerms, 
            String userProfileIsPublic, String userFavGroups, String userCategoriesOfInterest, String userAdminPrivileges,
            String userAuthorPrivileges)
    {
        this.userId = userID;
        this.password = userPass;
        this.displayName = userDisplayName;
        this.name = userName;
        this.gender = userGender;
        this.age = Integer.parseInt(userAge);
        this.dateCreated = userCreationDate;
        //need to fix this one. will alter from ArrayList<Group> to integer for now
        this.numGroupsCreated = Integer.parseInt(userNumOfGroups);
        this.hobby = userHobbies;
        this.emailAddress = userEmail;
        this.hasAgreedToTerms = Boolean.parseBoolean(userAgreedToTerms);
        this.profilesPublic = Boolean.parseBoolean(userProfileIsPublic);
        this.favoriteGroups = userCategoriesOfInterest;
        this.categoriesOfInterest = userCategoriesOfInterest;
        this.adminPrivileges = Boolean.parseBoolean(userAdminPrivileges);
        this.authorPrivileges = Boolean.parseBoolean(userAuthorPrivileges);
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
