


import java.util.ArrayList;
import java.util.UUID;

public class Group{

    private ArrayList<Category> category;
    private ArrayList<User> members;
    private ArrayList<Event> events;
    private String name;
    private String shortDescription;
    private String longDescription;
    private int groupSize;
    private Author author;
    private ArrayList<String> chat;
    private User authorContact;
    private ArrayList<Message> messages;
    private UUID id;

    
    public Group(String name){

        id = UUID.randomUUID();
      
        this.name = name;
   

    }
    private Group(UUID id, String name, String shortDescription, ArrayList<Category> categories, ArrayList<User> members, ArrayList<Event> events){
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.category = category;
        this.members = members;
        this.events = events;

    }


    public void joinGroup(User member){

        

    }

    public void leaveGroup(User member){
         

    }

    public void displayMessage(User member){

    }

    public void displayShortDescription(String shortDescription){

    }

    public void displayLongDescription(String longDescription){

    }

    public void displayGroupMember(ArrayList<User> members){

    }

    public void displayTypesOfCategories(ArrayList<Category> typesOfCategories){

    }

    public void displayInPerson(Boolean inPerson){

    }

    public void addToAllGroups(Group group){

    }   


}
