/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mulle
 */
public class Game {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    
    public Game(String team1, String team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
    }
    
    public String getTeam1() {
        return this.team1;
    }
    
    public String getTeam2() {
        return this.team2;
    }
    
    public String winner() {
        if (this.score1 > this.score2) {
            return this.team1;
        } else {
            return this.team2;
        }
    }
    

}
