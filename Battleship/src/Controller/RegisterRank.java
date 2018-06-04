package Controller;

import Model.DatePlayer;

public class RegisterRank {

    public boolean registerPlayer(DatePlayer d) {
        boolean result = false;
        if (d != null && d.getNickname().length() > 0 && d.getPointers() > 0) {
            RankManeger.getInstance().registreRank(d);
            result = true;
        }
        return result;
    }

}
