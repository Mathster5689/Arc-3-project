public class Necromancer extends charArchetype implements Castable {


    private int soulEnergy;


    private int summons;




    public Necromancer(String name, int hp, int level,
                       int soulEnergy, int summons) {


        super(name, hp, level);


        this.soulEnergy = soulEnergy;
        this.summons = summons;




    }


    @Override
    public String attack() {




        return getName() + " unleashes dark magic!";




    }




    @Override
    public int takeDamage(int incomingDamage) {




        int actualDamage = incomingDamage;




        if (soulEnergy >= 10) {


            soulEnergy = soulEnergy - 10;


            actualDamage = actualDamage / 2;


        }


        reduceHp(actualDamage);




        return actualDamage;




    }




    @Override
    public String describe() {
        return getName() +
                " is a level " + getLevel() +
                " Necromancer with " + getHp() + " HP, " +
                soulEnergy + " soul energy, and " +
                summons + " summons.";




    }




    @Override


    public String castSpell() {


        return getName() + "Summons a  very large and powerful minion";






    }


}

