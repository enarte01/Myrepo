import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by genie on 02/03/2016.
 */
public interface ColourPegInt {

    ArrayList<ColourPegs> COLOUR_PEGS_ARRAY_LIST = new ArrayList<>();

    ArrayList<ColourPegs> SECRET_PEG_ARRAY_LIST = new ArrayList<>();




    void createColourPegArrayList();
    ArrayList<String> createSecretPegArrayList();
}
