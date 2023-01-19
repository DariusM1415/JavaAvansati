package Enemies;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnemiesService implements EnemiesInterface {

    private final EnemiesRepository repository;

    public EnemiesService(EnemiesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Enemy> all(){return repository.findAll();}

    @Override
    public Enemy one(Long id){
        return repository.findById(id)
                .orElseThrow(()->new EnemyNotFoundException(id));
    }

    @Override
    public Enemy newEnemy(Enemy enemy){
        return repository.save(enemy);
    }

    @Override
    public Enemy replaceEnemy(Enemy newEnemy, Long id){
        return repository.findById(id)
                .map(enemy -> {
                    enemy.setName(newEnemy.getName());
                    enemy.setHP(newEnemy.getHP());
                    enemy.setDifficulty(newEnemy.getDifficulty());
                    enemy.setRanged(newEnemy.getRanged());

                    return repository.save(enemy);
                })
                .orElseGet(()->{
                    newEnemy.setId(id);
                    return repository.save(newEnemy);
                });
    }

    @Override
    public void deleteEnemy(Long id){
        repository.deleteById(id);
    }

}

