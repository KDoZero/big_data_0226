package 버블정렬;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {9,4,3,10,5,8,7,6,2,1};
        int tmp = 0; // 값을 임시로 담을 변수
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] < arr[j]) { // 부호를 뒤집으면 차순(오름차순,내림차순)이 바뀜
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
