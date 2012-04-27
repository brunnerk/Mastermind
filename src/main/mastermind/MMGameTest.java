package main.mastermind;

import junit.framework.TestCase;

// -------------------------------------------------------------------------
/**
 * This is the test class of the mastermind model (MMGame) class
 * 
 * @author Kevin Brunner (brunnerk)
 * @version (2012.04.27)
 */

public class MMGameTest
    extends TestCase
{
    /**
     * This is a new MMGame object for the test class.
     */
    MMGame test;
    /**
     * Array of integers representing the board
     */
    int[]  board;


    // ----------------------------------------------------------
    /**
     * Create a new MMGameTest object.
     */
    public MMGameTest()
    {
        // The constructor is usually empty in unit tests
    }


    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp()
    {
        board = new int[4];
        board[0] = 0;
        board[1] = 1;
        board[2] = 2;
        board[3] = 3;
        test = new MMGame(board);

    }


    // ----------------------------------------------------------
    /**
     * Tests all the methods in the MMGame class
     */
    public void testCalculateClueAndWon()
    {
        int[] result = test.calculateClue(board);
        assertEquals(4, result[0]);
        assertEquals(0, result[1]);
        assertTrue(test.isWon());
        board[3] = 0;
        assertEquals(3, result[0]);
        assertEquals(1, result[1]);
        assertFalse(test.isWon());
    }
}
