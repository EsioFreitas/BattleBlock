 package Controller;

import Model.DatePlayer;
import java.util.ArrayList;

public class RankManeger {

    ArrayList<DatePlayer> datePlayers;
    private static RankManeger instance;

    private long contPlayers = 1;

    public RankManeger() {
        datePlayers = new ArrayList<DatePlayer>();
    }

    public static RankManeger getInstance() {
        if (instance == null) {
            instance = new RankManeger();
        }
        return instance;
    }

    public void registreRank(DatePlayer datePlayer) {
        datePlayers.add(datePlayer);
        contPlayers++;

    }

    public long getContPlayers() {
        return contPlayers;
    }

    public ArrayList<DatePlayer> getLista() {
        return datePlayers;
    }

}
