package edu.up.cs301.farkle;

import java.util.ArrayList;

import edu.up.cs301.game.GameMainActivity;
import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.config.GameConfig;
import edu.up.cs301.game.config.GamePlayerType;

/**
 * This contains the activity for the Farkle game.
 *
 * @author Alexa Baldwin
 * @author Levi Banks
 * @author Sara Perkins
 * @author Briahna Santillana
 * @version 15 March 2016
 */
public class FarkleMainActivity extends GameMainActivity {
	// for networked play
	private static final int PORT_NUMBER = 2234;

	/**
	 * Create the default configuration for this game:
	 * - one human player vs. one computer player
	 * - minimum of 1 player, maximum of 2
	 * - one kind of computer player and one kind of human player available
	 *
	 * @return the new configuration object, representing the default configuration
	 */
	@Override
	public GameConfig createDefaultConfig() {
		return null;
	}

	/**
	 * create a local game
	 *
	 * @return the local farkle game
	 */
	@Override
	public LocalGame createLocalGame() {
		return null;
	}
}
