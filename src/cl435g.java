import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cl435g {
    public class dfile {
        public static void main(String [] args) {
            try {
                Scanner input = new Scanner(new File("data/prog285b.dat"));
                int[] scores = new int[100];
                int count = 0;

                while (input.hasNext()) {
                    int score = input.nextInt();
                    scores[count] = score;
                    count++;
                }
                //sort the scores (bubble sort)
                for (int lcv = 0; lcv < count; lcv++) {
                    for (int lcv2 = 0; lcv2< count-1; lcv++) {
                        if (scores[lcv2] > scores[lcv2 + 1]) {
                            int temp = scores[lcv2];
                            scores[lcv2]= scores[lcv2 + 1];
                            scores[lcv2 + 1] = temp;
                        }
                    }
                }

                cl435g[] golfers = new cl435g[count];
                for (int lcv = 0; lcv < count; lcv++) {
                    cl435g  myguy = new cl435g(scores[lcv]);
                    golfers[lcv] = myguy;
                }

                int rank = 1;
                for (int lcv = 0; lcv <count; lcv++) {
                    golfers[lcv].setRank(rank);
                    if (lcv < count - 1 && scores[lcv] != scores[lcv + 1])
                }
                System.out.println("Score\tRank");
                for (int lcv = 0; lcv < count; lcv++)
                    System.out.println(golfers[lcv].toString());
            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
    }


}
