import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random=new Random();
         //playera można uogólnić, cząstką każdego innego playera będzie player
        Statistics stats=new Statistics();
        Game game1=new Game(null);

//        List <String> list=new ArrayList();
//        list.add(player.getName());

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        Iterator itr=list.iterator();

//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        for(Iterator<String> itr2=list.iterator(); itr2.hasNext(); ){
//            System.out.println(itr2.next());
//        }


//        try {
//            player.setName(null); //regex101.com [a-zA-Z~]{3,}
//        } catch (IllegalArgumentException ex) {
//            System.err.println("BŁĄD!" + ex.getMessage()); //można dodawać wiele catchy, każdy dla innego wyjątku
//        } catch (Exception ex){
//            System.out.printf("Skontaktuj się z administratorem."); // złapie każdy inny wyjątek niż te wyżej
//        }

        //konstrukor wskazuje obiekt jakiej klasy chcemy utworzyc, polimorfizm - wielopostaciowosc, dany obiekt moze przyjmowac wiele postaci


//        game1.addPlayer(new PlayerComputer("Justyna"));
//        game1.addPlayer(new PlayerComputer("Justyna"));
//        game1.addPlayer(new PlayerComputer("Justyna"));
//        game1.addPlayer(new PlayerComputer("Justyna"));
//        game1.addPlayer(new PlayerComputer("Justyna"));
//        game1.addPlayer(new PlayerComputer("Justyna"));

        game1.addPlayer(new PlayerComputer("Justyna"));
        game1.addPlayer(new PlayerComputer("Ania"));

        game1.play();
        game1.play();
        game1.play();

        System.out.println();
        game1.printStats();

        //game1.showPlayers();


    }
}
