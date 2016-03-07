public class Factory {

    public static Game getInstance(Class c, Boolean b) {


        Game g = null;
        if (EasyGameBoard.class.equals(c)) {
            return new EasyGameBoard(b) ;


            }

        return null;
        }
    }

