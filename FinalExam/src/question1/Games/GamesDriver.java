/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Games;

/**
 *
 * @author Sandeep Nadendla
 */
public class GamesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 1 Answer: Sandeep Nadendla");
        Badminton L1 = new Badminton(123, 12);
        System.out.println(L1);
        L1.gamesOutput();
        L1.outDoorGamesType();

    }

}
