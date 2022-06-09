import java.util.ArrayList;
import java.util.UUID;

public class GroupList {
  private static GroupList groupList = null;

  private ArrayList<Group> groups; // this is the group list.
  // private static ArrayList<User> favoriteGroup;

  public GroupList() {
    this.groups = new ArrayList<Group>();
  }
/**
 * The getInstance method gets the current instance and returns it.
 * Used for the singleton
 * @return current instance
 */
  public static GroupList getInstance() {
    if (groupList == null) {
      groupList = new GroupList();
    }
    return groupList;
  }


  public ArrayList<Group> getGroups() {
    return groups;
  }

  /**
   * The method adds a new group to the Group Array List
   * @param name
   * @param description
   * @param categories
   * @return newGroup
   */
  public Group addGroup(String name, String description, ArrayList<Category> categories)
  {
    Group newGroup = new Group(name, description, categories);
    groups.add(newGroup);
    return newGroup;
  }

  public Group removeGroup(Group group) {
    groups.remove(group);
    return group;
  }

  public ArrayList<Group> searchForGroupByName(String name) {
    ArrayList<Group> relevantGroupName = new ArrayList<>();
    for (Group e : groups) {
      if (e.getGroupName().contains(name))
        ;
      {
        relevantGroupName.add(e);
      }
    }
    return relevantGroupName;
  }

  public Group getGroupByUUID(UUID ID) {
    for (Group e : groups) {
      if (e.getGroupId().equals(ID)) {
        return e;
      }
    }
    return null;
  }
  public ArrayList<Group> searchGroupByCategory(Category category)
  {
    ArrayList<Group> groupCategories = new ArrayList<Group>();
    for(Group e : getGroups())
    {
        if(e.hasCategory(category))
        {
          groupCategories.add(e);
        }
    }
    return null;
  }
}
