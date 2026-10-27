public abstract class charArchetype {

    private String name;
    private int hp;
    private int level;


    public abstract String attack();


    public abstract int takeDamage(int incomingDamage);


    public abstract String describe();


    public charArchetype(String name, int hp, int level) {


        this.name = name;
        this.hp = hp;
        this.level = level;


    }


    public String getName() {


        return name;
    }


    public int getHp() {


        return hp;
    }


    public int getLevel() {
        return level;
    }

    public void reduceHp(int amount) {

        hp = hp - amount;

        if (hp < 0) {

            hp = 0;

        }

    }



}

