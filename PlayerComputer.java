import java.util.Random;

public class PlayerComputer extends Player{ //Singleton - kontrolowanie tego ile jest instancji

    Random brain=new Random();
    private int hit;

    public PlayerComputer() {}

    public PlayerComputer(String name) {
        super(name);
    }

    public int guess(){
        hit=brain.nextInt(6)+1;
        return hit;
    }
}
