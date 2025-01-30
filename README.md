# 🏆 Monster Battle Game - Step-by-Step Guide

Welcome to the **Monster Battle Game**! In this project, you will create a **turn-based battle** where monsters fight each other using special moves. You'll learn about **classes, objects, methods, and game logic** while having fun!

## 🎯 Goal of the Project
- Each player has a **monster**.
- Monsters have **health, a type, and a special move**.
- They take turns attacking each other.
- The first monster to reach **0 health loses**.
- Different types have strengths and weaknesses!

---

## 🔧 Step 1: Set Up Your Project in IntelliJ IDEA
1. **Open IntelliJ IDEA.**
2. **Create a new Java project**:
    - Click on **"New Project"** → **Choose Java** → **Click "Create"**.
3. **Inside the `src` folder**, create two files:
    - `Monster.java` → This will store the details of each monster.
    - `Game.java` → This will run the battle.

---

## 🏗 Step 2: Build Your Monster Class (`Monster.java`)

This class will represent a **monster**. Each monster has a **name, health, type, and special move**.

### 📝 1. Add Monster Properties (Instance Variables)
- Find the section that says **"Add properties for your monster"**.
- Add **private variables** to store:
    - **Monster’s name** (Example: "Sparky")
    - **Monster’s health** (Example: 100 HP)
    - **Monster’s type** (Example: Fire, Water, Rock)
    - **Monster’s special move name** (Example: "Flame Burst")

💡 **Hint:** Private variables mean they are only accessible inside the class.

---

### 🛠 2. Create a Monster Constructor
- Find the section that says **"Create a constructor"**.
- The constructor should take **four parameters** (name, health, type, and special move).
- Inside the constructor, **assign** these parameters to the monster’s properties.

💡 **Hint:** A constructor is a special method that runs when a new monster is created.

---

### 🔍 3. Create Get Methods (Getters)
- Find the section that says **"Create methods to get your monster’s information"**.
- Create **getter methods** to return:
    - The **monster's name**
    - The **monster's health**
    - The **monster's type**
    - The **monster's special move**

💡 **Hint:** Each method should return the **value of one property**.

---

### 💥 4. Implement the Damage System
- Find the **takeDamage() method**.
- Inside this method:
    1. **Subtract** the given amount from the monster’s health.
    2. **Make sure the health never goes below 0** (Use an `if` statement).

💡 **Example:** If a monster has 20 health and takes 30 damage, its health should **stay at 0**, not -10!

---

### 🌟 5. Add a Special Move Attack
- Find the **useSpecialMove() method**.
- Inside this method:
    1. Decide **how much damage** the move does.
    2. Add **type advantages** (Example: Water does extra damage to Fire).
    3. Return the **damage amount**.

💡 **Hint:** If a monster has a type advantage, it could **double its damage**!

---

### 📢 6. Add a Method to Display Monster Info
- Find the **printInfo() method**.
- Make it **print the monster’s details**, including:
    - Name
    - Health
    - Type
    - Special move name

💡 **Example Output:**
Monster Name: Sparky Health: 100 Type: Fire Special Move: Flame Burst

markdown
Copy
Edit

---

## ⚔ Step 3: Create the Battle System (`Game.java`)

This class will **run the battle** between two monsters.

### 🎭 1. Create Two Monsters
- Find the section **"Create monsters here!"**.
- Create:
    - A **player’s monster** (Example: Sparky the Fire Type).
    - A **computer’s monster** (Example: Splashy the Water Type).
- Print their **starting stats** using `printInfo()`.

---

### 🎮 2. Make Monsters Take Turns
- Find the **battle system section**.
- Inside a loop:
    1. **Player’s turn:**
        - Print **"Your turn!"**
        - Player’s monster **uses special move**.
        - Computer monster **takes damage**.
    2. **Computer’s turn:**
        - Print **"Computer's turn!"**
        - Computer’s monster **uses special move**.
        - Player’s monster **takes damage**.

💡 **Hint:** Repeat this until one monster’s health **reaches 0**.

---

### 🏆 3. End the Game and Announce the Winner
- After the battle loop:
    1. **Check who won** (The monster with **health > 0** wins).
    2. Print a **winning message**.

💡 **Example Output:**
Splashy has fainted! Sparky wins the battle! 🎉

yaml
Copy
Edit

---

## 🎨 Step 4: Make It More Fun!
Here are some **fun ideas** to make your game better:
✅ **Add random chance to miss attacks**  
✅ **Make healing items**  
✅ **Allow players to choose a monster**  
✅ **Add more monster types (Grass, Electric, Ice, etc.)**  
✅ **Create monster leveling**

---

## 🛠 Step 5: Test Your Game! 🔍
After every step:
1. **Save your code**.
2. **Run the program** in IntelliJ.
3. **Check for errors** (Look at the error message).
4. **Fix mistakes** and try again.

---

## ❓ If You Get Stuck
- Print values to **check what’s happening**.
- Make sure **all { } brackets match**.
- **Check spelling** of variable names.
- Remember: Every line **must end with a `;`**.
- Ask for help! **Even great coders get stuck sometimes**.

---

## 🚀 Bonus Challenges
Once your game is working, try these:
1. **Add a healing move** (A monster can heal instead of attacking).
2. **Add more types of monsters** with different strengths.
3. **Give monsters multiple special moves**.
4. **Add items** (like shields or attack boosts).
5. **Make the computer smarter** (Use strategy instead of random attacks).

---

## 🎉 Congratulations!
You’ve built a **turn-based Monster Battle Game!** 🏆

Have fun battling with your monsters! 💥🔥💧