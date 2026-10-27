public class Archer extends charArchetype{

    private int arrows;
    private int agility;

    public Archer (String name, int hp, int level, int arrows, int agility) {

        super(name, hp, level);

        this.arrows = arrows;

        this.agility = agility;




    }


    @Override


    public String attack() {


        return getName() + " fires an arrow! ";




    }


    @Override


    public int takeDamage(int incomingDamage) {




        int actualDamage = incomingDamage;




        if (agility >= 8) {


            agility = agility - 8;


            actualDamage = actualDamage/2;
        }


        reduceHp(actualDamage);


        return actualDamage;




    }


    @Override


    public String describe() {


        return getName() +

                " is a level " + getLevel() +
                " Archer with " + getHp() + " HP, " +
                arrows + " arrows, and " +
                agility + " agility. ";




    }










}
