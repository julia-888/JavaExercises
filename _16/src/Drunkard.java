import java.util.ArrayList;
import java.util.Scanner;

public class Drunkard {
    static void winningMove1(ArrayList<Integer> player1, ArrayList<Integer> player2) {
        int card = player1.get(0);
        player1.remove(0);
        player1.add(card);
        player1.add(player2.get(0));
        player2.remove(0);
    }

    static void winningMove2(ArrayList<Integer> player1, ArrayList<Integer> player2) {
        int card = player2.get(0);
        player2.remove(0);
        player2.add(player1.get(0));
        player2.add(card);
        player1.remove(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            player1.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            player2.add(in.nextInt());
        }

        for (int i = 0; i < 106; i++) {
            if (player1.get(0) == 0 & player2.get(0) == 9) {
                winningMove1(player1, player2);
            } else if (player1.get(0) == 9 & player2.get(0) == 0) {
                winningMove2(player1, player2);
            } else if (player1.get(0) > player2.get(0)) {
                winningMove1(player1, player2);
            } else if (player1.get(0) < player2.get(0)) {
                winningMove2(player1, player2);
            }

            if (player1.isEmpty()) {
                System.out.println("second " + (i + 1));
                break;
            } else if (player2.isEmpty()) {
                System.out.println("first " + (i + 1));
                break;
            }

            if (i == 105) {
                System.out.println("botva");
                break;
            }
        }
    }
}
