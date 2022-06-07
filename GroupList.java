import java.util.ArrayList;

public class GroupList{
    private static GroupList groupList = null;


    private ArrayList<Group> groups; //this is the group list.
    //private static ArrayList<User> favoriteGroup;
  
    private GroupList(){
      this.groups = new ArrayList<Group>();
    }
    
    public static GroupList getInstance(){
        if (groupList == null) {
          groupList = new GroupList();
        }
        return groupList;
    }

    public ArrayList<Group> getGroups(){
        return groups;
    }

    public Group removeGroup(Group group){
      groups.remove(group);
      return group;
    }
    public ArrayList<Group> searchForGroupByName(String name){
      ArrayList<Group> relevantGroupName = new ArrayList<>();
        for (Group e : groups) {
          if(e.getGroupName().contains(name)); {
              relevantGroupName.add(e);
          }
        }
        return relevantGroupName;
    }
    public Group getGroupByUUID(UUID ID){
      for (Group e : groups) {
          if(e.getGroupId().equals(ID)){
            return e;
          } 
        }
        return null;
      }
}

