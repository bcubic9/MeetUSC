import java.util.ArrayList;

public class GroupList {

    private ArrayList<Group> allGroups;
    private ArrayList<GroupList> eventList;
    

    private GroupList(){


    }
    
    public Group getInstance(){
        return null;

    }

    public ArrayList<Group> getGroups(){
        return allGroups;


    }

<<<<<<< HEAD
    private boolean addGroup(Group group){
        return false;
=======
    public void addGroup(Group group){

>>>>>>> f5e16468782dd97802c57f5590c730f702dcd6db
    }

    private Group editGroup(Group group){
        return group;

    }

    public Group removeGroup(Group group){
        return group;

    }

    public Group searchForGroup(Group group){
        return group;

    }

    public ArrayList<Group> getFavoriteGroup(){
        return allGroups;
        
    }

    public void addFavoriteGroup(Group group){

    }



}
