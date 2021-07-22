package TacToe;

public class Visual {

    //Check if the space is available

    private char symbol;
    public Visual(){
        this.symbol=' ';
    }

    public char getSimbol(){
        return this.symbol;
    }
    public void setSimbol(char symbol){
        if(this.symbol==' ')
            this.symbol=symbol;
        else
            System.out.println("This space is not available!");
    }
}
