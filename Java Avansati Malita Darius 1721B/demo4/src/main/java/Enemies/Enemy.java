package Enemies;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;


@Entity
class Enemy {

    private @Id
    @GeneratedValue Long id;
    private String Name;
    private Integer HP;
    private char Difficulty;
    private boolean Ranged;

    Enemy() {}

    Enemy(String Name, Integer HP, char Difficulty, boolean Ranged) {

        this.Name = Name;
        this.HP = HP;
        this.Difficulty= Difficulty;
        this.Ranged= Ranged;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public Integer getHP() {
        return this.HP;
    }

    public char getDifficulty() {
        return this.Difficulty;
    }

    public boolean getRanged() {
        return this.Ranged;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setDifficulty(char Difficulty) {
        this.Difficulty = Difficulty;
    }

    public void setRanged(boolean Ranged) {
        this.Ranged = Ranged;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Enemy))
            return false;
        Enemy enemy = (Enemy) o;
        return Objects.equals(this.id, enemy.id)
                && Objects.equals(this.Name, enemy.Name)
                && Objects.equals(this.HP, enemy.HP)
                && Objects.equals(this.Difficulty, enemy.Difficulty)
                && Objects.equals(this.Ranged, enemy.Ranged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.Name, this.HP, this.Difficulty, this.Ranged);
    }

    @Override
    public String toString() {
        return "Enemy{" + "id=" + this.id + ", Name='" + this.Name + '\'' + ", HP='" + this.HP +
                "Difficulty=" + this.Difficulty + "Difficulty=" + this.Difficulty + '\'' + '}';
    }
}