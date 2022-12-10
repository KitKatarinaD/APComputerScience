import java.lang.reflect.Array;
import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many teams are there?");
        int teams = input.nextInt();
        ArrayList<Record> teams2 = new ArrayList<Record>();
        for (int c = 0; c < teams; c++) {
            System.out.println("What is the name of team " + c + 1);
            String name = input.nextLine();
            System.out.println("What is the Wins of team " + c + 1);
            int wins = input.nextInt();
            System.out.println("What is the Losses of team " + c + 1);
            int losses = input.nextInt();
            teams2.add(name, wins, losses);
        }
        int team = 0;
        int mWins = teams2.get(0).getWins();
        for(int c = 0; c < teams2.size(); c++)
        {
            if(teams2.get(c).getWins() > mWins )
            {
                mWins = teams2.get(c).getWins();
                team = c;
            }
        }
        for (int c = 0; c < teams2.size(); c++)
        {
            int magicnum = teams2.get(c).magicNum();
        System.out.println(teams2.get(c).getName());
            System.out.println(teams2.get(c).getWins());
            System.out.println(teams2.get(c).getLosses());
        if (magicnum >= 0 && teams2.get(c).leadingPlayer() == false) {
            System.out.println(magicnum);
        } else {
            System.out.println("eliminated from playoff contention");
        }
        System.out.println(" ");
    }

    }
}
/*
88 56
75 71
73 70
76 68
65 78
0 0
 */
