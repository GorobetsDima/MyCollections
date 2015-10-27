package GorobetsDmitriy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         At this Class in method "calculate" I put 3 arguments
 *         There is checked an operator and according to the operator chooses,
 *         which way to use for a calculation in the constructor
 *         <p>
 *         First argument is "firstArg"-it have to be a double type
 *         <p>
 *         Second argument is "operator"-it have to be an operator
 *         <p>
 *         Third argument is "secondArg"-it have to be a double type
 */

public class MyCollection implements CollectionMethods {
   private List<Number> list = new LinkedList<>();
    @Override
    public List<Number> add(Number number) {

        list.add(number);
        if (list.size() >= 5) {
            list.remove(list.size() - 5);
        }

        return list;
    }

    @Override
    public List<Number> delete(int index) {
        Number num = list.get(index);
        ListIterator<Number> iter = list.listIterator();
        while(iter.hasNext()){
           Number m =  iter.next();
//            iter.set(m.);
        }

        return list;
    }

    @Override
    public List<Number> print(List<Number> list) {
        return null;
    }
}
