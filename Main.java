package TacToe;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        int line=3,column=3;
        Visual[][] visual = new Visual[line][column];
        Scanner scan = new Scanner(System.in);
        PlayVerification verification=new PlayVerification();
        
        boolean game = false;
        char symbol = 'X';
        String victory="";



        //Start

        System.out.println("Do you want to play? ");
        char ans = scan.nextLine().charAt(0);

        if(ans=='y'||ans=='Y')
            game=true;

        while(game){
            try {
                System.out.println("\n-----------------------------------");
                System.out.println("");
                //draw the visual
                drawGame(visual);

                //coords
                returnLine(scan, line);
                returnColumn(scan, column);
                //check if the coord were correct/available
                playBool(visual, line, column, symbol);
                //if the playBool returns true, thisSimbol change the symbol from X to O
                thisSimbol(verification, symbol);

                //Change the visual
                Game gameChange = new Game(symbol, visual, line, column);

                //this game=false is just for tests
                game=false;


            } catch (Exception e) {
                System.out.println("Error!");
                game=false;
            }
            //if vitoria alguma coisa
            
        }//usar continue para se a jogada for invalida, ent se o simbolo for diferente do aceitavel
        //ele nao vai inicializar o p2

    }



    //-----------------------------------------------------------------
    //visual
    public static void drawGame(Visual[][] visual){
        clean();
        System.out.printf("    0    1    2\n");
        System.out.printf("0   %c | %c | %C \n", visual[0][0].getSimbol(),visual[0][1].getSimbol(),visual[0][2].getSimbol());
        System.out.printf("   --------------\n");
        System.out.printf("1   %c | %c | %C \n",visual[1][0].getSimbol(),visual[1][1].getSimbol(),visual[1][2].getSimbol());
        System.out.printf("   --------------\n");
        System.out.printf("2   %c | %c | %C \n",visual[2][0].getSimbol(),visual[2][1].getSimbol(),visual[2][2].getSimbol());
            
        
    }
    //clean the visual of old plays
    public static void clean(){
        for(int i=0;i<50;i++){
            System.out.println(" ");
        }
    }
    //------------------------------------------------------------------


    //------------------------------------------------------------------
    //coords
    public static int returnLine(Scanner scan, int line){
        System.out.println("Line: ");
        line = scan.nextLine().charAt(0);
        return line;
    }
    public static int returnColumn(Scanner scan, int column){
        System.out.println("column: ");
        column = scan.nextLine().charAt(0);
        return column;
    }
    //------------------------------------------------------------------

    //------------------------------------------------------------------
    //change the player
    public static char thisSimbol(PlayVerification verification, char symbol){
        if(verification.getVerification())
            symbol='X';
        else
            symbol='O';
        return symbol;
    }
    public static char thisSimbol2(PlayVerification verification, char symbol){
        if(verification.getVerification())
            symbol='O';
        else
            symbol='X';
        return symbol;
    }
    
    //verify if the play is available and change the space
    public static boolean playBool(Visual[][] visual, int line, int column, char symbol){
        PlayVerification verification = new PlayVerification();
        if(visual[line][column].getSimbol()==' '){
            visual[line][column].setSimbol(symbol);
            verification.setVerification(true);
            return verification.getVerification();
        }else{
            verification.setVerification(false);
            return verification.getVerification();
        }
    }
    //------------------------------------------------------------------


    //im still writing this part
    public static void victory(Visual[][] visual){

    }
}


