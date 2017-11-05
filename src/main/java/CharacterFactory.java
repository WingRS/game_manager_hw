import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by StasMaster on 05.11.17.
 */
public class CharacterFactory {

    public Character CreateCharacter(){

       int character =   ThreadLocalRandom.current().nextInt(1, 5);
       switch (character){
           case 1 :
               return new Hobbit();
           case 2 :
               return new Elf();
           case 3 :
               return new King();
           case 4 :
               return new Knight();


       }
        return new Hobbit();
    }



}
