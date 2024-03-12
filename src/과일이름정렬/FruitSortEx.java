package 과일이름정렬;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//과일이름을 길이순으로 정렬하고 길이가 같은 경우 사전순으로 정렬
//compare() : 두개의 매개변수를 받아 값을 비교함
// 0 : 두 객체가 같음을 의미
// 양수 : 첫번째 객체가 두번째 객체보다 크다는 의미
// 음수 : 첫번째 객체가 두번째 객체보다 작다는 의미
public class FruitSortEx {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                            "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; //정렬조건
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    return -1;
                }
            }
        };
        Arrays.sort(fruit, comp);
        System.out.println(Arrays.toString(fruit));

        List<String> list = Arrays.asList(fruit);
    }
}
