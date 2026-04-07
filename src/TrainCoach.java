import java.util.*;
import java.util.LinkedList;

class TrainCoach{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int max = arr[0];
    int secmax;

    for (int i = 1; i < n; i++) {
        if (max < arr[i]) {
            max = arr[i];
        }
    }
    List<Integer> obj = new LinkedList<>();

    for(int a:arr){
        obj.add(a);
    }
    obj.remove(max);


}
}