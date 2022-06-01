import java.util.ArrayList;

public class User {
protected UUID userId;
protected String password
protected String displayName; 
protected String name;
protected String gender;
protected int age;
protected int date;
protected ArrayList<Group> groupsCreated;
protected int NumberOfGroup;
protected ArrayList<String> hobby;
protected String emailAddress;
protected boolean hasAgreedToTerms;
protected boolean profileIsPublic;
protected ArrayList<Group> favoriteGroups; 
protected ArrayList<Category> categoriesOfInterest = null;
protected boolean adminPrivileges(User user) {

}
protected boolean authorPrivileges(User user) {

}
public User user (String name, String shortDescription, ArrayList<Category> categories){
    
 }

/**
 * Let's decrease the number of parameters given here. consider prompting 
 * the user for them with System.out.println("Some prompt here");
 */ 
public User user(UUID id, String name, String shortDescription, 
                   String longDescription, ArrayList<Category> categories, 
                   String ArrayList<User> attendees, ArrayList<Message> messages){
                   }
public String toString(){
  return "";
}
    



private String getName(){
  return "";
}
private void setName(String newName){

}
private String getDisplayName(){
  return "";
}
private void setDisplayName(String newDisplayname){

}
private String etEmailAddress(){
  return "";
}
private void setEmailAddress(String email){

}
private String getUserId(){
  return "";
}
private void setUserId(String userID){

}
private ArrayList<String> getHobbies(){
  return getHobbies;

}
private void setHobby(String hobby){

}
private ArrayList<String> getFavoriteGroups(){
  return getFavoriteGroups;
}

private void setFavoriteGroup(Group group){

}
    public void notifyOfMessage(String message) {

    }

    public void addInterestCategories(ArrayList<Category> Category) {
        
    }

    public boolean determinePrivileges(User user) {
        return false;
    }

    public void acceptMember(User member) {
            
    }

    public void rejectMember(User member) {
            
    }

    public void removeMember(User member, boolean adminPrivileges) {
            
    }
    private void removeMemberFromGroup(User member, boolean adminPrivileges){

    } 
    private void tempUserBan(User user, boolean adminPrivileges){

    }
    private void tempGroupBan(Group group, boolean adminPrivileges){

    }
    private void userBan(User member, boolean adminPrivileges){

    }
    private void groupBan(Group group, boolean adminPrivileges){

    }
    private void removeGroup(Group group, boolean adminPrivileges){

    }
    private void removeEvent(Event event, boolean adminPrivileges){

    }
    private String warnUserOfViolation(User user, boolean adminPrivileges){
      return "";
    }
    private String warnGroupOfViolation(Group group, boolean adminPrivileges){
      return "";
    }


    
}
