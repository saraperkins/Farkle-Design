package edu.up.cs301.farkle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import edu.up.cs301.game.GameHumanPlayer;
import edu.up.cs301.game.GameMainActivity;
import edu.up.cs301.game.infoMsg.GameInfo;

/**
 * represents a human player in the game, allowing the person to interact with the
 * gui in order to play
 *
 * @author Alexa Baldwin
 * @author Levi Banks
 * @author Sara Perkins
 * @author Briahna Santillana
 * @version 22 March 2016
 */
public class FarkleHumanPlayer extends GameHumanPlayer implements View.OnClickListener {
    /* ---=== Instance Variables ===--- */
    // text views
    protected TextView p0scoreText, p1scoreText, runningTotalText;

    // buttons
    protected Button rollDiceButton, bankPointsButton;
    protected ImageButton[] diceButtons;

    // image res id's
    protected int[] diceWhiteResID;
    protected int[] diceRedResID;

    // game play variables
    private GameMainActivity myActivity;
    private FarkleState myState;

    /**
     * constructor for a human player
     *
     * @param name name of the player
     */
    public FarkleHumanPlayer(String name) {
        super(name);
    }

    /**
     * Returns the GUI's top view object
     *
     * @return the top object in the GUI's view heirarchy
     */
    @Override
    public View getTopView() {
        return null;
    }

    /**
     * callback method when we get a message (e.g., from the game)
     *
     * @param info the message -- to be used if a game state
     */
    @Override
    public void receiveInfo(GameInfo info) {

    }

    /**
     * callback method--our game has been chosen/rechosen to be the GUI,
     * called from the GUI thread
     * sets all of the view variables
     *
     * @param activity the activity under which we are running
     */
    public void setAsGui(GameMainActivity activity) {

    }

    /**
     * handle all click events -- actions made by player
     * @param button view that was clicked
     */
    public void onClick(View button) {

    }

    /**
     * display the die using the image id's
     */
    public void displayDie() {

    }

    /**
     * set the display based on the current state
     */
    protected void updateDisplay() {

    }

}
