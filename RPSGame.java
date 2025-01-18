import java.util.Random;
import java.util.Scanner;

class RPSGame {
    public static void main(String args[]) {
        Random roll = new Random();
        int min = 1;
        int max = 3;
        // Random Bot roll
        int B_roll = roll.nextInt((max - min) + 1) + min;
        int B_throw = B_roll;
        Scanner P_in = new Scanner(System.in);
        System.out.println("What do you what to throw?\r\n" + //
                "   1. Rock\r\n" + //
                "   2. Paper\r\n" + //
                "   3. Scissor");
        int P_throw = P_in.nextInt();
        P_in.close();
        // Player Throws
        if (P_throw == 1) {
            System.out.println("Player:\r\n" + //
                    "    ________\r\n" + //
                    "---'  ______)\r\n" + //
                    "       (______)\r\n" + //
                    "       (______)\r\n" + //
                    "       (_____)\r\n" + //
                    "---.___(____)");
        } else if (P_throw == 2) {
            System.out.println("Player:\r\n" + //
                    "    _______\r\n" + //
                    "---'   ____)______\r\n" + //
                    "          ________)\r\n" + //
                    "          ________)\r\n" + //
                    "         ________)\r\n" + //
                    "---.___________)");
        } else if (P_throw == 3) {
            System.out.println("Player:\r\n" + //
                    "    _______\r\n" + //
                    "---'   ____)_______\r\n" + //
                    "          _________)\r\n" + //
                    "       ___________)\r\n" + //
                    "      (_____)\r\n" + //
                    "---.__(____)");
        }
        // Bot throws
        if (B_roll == 1) {
            System.out.println("               Bot :\r\n" + //
                    "                _________\r\n" + //
                    "               (_______  '---\r\n" + //
                    "              (_____)\r\n" + //
                    "              (_____)\r\n" + //
                    "               (____)\r\n" + //
                    "                (___)___.---");
        } else if (B_roll == 2) {
            System.out.println("               Bot :\r\n" + //
                    "                  _________\r\n" + //
                    "             ____(____     '---\r\n" + //
                    "            (______\r\n" + //
                    "            (_______\r\n" + //
                    "             (_______\r\n" + //
                    "               (___________.---");
        } else if (B_roll == 3) {
            System.out.println("               Bot :\r\n" + //
                    "                   _______\r\n" + //
                    "             _____(____   '---\r\n" + //
                    "            (_______\r\n" + //
                    "            (__________\r\n" + //
                    "                 (_____)\r\n" + //
                    "                  (____)__.---");
        }
        // Check Winner
        if (P_throw == B_throw) {
            System.out.println("---Tie---");
        } else if (P_throw == 1 && B_throw == 2) {
            System.out.println("---Bot Wins---");
        } else if (P_throw == 1 && B_throw == 3) {
            System.out.print("---Player Wins---");
        } else if (P_throw == 2 && B_throw == 1) {
            System.out.print("---Player Wins---");
        } else if (P_throw == 2 && B_throw == 3) {
            System.out.print("---Bot Wins---");
        } else if (P_throw == 3 && B_throw == 1) {
            System.out.print("---Bot Wins---");
        } else if (P_throw == 3 && B_throw == 2) {
            System.out.print("---Player Wins---");
        }
    }
}