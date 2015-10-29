package GorobetsDmitriy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author Dmitriy Gorobets .
 * Add metods tests
 */

public class AddMethodTest {

    Number number;
    List<Number> list;
    MyCollection collection;


    @Before
    public void setUpBefore() throws FileNotFoundException {

        list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        collection = new MyCollection(list);
        number = 15;
    }

    @Test
    public void tst_SIZE_NOT_CHANGES() {
        assertEquals(8, collection.add(number).size());

    }

    @Test
    public void tst_ADD_IN_THE_END() {
        int size = collection.add(number).size();
        assertEquals(number, collection.add(number).get(size - 1));

    }

    @Test
    public void tst_DELETE_FIFTH_ELEMENT_TRUE() {
        List<Number> list = collection.add(number);
        int size = list.size();
        Number fifthELEM = list.get(size - 5);
        assertEquals(4, fifthELEM);

    }

    @Test
    public void tst_DELETE_FIFTH_ELEMENT_TRUE2() {
        Number fifthFromTHeEnd = list.get(list.size() - 5);
        List<Number> list = collection.add(number);
        int size = list.size();
        Number fifthFromTHeEndNew = list.get(size - 5);

        assertEquals(fifthFromTHeEnd, fifthFromTHeEndNew);

    }

    @Test
    public void tst_DELETE_FIFTH_ELEMENT_TRUE3() {
        Number deletedElem_5_FromTHeEnd = list.get(list.size() - 4);
        List<Number> list = collection.add(number);

        assertFalse(list.contains(deletedElem_5_FromTHeEnd));

    }


    @After

    public void setUpAfter() {
        list = null;
        collection = null;
        number = null;
    }

}
