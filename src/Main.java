import java.util.ArrayList;




public static void main (String[] args) {


    ArrayList<charArchetype> party = new ArrayList<>();


    party.add(new Mage("Zadel", 60, 18, 80, 100));




    Mage mage = new Mage("Zadel", 60, 18, 80, 100);
    System.out.println(mage.castSpell());




    party.add(new Warrior("Alaric", 100, 25, 125, 80));




    party.add(new Archer("Elara", 40, 16, 100, 115));




    party.add(new Necromancer("Xavian", 50, 20, 120, 500 ));




    Necromancer necro = new Necromancer("Xavian", 50, 20, 120, 500);
    System.out.println(necro.castSpell());




    for (charArchetype character : party) {




        System.out.println(character.describe());
        System.out.println(character.attack());




    }




}


