package TacToe;

public class PlayVerification {
    //return true or false
    //I used this class as a substitute of PlayBool(Main), 
    //cuz I'd hv to write PlayBool(blablabla) all the time
    private boolean verification;
    public PlayVerification(){
        this.verification=true;
    }

    public boolean getVerification(){
        return this.verification;
    }
    public void setVerification(boolean verification){
        this.verification=verification;
    }
}
