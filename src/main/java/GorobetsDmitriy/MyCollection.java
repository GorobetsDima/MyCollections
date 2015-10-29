package GorobetsDmitriy;

import org.apache.log4j.Logger;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         At  method "add":
 *         There is an element with "Number" type adds and deletes fifth element from the end at "list" collection
 *         <p>
 *         At method "delete": There is an element with "Number" type  deletes and the value of the deleted element
 *         is added to the other elements at "list" collection
 *         <p>
 *         At method "print": there is  Every second element of collection "list" prints and pronts size of the collection
 *         <p>
  */

public class MyCollection implements CollectionMethods {
    public static final Logger MY_COLL_LOGG = Logger.getLogger(MyCollection.class);
    private List<Number> list = new LinkedList<>();

    public List<Number> getList() {
        return list;
    }

    public void setList(List<Number> list) {
        this.list = list;
    }

    public MyCollection() {
    }

    public MyCollection(List<Number> list) {
        this.list = list;
    }

    /**
     *
     * @param number - it's an element which we want to add to this collection
     * @return List<Number> list
     */

    @Override
    public List<Number> add(Number number) {
        list.add(number);
        if (list.size() >= 5) {
            list.remove(list.size() - 5);
        }
        MY_COLL_LOGG.info("Коллекция \"list\" содержит такие элементы после добавления элемента \"" + number + "\" : " + list);
        return list;
    }

    /**
     *
     * @param index - it's an index of an element which we want to delete
     * @return  List<Number> list
     */

    @Override
    public List<Number> delete(int index) {
        byte b = 0;
        short sh = 0;
        int i = 0;
        long l = 0;
        float f = 0;
        double d = 0;

        Number removeN = list.get(index);

        if (removeN instanceof Byte) {
            b = removeN.byteValue();
        }
        if (removeN instanceof Short) {
            sh = removeN.shortValue();
        }
        if (removeN instanceof Integer) {
            i = removeN.intValue();
        }
        if (removeN instanceof Long) {
            l = removeN.longValue();
        }
        if (removeN instanceof Float) {
            f = removeN.floatValue();
        }
        if (removeN instanceof Double) {
            d = removeN.doubleValue();
        }

        for (int elementIndex = 0; elementIndex < list.size(); elementIndex++) {
            if (list.get(elementIndex) instanceof Byte) {
                Number newN = (list.get(elementIndex).byteValue() + b);
                list.set(elementIndex, newN);
            }
            if (list.get(elementIndex) instanceof Short) {
                Number newN = list.get(elementIndex).shortValue() + sh;
                list.set(elementIndex, newN);
            }
            if (list.get(elementIndex) instanceof Integer) {
                Number newN = list.get(elementIndex).intValue() + i;
                list.set(elementIndex, newN);
            }
            if (list.get(elementIndex) instanceof Long) {
                Number newN = list.get(elementIndex).longValue() + l;
                list.set(elementIndex, newN);
            }
            if (list.get(elementIndex) instanceof Float) {
                Number newN = list.get(elementIndex).floatValue() + f;
                list.set(elementIndex, newN);
            }
            if (list.get(elementIndex) instanceof Double) {
                Number newN = list.get(elementIndex).doubleValue() + d;
                list.set(elementIndex, newN);
            }

        }
        list.remove(index);
        MY_COLL_LOGG.info("Коллекция \"list\" содержит такие элементы после удаления элемента \"" + removeN + "\": " + list);
        return list;
    }

    /**
     *
     * @return Information about every second element of collection "list"  and size of the collection
     */

    @Override
    public String print() {

        Number num;
        List<Number> newList = new LinkedList<>();

        for (int elementIndex = 1; elementIndex < list.size(); elementIndex = elementIndex + 2) {

            num = list.get(elementIndex);
            newList.add(num);
        }
        MY_COLL_LOGG.info("Коллекция \"list\" содержит такие значения в каждом втором элементе: " + newList + "; Размер коллекции =" + list.size() +
                " элементов.");

        return " MyCollection {" +
                "Коллекция \"list\" содержит такие значения в каждом втором элементе: " + newList + "; Размер коллекции =" + list.size() +
                " элементов }";
    }


}
