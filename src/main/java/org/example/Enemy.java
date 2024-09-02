package org.example;

public class Enemy implements Prototype {
    private String name;
    private double damage;
    private double lifePoints;

    public Enemy(String name, double damage, double lifePoints) {
        this.name = name;
        this.damage = damage;
        this.lifePoints = lifePoints;
    }

    @Override
    public Enemy clone() {
        return new Enemy(this.name, this.damage, this.lifePoints);
    }

    @Override
    public Enemy deepClone() {
        return clone();
    }

    @Override
    public String toString() {
        return "Enemy - " + Integer.toHexString(System.identityHashCode(this))  +  " {" +
                "\n\t\t name = '" + name + '\'' +
                "\n\t\t damage = " + damage +
                "\n\t\t lifePoints = " + lifePoints +
                '}';
    }

    public void die(){
        this.lifePoints = 0;
    }
}
