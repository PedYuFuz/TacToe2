package TacToe;

public class Game {
    public Game(char simbol,Visual[][] visual, int line, int column){
        //basicly change turns, so when x plays, and the play is  verified, 
        //Game.java change to 'O symbol', so the next player nca play
        if(simbol=='X'){
            visual[line][column].setSimbol('X');
        }
        else if(simbol=='O'){
            visual[line][column].setSimbol('O');
        }else{
            System.out.println("Error");
        }
    }
}
