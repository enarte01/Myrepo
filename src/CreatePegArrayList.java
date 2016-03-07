import java.util.*;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by genie on 02/03/2016.
 */
public class CreatePegArrayList implements ColourPegInt {
    private int seed;
    private int colourPegArraySize;
    private int secretCodeSize;
   // EasyGameBoard e = new EasyGameBoard();









    public void setSeed(int seed) {
        this.seed = seed;
    }


    public void setColourPegArraySize(int colourPegArraySize) {
        this.colourPegArraySize = colourPegArraySize;
    }

    public void createColourPegArrayList(){

        ColourPegs Blue = new ColourPegs();
        ColourPegs Azure = new ColourPegs();
        ColourPegs Denim = new ColourPegs();
        ColourPegs Ebony = new ColourPegs();
        ColourPegs Flax = new ColourPegs();
        ColourPegs Gold = new ColourPegs();
        ColourPegs Cyan = new ColourPegs();
        Blue.setPosition(0);// can randomise the position or will it be redundant
        Azure.setPosition(1);
        Blue.setColour("B");
        Azure.setColour("A");
        Cyan.setPosition(2);// can randomise the position or will it be redundant
        Denim.setPosition(3);
        Cyan.setColour("C");
        Denim.setColour("D");
        Ebony.setColour("E");
        Ebony.setPosition(4);
        Flax.setPosition(5);// can randomise the position or will it be redundant
        Gold.setPosition(6);
        Flax.setColour("F");
        Gold.setColour("G");

        COLOUR_PEGS_ARRAY_LIST.add(Blue.getPosition(),Blue);
        COLOUR_PEGS_ARRAY_LIST.add(Azure.getPosition(),Azure);
        COLOUR_PEGS_ARRAY_LIST.add(Cyan.getPosition(),Cyan);
        COLOUR_PEGS_ARRAY_LIST.add(Denim.getPosition(),Denim);
        COLOUR_PEGS_ARRAY_LIST.add(Ebony.getPosition(),Ebony);
        COLOUR_PEGS_ARRAY_LIST.add(Flax.getPosition(),Flax);
        COLOUR_PEGS_ARRAY_LIST.add(Gold.getPosition(),Gold);


        for(ColourPegs p: COLOUR_PEGS_ARRAY_LIST ){

           // System.out.println(p.getColour());
        }


        //System.out.println(COLOUR_PEGS_ARRAY_LIST.size());

    }


    public ArrayList<String> createSecretPegArrayList(){


        // System.out.println(createSecretPegArrayList().size());


        Random generator = new Random();

        int arrayPosition = generator.nextInt(seed);

       // System.out.println(arrayPosition);

        // randomly select elements from Colour pegs array and randomly place them in SECRET_PEG_ARRAY_LIST

        for(int i = 0; i < 4; i++){
            SECRET_PEG_ARRAY_LIST.add(i, COLOUR_PEGS_ARRAY_LIST.get(arrayPosition));

           /*
            * replace with colourPegArraySize select the secret code from
            * the entire Colour peg array list
            *
            * */
            arrayPosition = generator.nextInt(colourPegArraySize);

            //System.out.println(arrayPosition);
        }

       // System.out.println(" ");

        ArrayList<String> secretCode = new ArrayList<>();

       // ColourPegs pegs = new ColourPegs();

        for(ColourPegs p: SECRET_PEG_ARRAY_LIST){



           // System.out.println(p.getColour());

            //secretCode.add(pegs.getColour());



                secretCode.add(p.getColour());


           // System.out.println(secretCode.get(0));





        }


       /* for(int i = 0; i < 4; i++){


            System.out.println(secretCode.get(i));
        }

*/



        /*
        *
        * pass secretCodeComparetoGuessCode to a local variable to reduce calls
        * to this method
        *
        * */


        return secretCode;
    }
}
