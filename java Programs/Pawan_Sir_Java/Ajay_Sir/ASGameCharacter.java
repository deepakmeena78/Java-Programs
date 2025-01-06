/*
 * Problem Statement

Jessica is tasked with designing a fantasy game character system. The system includes an abstract class named GameCharacter with two abstract methods: attack() and defend(). 

Two subclasses, Warrior and Wizard, extend the GameCharacter class. 

The program prompts the player to choose a character class (1. Warrior, 2. Wizard) and input their character's strength or magic power. The dynamic calculations involve tripling the strength (strength * 3) for the Warrior's attack and doubling the magic power(power * 2) for the Wizard's attack.

Jessica needs your help in completing the program. Help her finish it.
Input format :
The first line of input consists of an integer, representing the choice of the character - 1 for Warrior and 2 for Wizard.
If the choice is 1, the second line consists of an integer N, representing the strength.
If the choice is 2, the second line consists of an integer M, representing the magic power.
Output format :
If the choice is 1, the output displays the actions of a warrior in the following format:
"Warrior Actions:
Attack: Powerful sword slash for [result] damage!
Defend: Raises shield, defence boosted by [N]!"

If the choice is 2, the output displays the actions of a wizard in the following format:
"Wizard Actions:
Attack: Casts spell, deals [result] magical damage!
Defend: Creates magical barrier, defence boosted by [M]!"

If any other choice is given, print "Invalid choice".

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ M, N ≤ 106
Sample test cases :
Input 1 :
1
68
Output 1 :
Warrior Actions:
Attack: Powerful sword slash for 204 damage!
Defend: Raises shield, defence boosted by 68!
Input 2 :
2
998
Output 2 :
Wizard Actions:
Attack: Casts spell, deals 1996 magical damage!
Defend: Creates magical barrier, defence boosted by 998!
Input 3 :
3
76
Output 3 :
Invalid choice
 */

import java.util.Scanner;

abstract class GameCharacter {
    abstract public void attack();

    abstract public void defend();
}

class Warrior extends GameCharacter {
    int strength;

    public Warrior(int strength) {
        this.strength = strength;
    }

    public void attack() {
        System.out.println("Attack: Powerful sword slash for " + strength * 3 + " damage!");
    }

    public void defend() {
        System.out.println("Defend: Raises shield, defence boosted by " + strength);
    }
}

class Wizard extends GameCharacter {
    int power;

    public Wizard(int power) {
        this.power = power;
    }

    public void attack() {
        System.out.println("Attack: Casts spell, deals " + power * 2 + " magical damage!");
    }

    public void defend() {
        System.out.println("Defend: Creates magical barrier, defence boosted by " + power);
    }
}

public class ASGameCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter Warrior Actions : ");
            int n = sc.nextInt();

            if (n == 1 || n == 2) {

                System.out.println("Enter Helth : ");
                int num = sc.nextInt();

                flag = false;
                if (n == 1) {
                    Warrior w = new Warrior(num);
                    w.attack();
                    w.defend();
                } else if (n == 2) {
                    Wizard z = new Wizard(num);
                    z.attack();
                    z.defend();
                }
            } else {
                System.out.println("Enter Please Valid Number :  1/2");
            }
        }
    }
}
