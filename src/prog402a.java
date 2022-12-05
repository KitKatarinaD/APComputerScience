import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog402a.dat"));
            Prog402aClass[] list = new Prog402aClass[21];
            int size= 0;
            System.out.println("ID\t\tScore\t\tDiff");
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                Prog402aClass vector = new Prog402aClass(id, score);
                list[size] = vector;
                size++;
            }
            double tot = 0;
            for (Prog402aClass vector : list) {
                tot = tot + vector.getMyscore(); //gets score from vector "book"
            }
            double avg = tot/size;
            //calculated average of all scores

            for (int index = 0; index < size; index++) {
                list[index].calc(avg);
            }
            for (Prog402aClass vector : list) {
                System.out.println(vector.getMyid());
            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}



        //read in the data file
        //calculate the avg
        //call calc by passing in the avg---current.calc(avg)