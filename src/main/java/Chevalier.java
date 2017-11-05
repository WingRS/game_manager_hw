import java.util.concurrent.ThreadLocalRandom;


public class Chevalier extends Character {



    Chevalier(int minHp, int maxHp, int minPower, int maxPower) {

        hp = randPoints(minHp,maxHp);
        power = randPoints(minPower,maxPower);

    }

    public int randPoints(int min, int max){
        return  ThreadLocalRandom.current().nextInt(min, max+1);
    }

    public  void kick(Character c) {
        int kickPower = ThreadLocalRandom.current().nextInt(1, power+1);
        System.out.println("KICKING WITH POWER "+ kickPower);
        c.hp = c.hp - kickPower;
        if( c.hp <= 0) {
            c.hp = 0;
        }
    }

}
