package GorobetsDmitriy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Dmitriy Gorobets .
 * Calls all methods of the MyCollection class
 */
public class Main {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();

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


        collection.add(17);// добавляет 17 в лист и удаляет пятый с конца элемент,тоесть 7

        collection.delete(1);//удаляет элемент по индексу 1, и прибавляет к каждому элементу листа значение удаленного элемента

        collection.print();//распичатывает каждый второй элемент коллекции и ее размер

    }
}
