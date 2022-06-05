
import java.util.ArrayList;

public class User {

    protected String userId;
    protected String password;
    protected String displayName;
    protected String name;
    protected String gender;
    protected int age;
    protected String date;
    protected int numGroupsCreated;
    //protected ArrayList<Group> groupsCreated; //need to fix this one. need to add it into the json data or take this out
    protected String hobby; //need to change it to String[] or arraylist<String> later
    protected String emailAddress;
    protected Boolean hasAgreedToTerms;
    protected Boolean profilesPublic;
    protected String favoriteGroups; //needs to be changed back to ArrayList<Group> data type later.
    protected String categoriesOfInterest; //needs to be changed back to ArrayList<Group> data type later.
    protected boolean adminPrivileges;
    protected boolean authorPrivileges;

    //May need to change the userID to UUIDMaker.
    public User(String userID, String userPass, String userDisplayName, String userName, String userGender, String userAge, 
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
        this.date = userCreationDate;
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

    public User()
    {

    }

    public User(String username, String password)
    {
    
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
}
