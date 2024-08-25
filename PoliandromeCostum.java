import java.util.Scanner;

public class PoliandromeCostum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//        System.out.println(isPalindrome(n));

        int a = sc.nextInt();
        System.out.println(isPoliandrome(a));
    }

    public static boolean isPalindrome(String s) {
        String temp = s;
        boolean ans = false;
        // string uppercase to lowercase
        String valueLowercase = s.toLowerCase();
        System.out.println("output lowercase :: " + valueLowercase);
        // remove non aphanumeric
        String value = valueLowercase.replaceAll("[^A-Za-z0-9]", "");
        // reverse string
        String reverse = new StringBuilder(value).reverse().toString();
        System.out.println(reverse);
        // compare dengan data nya untuk nentuin polindromenya
        if (value.equals(reverse)) {
            ans = true;
        }
        return ans;
    }

    public static boolean isPoliandrome(int n){
        boolean ans = false;
        int sum = 0;
        int r, tmp;
        tmp = n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
            System.out.println("value sum : " + sum);
            System.out.println("value n : " + n);
        }
        if (tmp== sum){
            ans = true;
        }
        return ans;
    }
}
