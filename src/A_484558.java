package src;
import java.util.*;

public class A_484558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;

        for (int i = 0; i < N; i++) {
            ans += scanner.nextInt();
        }
        scanner.close();
        
        System.out.println(ans);
    }
}

