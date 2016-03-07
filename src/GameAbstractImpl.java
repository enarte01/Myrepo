import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GameAbstractImpl implements Game {
    // if showCode is true then the secret code is revealed before
    // the game starts. This will be used by graders of the program
    // to test the feedback of guesses
    private boolean showCode;




    public GameAbstractImpl(){

    }

    /**
     * Create a Game object.
     *
     * @param easy If easy is true the secret code will be
     *             revealed at all times when playing the game. If easy is
     *             false the secret code is not revealed until correctly guessed
     *             or the player runs out of turns.
     */



    public GameAbstractImpl(boolean easy) {
        showCode = easy;


       /* c.setSeed(4);
        c.setColourPegArraySize(7);
        c.createColourPegArrayList();*/
    }


    // ...



    public void setShowCode() {
        this.showCode = showCode;
    }


/*

    private CreatePegArrayList c = new CreatePegArrayList();
    private ArrayList<String> inputArray = new ArrayList<>();
    private ArrayList<String> secretCode = new ArrayList<>();





    @Override
    public void runGames() {





        secretCode = c.createSecretPegArrayList();

        if(showCode) {
            for (int i = 0; i < 4; i++) {

                System.out.println(secretCode.get(i));


            }
        }


        int numberOfGuesses = 2;

        do {


            // ArrayList<String> checkSecretCode = secretCode;




            System.out.printf("You have %d chances to guess " +
                    "the answer or you lose the game.", numberOfGuesses);
            System.out.println(" ");
            System.out.println("What is your next guess?");

            System.out.println("Type in the characters for your guess and press enter.");
            System.out.print("Enter guess:");
            Scanner in = new Scanner(System.in);
            String[] input = in.next().toUpperCase().split("(?!^)");


            int count = 0;
            for (String s : input) {
                //System.out.println(s);

                inputArray.add(count, s);

                count++;

            }

            for (int i = 0; i < 4; i++) {

                System.out.print(inputArray.get(i));
            }

            System.out.println(" ");


            for (int i = 0; i < 4; i++) {


                if(inputArray.equals(secretCode)){


                    System.out.println("Black Black Black Black");


                    numberOfGuesses = 1;
                    i = 4;
                    System.out.println("You won the game !!!");

                    System.out.print("The secret code is :" );

                    secretCode.forEach(System.out::print);



                }else if (inputArray.contains(secretCode.get(i)) &&
                        secretCode.get(i).equals(inputArray.get(i))) {


                    System.out.println("Black");


                    secretCode.remove(i);
                    secretCode.add(i, null);
                    inputArray.remove(i);
                    inputArray.add(i, null);

                } else if (inputArray.contains(secretCode.get(i))) {

                    //System.out.println(secretCode);

                    secretCode.remove(i);
                    secretCode.add(i, null);
                    inputArray.remove(i);
                    inputArray.add(i, null);
                    //System.out.println(secretCode);

                    System.out.println("White");
                }else {System.out.println("Result : No pegs\n");}
            }

            numberOfGuesses --;


        }while (numberOfGuesses >= 1);
    }*/



}


