public class StarterCode {

}

// Monster.java
public class Monster {
  // TODO: Add properties for your monster here!
  // Think about what a monster needs:
  // - A name
  // - Health
  // - Type (like "Fire", "Water", or "Rock")
  // - Special move name

  // TODO: Create a constructor that sets up your monster
  // Remember: A constructor looks like this:
  // public Monster(type1 param1, type2 param2, ...) {
  //    this.something = something;
  // }

  // TODO: Create methods to get your monster's information
  // For example:
  // public String getName() {
  //    return name;
  // }

  // TODO: Create a method that reduces health when hit
  public void takeDamage(int amount) {
    // Your code here!
    // Remember: Health shouldn't go below 0
  }

  // TODO: Create your monster's special attack
  public int useSpecialMove() {
    // Your code here!
    // Return how much damage this attack should do
    // Hint: Different types could do different damage!
  }

  // TODO: Create a method to display monster information
  public void printInfo() {
    // Your code here!
    // Print the monster's name, health, and type
  }

  // TODO: Add any other cool methods you want!
  // Maybe:
  // - A method to heal your monster?
  // - A method to check if your monster is strong against another type?
  // - A method to level up your monster?
}

// Game.java
public class Game {
  public static void main(String[] args) {
    // TODO: Create monsters here!
    // For example:
    // Monster playerMonster = new Monster(...);
    // Monster computerMonster = new Monster(...);

    // TODO: Add code to make them battle!
    // Think about:
    // 1. How will you show the battle is starting?
    // 2. How will monsters take turns?
    // 3. When will the battle end?
    // 4. How will you show who won?

    // TODO: Make the battle fun!
    // Ideas:
    // - Print exciting battle messages
    // - Add special effects for different types
    // - Let monsters sometimes miss their attacks
    // - Add healing items
  }
}
/*
This is a stub class, it doesn't do anything but hold the starter code. You will have to separate the
code into separate files on your own.
 */