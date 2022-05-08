package Units;

public abstract class BaseUnit {
    char name = 'X';
    int speed = 1;
    int health = 100;
    int rangeSight = 5;
    int rangeAttack = 1;
    int attack = 1;
    int armor = 5;

    public char getName() {
        return name;
    }
}
