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
/*
1. Написать свою коллекцию, элементы которого будут только числа, где реализовано добавление, удаление и распечатка

при добавлении: добавляется элемент к коллекции и при этом удаляется пятый с конца (если такой элемент присутствует)
при удалении: удаляется элемент и при этом остальные элементы прибавляются ровно на то число которые вы удалили
при распечатки: переопределите метод toString() так, чтобы распечатался каждый второй элемент и попутно size коллекции


 */
public class MyCollection implements CollectionMethods {
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
            System.out.println(i);
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
        list.remove(index);
        ListIterator<Number> iter = list.listIterator();
        while (iter.hasNext()) {
            if (iter.next() instanceof Byte) {
                Number newN = iter.next().byteValue() + b;
                iter.set(newN);
            }
            if (iter.next() instanceof Short) {
                Number newN = iter.next().shortValue() + sh;
                iter.set(newN);
            }
            if (iter.next() instanceof Integer) {
                System.out.println(iter.next().intValue());
                Number newN = iter.next().intValue() + i;
                iter.set(newN);
            }
            if (iter.next() instanceof Long) {
                Number newN = iter.next().longValue() + l;
                iter.set(newN);
            }
            if (iter.next() instanceof Float) {
                Number newN = iter.next().floatValue() + f;
                iter.set(newN);
            }
            if (iter.next() instanceof Double) {
                Number newN = iter.next().doubleValue() + d;
                iter.set(newN);
            }

        }
        return list;
    }

    @Override
    public String print() {
        Number num = null;
        List<Number> newList = new LinkedList<>();
        ListIterator<Number> iterat = list.listIterator();
        while (iterat.hasNext()) {
            iterat.next();
            if (iterat.hasNext()) {
                num = iterat.next();
            }
            if (iterat.nextIndex() < list.size()) {
                newList.add(num);
            }
        }

        return " MyCollection{" +
                "Лист чисел 'list' содержит такие значения в каждом втором элементе: " + newList + "; Размер листа =" + list.size() +
                "элементов }";
    }

}
