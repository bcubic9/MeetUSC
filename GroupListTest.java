import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupListTest {
    private GroupList group = GroupList.getInstance();
    private ArrayList<Group> groupList = group.getGroups();

    @BeforeEach 
    public void setUp(){
        //GroupList.clear(); //no clear method
        //GroupList.addGroup(new Group("Theta Tau", "A Professional Faternity for Engineering students", Category.SOCIAL)); //parameters are not correct
    


    }

    @AfterEach
    public void tearDown(){
        GroupList.getInstance().getGroups().clear();
    }

    @Test
    void testSearchForGroupByName(){
        //String hasThetaTau =  groupList.searchForGroupByName("Theta Tau"); //returns as an arraylist of group, which should be just group, but still isn't a string
        //assertTrue(hasThetaTau); //is not a boolean value.
        

    }

    @Test
    void testSearchGroupByCategory(){
        //Category hasThetaTauCategory = groupList.searchGroupByCategory(): //no correct parameters
        //assertTrue(hasThetaTauCategory); // has thetatau is not a boolean value.
    }
    
}
