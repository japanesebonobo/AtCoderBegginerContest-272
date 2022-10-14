package src;
import java.util.*;

public class C_Submask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        
        List<Integer> elements = new ArrayList<>();

        int pow = 0;
        while(N > 0) {
            if (N%2 == 1) {
                elements.add(pow);
            }
            N/=2;
            pow++;
        }

        int loop = (int)Math.pow(2, elements.size());
        
        for (int i = 0; i <loop; i++) {
            pow = 0;
            long ans = 0;
            int element = i;

            while(element > 0) {
                if (element%2 == 1) {
                    ans = ans | (1L<<elements.get(pow));
                }
                element = element>>1L;
                pow++;
            }
            System.out.println(ans);
        }
    }
}