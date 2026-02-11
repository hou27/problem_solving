import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }
        // Please write your code here.

        sc.close();

        Arrays.sort(a);

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(a[i], i);
        }

        for (int i = 0; i < q; i++) {
            if (!indexMap.containsKey(queries[i])) {
                System.out.println(0);
                continue;
            }

            int idx = indexMap.get(queries[i]);
            // int left = 0;
            // int right = n - 1;
            // int mid = -1;
            // while (left <= right) {
            // mid = (left + right) / 2;
            // if (queries[i] < a[mid]) {
            // right = mid - 1;
            // } else if (queries[i] > a[mid]) {
            // left = mid + 1;
            // } else {
            // break;
            // }
            // }

            System.out.println((idx + 1 - 1) * (n - (idx + 1)));
        }
    }
}
