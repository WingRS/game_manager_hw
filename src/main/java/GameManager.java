import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by StasMaster on 05.11.17.
 */
public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println();
        System.out.println("OPEN THE AREEEEENAAAA");
        System.out.println();
        System.out.println("IN THE LEFT CORNER " + c1.getClass() + " PREPARES TO FIGHT : ARRR!!!!");
        System.out.println("IN THE RIGHT CORNER " + c2.getClass() + " PREPARES TO FIGHT : ARRR!!!!");

        int first = ThreadLocalRandom.current().nextInt(1, 3);
        boolean whoFirst = true;
        switch (first){

            case 1 :
                System.out.println("FIRST WILL ATTACK "+c1.getClass());
                c1.kick(c2);
                break;
            case 2 :
                System.out.println("FIRST WILL ATTACK "+ c2.getClass());
                c2.kick(c1);
                whoFirst = false;
                break;
        }

        while ( ( c1.hp != 0 ) || ( c2.hp != 0 ) ) {

            if(whoFirst) {
                System.out.println(c2.getClass()+ " ATTACKS " + c1.getClass());
                c2.kick(c1);
                System.out.println(c2.getClass() + " leaves "+c1.getClass() + " with" + c1.hp + " hp");
                if(c1.hp <= 0){
                    break;
                }
                whoFirst = false;
            }else {
                System.out.println(c1.getClass()+ " ATTACKS " + c2.getClass());
                c1.kick(c2);
                System.out.println(c1.getClass() + " leaves "+c2.getClass() + " with " + c2.hp + " hp");
                if(c2.hp <= 0){
                    break;
                }
                whoFirst = true;
            }

        }

        if(c1.hp <= 0) {
            System.out.println(c2.getClass() + " KILLS " + c1.getClass() + " HONOUR HIM WITH APPLAUSE");
        }else  if ( c2.hp <= 0) {
            System.out.println(c1.getClass() + " KILLS " + c2.getClass() + " HONOUR HIM WITH APPLAUSE");
        }



    }

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        for(int i = 0; i<20; i++) {
            new GameManager().fight(factory.CreateCharacter(), factory.CreateCharacter());
        }
    }



}
