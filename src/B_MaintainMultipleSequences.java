package src;
import java.util.*;

public class B_MaintainMultipleSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N  = scanner.nextInt();
        int M  = scanner.nextInt();;
        ArrayList<ArrayList<Integer>> joinList = new ArrayList<ArrayList<Integer>>();
    
        for (int i = 0; i < M; i++) {
            int k = scanner.nextInt();
            ArrayList<Integer> participants = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int x = scanner.nextInt();
                participants.add(x);
            }
            joinList.add(i,participants);
        }
        scanner.close();

        int peoples[] = new int[N];
        for (int i = 0; i < N; i++) {
            peoples[i] = i+1;
        }

        ArrayList<ArrayList<Integer>> pairList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < peoples.length-1; i++) {
            for (int j = i+1; j < peoples.length; j++) {
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(i+1);
                pair.add(j+1);
                pairList.add(pair);
            }
        }

        int counter = 0;
        while(pairList.size() != 0 && counter < M) {
            ArrayList<Integer> ballParticipants  =  joinList.get(counter);
            for (int i = 0; i < pairList.size(); i++) {
                ArrayList<Integer> currentPair = pairList.get(i);
                int first = currentPair.get(0);
                int second = currentPair.get(1);
             if (ballParticipants.contains(first) && ballParticipants.contains(second)) {
                pairList.remove(i);
             }   
            }
            counter++;
        }

        String ans = "No";
        if (pairList.size() == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}

