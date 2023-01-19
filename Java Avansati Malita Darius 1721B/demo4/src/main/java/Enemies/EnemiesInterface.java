package Enemies;

import java.util.List;

public interface EnemiesInterface {
    List<Enemy> all();
    Enemy one(Long id);
    Enemy newEnemy(Enemy computer);
    Enemy replaceEnemy(Enemy newComputer, Long id);
    void deleteEnemy(Long id);
}
