package javaapplication7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Random random = new Random();
        Player player = new PlayerHuman();
        List<String> list = new ArrayList();
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        //String lista =list.toString().replace(",", "").replace("[", "").replace("]", "").trim();
        //System.out.println(lista);
        /*for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }*/
        /*Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        for(Iterator<String> it=list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        Game game = new Game();//playera można uogólnić, cząstką każdego innego playera będzie player
        game.addPlayer(player);
        game.play();
//konstrukor wskazuje obiekt jakiej klasy chcemy utworzyc, polimorfizm - wielopostaciowosc, dany obiekt moze przyjmowac wiele postaci
        /*try {
            player.setName("bz13");
        } catch (IllegalArgumentException ex) {
            System.err.println("BLAD " + ex.getMessage());
        }*/
*/
        Random random=new Random();
        Game game1=new Game();
        game1.addPlayer(new PlayerHuman("Janusz"));
        game1.addPlayer(new PlayerHuman("Janusz"));
        game1.addPlayer(new PlayerHuman("Janusz"));
        game1.play();
        game1.printPlayers();

    }

}
