import java.util.ArrayList;

public class GroupList{

    private ArrayList<Group> groups;
    private static GroupList groupList = null;

    

    private GroupList(){
      this.groups = new ArrayList<Group>();
    }
    
    public Group getInstance(){
        if (groupList == null) {
          groupList = new GroupList();
        }
        return groupList;
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
      return groups;

    }

    public Group searchForGroup(Group group){
        return groups.get(0);

    }
    





}
