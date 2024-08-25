import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = sc.nextInt();
        }
        int[] b = reverseArray(a);
        Arrays.sort(b);
        for (int i : b ) {
            System.out.println(i);
        }

    }

    private static int[] reverseArray(int[] a) {
        int low = 0, high = a.length-1;
        while(low<high) {
            int tmp = a[low];
            a[low]=a[high];
            a[high]=tmp;
            low++;
            high--;
        }
        return a;
    }
}
