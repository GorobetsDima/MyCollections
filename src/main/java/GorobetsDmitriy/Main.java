package GorobetsDmitriy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Dmitriy Gorobets .
 */
public class Main {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
      MyCollection collection = new MyCollection(list);
//       collection.add(11);
//       collection.add(12);
//       collection.add(13);
//       collection.add(14);
//       collection.add(15);
//       collection.add(16);
//       List<Number> li =  collection.add(17);
//        System.out.println(li);

        System.out.println(collection.print());

    }
}
