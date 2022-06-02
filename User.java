
import java.util.List;

public class User {
    enum Gender{
        Male,
        Famale,
        Other
    }

    private String userId;
    private String password;
    private String displayName;
    private String name;
    private String gender;
    private Integer age;
    private Integer date;
    private List<Group> groupsCreated;
    private Integer NumberOfGroup;
    private List<String> hobby;
    private String emailAddress;
    private Boolean hasAgreedToTerms;
    private Boolean profilesPublic;
    private List<Group> favoriteGroups;

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
