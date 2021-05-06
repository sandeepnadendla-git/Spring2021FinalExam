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
public class Badminton implements Games_Interface,OutdoorGames_Interface  {
    private int noOfRackets;
    private int noofPlayers;

    public Badminton(int noOfRackets, int noofPlayers) {
        this.noOfRackets = noOfRackets;
        this.noofPlayers = noofPlayers;
    }

    public int getNoOfRackets() {
        return noOfRackets;
    }

    public void setNoOfRackets(int noOfRackets) {
        this.noOfRackets = noOfRackets;
    }

    public int getNoofPlayers() {
        return noofPlayers;
    }

    public void setNoofPlayers(int noofPlayers) {
        this.noofPlayers = noofPlayers;
    }

    @Override
    public String toString() {
        return "Badminton{" + "noOfRackets=" + noOfRackets + ", noofPlayers=" + noofPlayers + '}';
    }
    

    @Override
    public void gamesOutput() {
        System.out.println("Inside Badminton");
    }

    @Override
    public void outDoorGamesType() {
               System.out.println("Inside outdoor Games:Badminton");
    }
    
    
}
