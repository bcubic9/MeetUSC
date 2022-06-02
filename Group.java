


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

    
    private Group(String name, String shortDesciption, ArrayList<Category> categories){

        id = UUID.randomUUID();
        this.name = name;
        this.shortDescription = shortDescription;
        this.category = category;
   

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
        member.acceptMember(member);

        
        

    }

    public void leaveGroup(User member){
        member.removeMember(member, true);
         

    }

    public void displayMessage(User member){


    }

    public void displayShortDescription(String shortDescription){

        
        
        

    }

    public void displayLongDescription(String longDescription){



    }

    public void displayGroupMember(ArrayList<User> members){

        System.out.println(members);

    }

    public void displayTypesOfCategories(ArrayList<Category> typesOfCategories){

        System.out.println(typesOfCategories);
        

    }

    public void displayInPerson(Boolean inPerson){
        if(inPerson == true){
        
        }

        

    }

    public void addToAllGroups(Group group){

        group.addToAllGroups(group);
    }   


}
