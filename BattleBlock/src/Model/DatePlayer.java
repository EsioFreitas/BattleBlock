package Model;

public class DatePlayer {

    private int pointers;
    private String nickname;

    public int getPointers() {
        return pointers;
    }

    public void setPointers(int pointers) {
        if(pointers >= 0){
            this.pointers = pointers;
        }
        
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if(nickname != ""){
            this.nickname = nickname;
        }
        
    }

}
