import java.util.ArrayList;

public class GroupList{

    private ArrayList<Group> groups;
    private GroupList groupList;
    

    private GroupList(){
       


    }
    
    public Group getInstance(){
        return groups.get(0);

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
        return groups.get(0);


    }

    public Group searchForGroup(Group group){
        return groups.get(0);

    }

    public ArrayList<Group> getFavoriteGroup(){
        return groups;
        
    }

    public void addFavoriteGroup(Group group){

    }



}
