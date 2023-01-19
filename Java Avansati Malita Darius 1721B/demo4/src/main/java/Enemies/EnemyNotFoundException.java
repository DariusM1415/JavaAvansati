package Enemies;

class EnemyNotFoundException extends RuntimeException {

    EnemyNotFoundException(Long id) {
        super("Enemy with ID:" + id + " not found");
    }
}