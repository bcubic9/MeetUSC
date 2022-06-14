
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
    protected ArrayList<Category> categoriesOfInterest;
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
        this.email = emailAddress;
        this.hasAgreedToTerms = Boolean.parseBoolean(userAgreedToTerms);
        this.profilesPublic = Boolean.parseBoolean(userProfileIsPublic);
        this.adminPrivileges = Boolean.parseBoolean(userAdminPrivileges);
        this.authorOf.add(authorOf); // need to make this a uuid
    }

/*
@param getFirstName returns the string firstName
*/
    public String getFirstName() {
        return firstName;
    }
/*
@param setFirstName passes in the firstName and
*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/*
@param getFirstName returns the string firstName
*/
    public String getLastName() {
        return lastName;
    }
/*
@param getFirstName intializes this.lastname
*/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/*
@param getUserName returns the userName
*/
    public String getUserName() {
        return userName;
    }
/*
@param getFirstName returns the string firstName
*/
    public void setUserName(String userName) {
        this.userName = userName;
    }
/*
@param getEmailAddress returns the emailAddress
*/
    public String getEmailAddress() {
        return this.email;
    }
/*
@param setEmailAddress 
*/
    public void setEmailAddress(String emailAddress) {
        this.email = emailAddress;
    }
/*
@param getUserID returns the user's UUID
*/
    public UUID getUserId() {
        return userId;
    }
/*
@param set returns the string firstName
*/
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
/*
@param getHobby returns the string ArrayList of hobbies
*/
    public ArrayList<String> getHobby() {
        return hobby;
    }
/*
@param getFirstName returns the string firstName
*/
    public void setHobby(ArrayList<String> hobby) {
        this.hobby = hobby;
    }
    /*
    @param getuserPassword returns password
    */
    public String getUserPassword() {
        return this.password;
    }
    /*
    @param getUserGender returns gender
    */
    public String getUserGender() {
        return this.gender;
    }
    /*
    @param getUserAge returns age
    */
    public int getUserAge() {
        return this.age;
    }
    /*
    @param getHasAgreedToTerms returns whether or not the user has agreed to the terms of service
    */
    public boolean getHasAgreedToTerms() {
        return hasAgreedToTerms;
    }
    /*
    @param getProfileIsPublic returns whether or not the profile is public
    */
    public boolean getProfileIsPublic() {
        return profilesPublic;
    }
/*
@param getAdminPrivileges returns whether or not the user has adminPriveleges
*/
    public boolean getAdminPrivileges() {
        return adminPrivileges;
    }
    /*
    @param getGroupsCreated returns password returns the author of a group created.
    */
    public ArrayList<UUID> getGroupsCreated() {
        return authorOf;
    }
    /*
    @param getJoinedGroups returns the groups that the user has joined
    */
    public ArrayList<String> getJoinedGroups() {
        ArrayList<String> joinedGroupsNames = new ArrayList<String>();
        GroupList gl = GroupList.getInstance();
        for(Group group : gl.getGroups()) {
            for(UUID g : groupsJoined) {
                if(g.equals(group.getGroupId()) && !joinedGroupsNames.contains(group.getGroupName())) {
                    joinedGroupsNames.add(group.getGroupName());
                }
            }
        }
        
        return joinedGroupsNames;
    }
    /*
    @param getuserPassword returns categories of interest
    */
    public ArrayList<Category> getCategoriesOfInterest() {
        ArrayList<Category> cats = new ArrayList<>();
        /*for(Category cat: categoriesOfInterest) {
            if (cat.equals(Category.CONSTRUCTION)) {
                cats.add(Category.CONSTRUCTION);
            }
            
        }
        */
        return categoriesOfInterest;
    }
}
