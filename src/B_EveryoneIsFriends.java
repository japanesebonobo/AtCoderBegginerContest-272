package src;
import java.util.*;

public class B_EveryoneIsFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N  = scanner.nextInt();
        int M  = scanner.nextInt();;
        boolean people[][] = new boolean[N][N];

        ArrayList<ArrayList<Integer>> participants = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < M; i++) {
            int k = scanner.nextInt();
            ArrayList<Integer> participantList = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int x = scanner.nextInt();
                participantList.add(x);
            }
            participants.add(i,participantList);
        }
        scanner.close();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < participants.get(i).size()-1; j++) {
                for (int k = j+1; k < participants.get(i).size(); k++) {
                people[participants.get(i).get(j)-1][participants.get(i).get(k)-1] = true;
                }
            }
        }

        
        String ans = "Yes";
        
        LOOP:
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(people[i][j] == false) {
                    ans = "No";
                    break LOOP; 
                }
            }
        }

        System.out.println(ans);
    }
}

