package Comparator예제;

import java.util.Iterator;
import java.util.TreeSet;

//객체 정렬을 위해서 사용, 두 개의 객체를 받아서 정렬해줌
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> list = new TreeSet<>(new DescendingComparator());
        list.add(new Fruit("포도", 3000));
        list.add(new Fruit("수박", 10000));
        list.add(new Fruit("딸기", 6000));
        list.add(new Fruit("사과", 6000));
//        Iterator<Fruit> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            Fruit fruit = iterator.next();
//            System.out.println(fruit.name + " : " + fruit.price);
//        }
        for(Fruit e : list) System.out.println(e.name + " : " + e.price);
    }
}
