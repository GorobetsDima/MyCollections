package GorobetsDmitriy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Dmitriy Gorobets .
 *         Delete metods tests
 */
public class DeleteMethodTest {

    Number number;
    List<Number> list;
    MyCollection collection;
    int index;

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
        index = 1;
    }

    @Test
    public void tst_SIZE_CHANGES() {

        assertNotEquals(8, collection.delete(index).size());

    }

    @Test
    public void tst_DELETE_ELEMENT() {

        assertNotEquals(list.get(1), collection.delete(index).get(1));

    }

    @Test
    public void tst_REMOVE_EL_PLUS_ALL_OTHERS_EL1() {

        int n = list.get(1).intValue() + list.get(2).intValue();
        List<Number> newList = collection.delete(1);

        assertEquals(n, newList.get(1).intValue());


    }

    @Test
    public void tst_REMOVE_EL_PLUS_ALL_OTHERS_EL2() {

        int n = list.get(1).intValue() + list.get(0).intValue();

        List<Number> newList = collection.delete(1);

        assertEquals(n, newList.get(0).intValue());


    }

    @Test
    public void tst_REMOVE_EL_PLUS_ALL_OTHERS_EL3() {

        int n = list.get(1).intValue() + list.get(3).intValue();

        List<Number> newList = collection.delete(1);

        assertEquals(n, newList.get(2).intValue());


    }

    @Test
    public void tst_REMOVE_EL_PLUS_ALL_OTHERS_EL4() {

        int n = list.get(1).intValue() + list.get(2).intValue();
        List<Number> newList = collection.delete(1);

        assertEquals(n, newList.get(1).intValue());


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
