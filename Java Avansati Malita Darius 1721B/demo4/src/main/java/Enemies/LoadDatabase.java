package Enemies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

//    @Bean
//    CommandLineRunner initDatabase(EnemiesRepository repository) {
//
//        return args -> {
//            log.info("Preloading " + repository.save(new Enemy("Basic Soldier", 100 , 'D', false)));
//            log.info("Preloading " + repository.save(new Enemy("Basic Ranged Soldier", 80 , 'D', true)));
//        };
//    }

}
