import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by genie on 02/03/2016.
 */


public class EasyGameBoard extends GameAbstractImpl {

    CreatePegArrayList c = new CreatePegArrayList();
    ArrayList<String> inputArray = new ArrayList<>();

    @Override
    public void runGames() {

      Scanner input = new Scanner(System.in);

        //System.out.println((input.hasNext()));

        for(int i = 0; i < 4; i++){

             inputArray.add(i, input.next());
        }

        input.close();

       // Object[] myarray = inputArray.toArray();


        if (inputArray.iterator().equals(c.createSecretPegArrayList())){


         System.out.println("true");
        }

        for(int i = 0; i < 3 +1; i++){

            System.out.println(inputArray.get(i));
        }



    }


    /*
    *
    * we want a method that is going to compare guessCode to
    * secretCodeArrayList
    * */

    /*
    * create a guessCode method that receives the player guess
    * */


    public void guessCode(ColourPegs userInput){

        ArrayList<ColourPegs> inputArray = new ArrayList<>();

        for(int i = 0; i < 3 +1; i++) {
            //input.add(i, userInput);


        }


    }
}
