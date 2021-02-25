
/**
 * A number guessing game.
 *
 * @author (Ryan M Hufford)
 * @version (02/24/21)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        if (g == chosenNum){
            return 0;
        }
        else if (g < chosenNum){
            return -1;
        }
        else {
            return 1;}

    }
}