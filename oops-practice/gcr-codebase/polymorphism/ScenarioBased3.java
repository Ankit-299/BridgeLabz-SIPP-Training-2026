// 3. Adventure Game Character System
// Scenario:
// A game contains different characters:
// ● Warrior
// ● Mage
// ● Archer
// All characters can attack, but each attacks differently.
// Create a superclass GameCharacter containing:
// String characterName;
// Method:
// performAttack()
// Subclasses:
// ● Warrior
// ● Mage
// ● Archer
// Override performAttack().
// Requirements:
// 1. Store all characters inside a GameCharacter[] array.
// 2. Character names are stored as strings.
// 3. Create a method:
// startBattle(GameCharacter[] characters)
// which invokes attacks polymorphically.
// 4. Count how many Warriors, Mages, and Archers participated.
public class ScenarioBased3 {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[5];
        characters[0] = new Warrior("Conan");
        characters[1] = new Mage("Gandalf");
        characters[2] = new Archer("Legolas");
        characters[3] = new Warrior("Xena");
        characters[4] = new Mage("Merlin");

        startBattle(characters);
    }
    public static void startBattle(GameCharacter[] characters) {
        int warriors = 0, mages = 0, archers = 0;
        for (GameCharacter gc : characters) {
            if (gc == null) continue;
            gc.performAttack();
            if (gc instanceof Warrior) warriors++;
            else if (gc instanceof Mage) mages++;
            else if (gc instanceof Archer) archers++;
        }
        System.out.println("Warriors: " + warriors);
        System.out.println("Mages: " + mages);
        System.out.println("Archers: " + archers);
    }

}

abstract class GameCharacter {
    String characterName;
    GameCharacter(String name) { this.characterName = name; }
    abstract void performAttack();
}

class Warrior extends GameCharacter {
    Warrior(String name) { super(name); }
    @Override
    void performAttack() { System.out.println(characterName + " swings a sword!"); }
}

class Mage extends GameCharacter {
    Mage(String name) { super(name); }
    @Override
    void performAttack() { System.out.println(characterName + " casts a fireball!"); }
}

class Archer extends GameCharacter {
    Archer(String name) { super(name); }
    @Override
    void performAttack() { System.out.println(characterName + " shoots an arrow!"); }
}
