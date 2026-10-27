public class Mage extends charArchetype implements Castable{


    private int mana;


    private int spellPower;


    public Mage(String name, int hp, int level, int mana, int spellPower) {


        super(name, hp, level);


        this.mana= mana;


        this.spellPower = spellPower;




    }


    @Override


    public String attack() {


        return getName() + "hurls up a fireball ";


    }


    @Override


    public int takeDamage(int incomingDamage) {




        int actualDamage = incomingDamage;






        if(mana >= 5) {


            mana = mana - 5;


            actualDamage = actualDamage /2;


        }




        reduceHp(actualDamage);
        return actualDamage;


    }




    @Override


    public String describe() {


        return getName() +
                " is a Level " + getLevel() +
                " Mage with " + getHp() + " HP, " +
                mana + " mana, and " +
                spellPower + " spell power.";






    }


    @Override


    public String castSpell() {


        return getName() + "Uses a very powerful thunder strike attack";


    }




}


