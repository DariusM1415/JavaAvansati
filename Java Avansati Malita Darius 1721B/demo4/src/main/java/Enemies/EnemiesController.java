package Enemies;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnemiesController {

    private final EnemiesService enemiesService;

    public EnemiesController(EnemiesService enemiesService) {
        this.enemiesService = enemiesService;
    }

    @GetMapping("/enemies")
    List<Enemy> findAll(){return enemiesService.all();}

    @GetMapping("/enemies/{id}")
    Enemy one(@PathVariable Long id){
        return enemiesService.one(id);
    }

    @PostMapping("/enemies")
    Enemy newEnemy(@RequestBody Enemy enemy){
        return enemiesService.newEnemy(enemy);
    }

    @PutMapping("/enemies/{id}")
    Enemy replaceEnemy(@RequestBody Enemy newEnemy, @PathVariable Long id){
        return enemiesService.replaceEnemy(newEnemy, id);
    }

    @DeleteMapping("/enemies/{id}")
    void deleteEnemy(@PathVariable Long id){
        enemiesService.deleteEnemy(id);
    }
}