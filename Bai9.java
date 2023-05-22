import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai9 {
    public static void mangsonguyen(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        Map<Integer, Integer> mapArr = new HashMap<>();
//Xai Hashmap
        for (int i=0;i<n;i++){
            //Use Map
            if (mapArr.containsKey(arr[i])) {
                mapArr.put(arr[i], mapArr.get(arr[i]) + 1);
            } else {
                mapArr.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mapArr.entrySet()) {
            if (entry.getValue() >= 2)
            System.out.println(entry.getKey());
        }
    }
}
