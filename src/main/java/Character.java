/**
 * Created by StasMaster on 30.10.17.
 */
public abstract class  Character {
    protected int power;
    protected int hp;

    public abstract void kick(Character c);
    public boolean isAlive() {
        return hp > 0;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
