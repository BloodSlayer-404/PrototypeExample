package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Enemy> monstruos = List.of(
                new Enemy("Wraith", 2, 10),
                new Enemy("Fly", 1, 2),
                new Enemy("Mulligan", 5, 2)
        );

        Room sala1 = new Room(5, 5, monstruos);
        Room sala2 = sala1.deepClone();

        System.out.println(sala1);
        System.out.println("\n");
        System.out.println(sala2);

        sala2.getEnemies().get(2).die();

        System.out.println("\n\n");
        System.out.println(sala1);
        System.out.println("\n");
        System.out.println(sala2);
    }
}