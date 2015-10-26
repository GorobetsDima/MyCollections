package GorobetsDmitriy;

import java.util.List;

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

    @Override
    public List<Number> add(List<Number> list) {


        return list;
    }

    @Override
    public List<Number> delete(List<Number> list) {
        return null;
    }

    @Override
    public List<Number> print(List<Number> list) {
        return null;
    }
}
