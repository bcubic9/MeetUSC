import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupListTest {
    private GroupList group = GroupList.getInstance();
    private ArrayList<Group> groupList = GroupList.getGroups();

    @BeforeEach 
    public void setUp(){
        GroupList.clear();
        GroupList.addGroup(new Group("Theta Tau", "A Professional Faternity for Engineering students", Category.SOCIAL));
    


    }

    @AfterEach
    public void tearDown(){
        groupList.getInstance().getGroups().clear();

    }

    @Test
    void testSearchForGroupByName(){
        String hasThetaTau =  groupList.searchForGroupByName("Theta Tau");
        assertTrue(hasThetaTau);
        

    }

    @Test
    void testSearchGroupByCategory(){
        Category hasThetaTauCategory = groupList.searchGroupByCategory():
        assertTrue(hasThetaTauCategory);
    }
    
}
