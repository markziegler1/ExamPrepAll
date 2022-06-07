package Enum;

public class Enum {

    public static void main(String[] args) {

        Level myVar1 = Level.LOW;
        Level myVar2 = Level.MEDIUM;
        Level myVar3 = Level.HIGH;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        //Loop Through an Enum
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
