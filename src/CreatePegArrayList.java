import java.util.*;

/**
 * Created by genie on 02/03/2016.
 */
public class CreatePegArrayList implements ColourPegInt {
    private int seed;
    private int colourPegArraySize;
    private int secretCodeSize;







    public void setSeed(int seed) {
        this.seed = seed;
    }


    public void setColourPegArraySize(int colourPegArraySize) {
        this.colourPegArraySize = colourPegArraySize;
    }

    public void createColourPegArrayList(){

        ColourPegs B = new ColourPegs();
        ColourPegs A = new ColourPegs();
        ColourPegs D = new ColourPegs();
        ColourPegs E = new ColourPegs();
        ColourPegs F = new ColourPegs();
        ColourPegs G = new ColourPegs();
        ColourPegs C = new ColourPegs();
        B.setPosition(0);// can randomise the position or will it be redundant
        A.setPosition(1);
        B.setColour("Blue");
        A.setColour("Azure");
        C.setPosition(2);// can randomise the position or will it be redundant
        D.setPosition(3);
        C.setColour("Cyan");
        D.setColour("Denim");
        E.setColour("Ebony");
        E.setPosition(4);
        F.setPosition(5);// can randomise the position or will it be redundant
        G.setPosition(6);
        F.setColour("Flax");
        G.setColour("Gold");

        COLOUR_PEGS_ARRAY_LIST.add(B.getPosition(),B);
        COLOUR_PEGS_ARRAY_LIST.add(A.getPosition(),A);
        COLOUR_PEGS_ARRAY_LIST.add(C.getPosition(),C);
        COLOUR_PEGS_ARRAY_LIST.add(D.getPosition(),D);
        COLOUR_PEGS_ARRAY_LIST.add(E.getPosition(),E);
        COLOUR_PEGS_ARRAY_LIST.add(F.getPosition(),F);
        COLOUR_PEGS_ARRAY_LIST.add(G.getPosition(),G);


        for(ColourPegs p: COLOUR_PEGS_ARRAY_LIST ){

            System.out.println(p.getColour());
        }


        System.out.println(COLOUR_PEGS_ARRAY_LIST.size());



    }



    public ArrayList<String> createSecretPegArrayList(){


        System.out.println("4");


        Random generator = new Random();

        int arrayPosition = generator.nextInt(4);

        System.out.println(arrayPosition);

        // randomly select elements from Colour pegs array and randomly place them in SECRET_PEG_ARRAY_LIST

        for(int i = 0; i < 3 + 1; i++){
            SECRET_PEG_ARRAY_LIST.add(i, COLOUR_PEGS_ARRAY_LIST.get(arrayPosition));

            arrayPosition = generator.nextInt(4);
        }

        String[] secretCodeStringArray;

        //secretCodeStringArray = new String[5];
        ArrayList<String> secretCodeComparetoGuessCode = new ArrayList<>();

        for(ColourPegs p: SECRET_PEG_ARRAY_LIST ){


            System.out.println(p.getColour());

            secretCodeComparetoGuessCode.add(p.getColour());

        }

        return secretCodeComparetoGuessCode;

    }
}
