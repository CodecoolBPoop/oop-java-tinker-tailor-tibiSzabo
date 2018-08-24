import java.util.ArrayList;
import java.util.List;

class Tinkertailor {

    public void tink (int K, int N) {
        List<Integer> players = new ArrayList<>();
        for (int i=1; i < N+1; i++) {
            players.add(i);
        }
        System.out.println("The players are:" + players.toString() + "\n\n");


        int startingPlayersSize = players.size();
        for (int i=1; i < startingPlayersSize; i++) {
            int idx = K;
            while (idx > players.size()) {
                idx -= players.size();
            }
            System.out.println("Round number " + i + ": player " + players.get(idx-1) + " out.");
            players.remove(idx-1);
            System.out.println("Remaining player(s)" + players.toString() + "\n");
        }
        System.out.println("The winner is: " + players.get(0));
    }


}
