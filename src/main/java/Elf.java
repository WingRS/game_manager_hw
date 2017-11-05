/**
 * Created by StasMaster on 30.10.17.
 */
public class Elf extends Character {

    protected int hp = 10;
    protected int power = 10;

    @Override
    public void kick(Character c) {
        if (c.power < this.power)
            c.hp = 0;
        else
            c.power--;

    }

}
 