public abstract class Player { //musi mieć conajmniej jedna metode abstrakcyjna

    private String name;

    public Player(){}

    public Player(String name){
        setName(name);
    }

    public final String getName() { //jeżeli dajemy final do settera to do gettera też
        return name;
    }

    public final void setName(String name) { //final - ostateczna wersja metody, brak możliwości przesłonięcia
        if(name!=null /*&&  name.matches("^[a-zA-Z~]{3,}$")*/) // bezpieczniejszy sposob, bo name moze nie istniec, a pusty lancuch znakow zawsze istnieje
            this.name = name; //this wskazuje na obiekt n którym jest wywoływana metoda setName
        else{
            //System.err.println("Name can't be null");
            throw new IllegalArgumentException("Nieprawidłowe imię!"); //rzucamy wyjątek, przechodzi z playera do maina
        }

    }

    public abstract int guess();

    @Override
    public String toString(){
        return name;
    }
}
