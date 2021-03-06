package com.trl.theoreticalKnowledge._enum.enumSwitch.a.a1;

public class Example {
    public static void main(String[] args) {

        Color color = Color.YELLOW;

        switch (color) {
            case WHITE:
                System.out.println("WHITE");
                break;
            case BLACK:
                System.out.println("BLACK");
                break;
            // Carefully with case-sensitive. This sniped of code not compile. Due to "red", but should be "RED".
//            case red:
//                System.out.println("RED");
//                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
            default:
                System.out.println("Not color !!!");
        }
    }
}

enum Color {

    WHITE,
    BLACK,
    RED,
    YELLOW;
}
