import java.util.ArrayList;

public class GroupList{

    private static ArrayList<Group> groups; //this is the group list.
  

    private GroupList(){
      this.groups = new ArrayList<Group>();
    }
    
    public static ArrayList<Group> getInstance(){
        if (groups == null) {
          return groups;
        }
        return groups;
    }


    public ArrayList<Group> getGroups(){
        return groups;

    }

    private boolean addGroup(Group group){
        return false;
    }

    private Group editGroup(Group group){
        return groups.get(0);

    }

    public Group removeGroup(Group group){
      groups.remove(group);
      return group;

    }

    public Group searchForGroup(Group group){
        return groups.get(0);

    }
    





}
