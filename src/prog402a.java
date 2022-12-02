import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog402a.dat"));
            Prog402aClass[] list = new Prog402aClass[21];
            int size= 0;
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                Prog402aClass vector = new Prog402aClass(id, score);
                list[size] = vector;
                size++;
            }

            for (int index = 0; index < size; index++) {
                list[index].calc(avg);



            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}



        //read in the data file
        //calculate the avg
        //call calc by passing in the avg---current.calc(avg)