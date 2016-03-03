public class MastermindDriver {

    // Example - change as you need to...
    public static void main(String[] args) {
        ////Game g = Factory.getInstance(Game.class, true);
        ////g.runGames();


        /*
        * the user shld be asked to set the size of the secret code they want to play
        * as well as the boolean value
        *
        * */

       // g = Factory.getInstance(Game.class, false);
       // g.runGames();




        CreatePegArrayList c = new CreatePegArrayList();

        c.createColourPegArrayList();

       // c.createSecretPegArrayList();

        EasyGameBoard easyGame = new EasyGameBoard();

        easyGame.runGames();
    }
}