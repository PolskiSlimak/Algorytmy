import java.awt.*;
import java.util.HashMap;

public class Statistics {

    private HashMap<Player, Integer> scores=new HashMap<Player, Integer>();


    void winner(Player player){
        int score=scores.getOrDefault(player, 0);
        score++;
        scores.put(player, score);
    }

    void print(){
        for (Player keys : scores.keySet())
        {
            System.out.println(keys + ": " + scores.get(keys));
        }
    }

    void reset(){
        scores.clear();
    }
}
