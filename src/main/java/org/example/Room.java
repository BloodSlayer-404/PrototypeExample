package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room implements Prototype {
    private int width;
    private int height;
    private List<Enemy> enemies;

    public Room(int width, int height, List<Enemy> enemies) {
        this.width = width;
        this.height = height;
        this.enemies = enemies;
    }

    @Override
    public Room clone() {
        return new Room(this.width, this.height, this.enemies);
    }

    @Override
    public Room deepClone() {
        List<Enemy> enemyList = new ArrayList<>();

        for (Enemy enemy : enemies){
            Enemy enemyClone = enemy.clone();
            enemyList.add(enemyClone);
        }

        return new Room(this.width, this.height, enemyList);
    }

    @Override
    public String toString() {
        return "Room - " + Integer.toHexString(System.identityHashCode(this))  +  " {" +
                "\n\t width = " + width +
                "\n\t height = " + height +
                "\n\t enemies = " + enemies +
                '}';
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
