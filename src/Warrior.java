public class Warrior extends charArchetype {

    private int strength;

    private int armor;

    public Warrior(String name, int hp, int level, int strength, int armor) {

        super(name, hp, level);

        this.strength = strength;

                this.armor = armor;

    }

    @Override
    public String attack() {

        return getName() + "Swings a large greatsword for heavy damage ";

    }

    @Override
    public int takeDamage(int incomingDamage) {

 int actualDamage = incomingDamage;

  if (armor >= 10) {

      armor = armor - 10;


      actualDamage = actualDamage /2;


  }

  reduceHp(actualDamage);

  return actualDamage;


    }

   @Override
    public String describe() {


        return getName() +
                " is a level " + getLevel() +
                " Warrior with " + getHp() + " HP, " +
                armor + " armor, and " +
                strength + "strength. ";

   }


}
