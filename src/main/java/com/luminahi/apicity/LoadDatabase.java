package com.luminahi.apicity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luminahi.apicity.model.City;
import com.luminahi.apicity.model.enums.State;
import com.luminahi.apicity.repository.CityRepository;

@Configuration
public class LoadDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(CityRepository repository) {
        return args -> {
            log.info("saving: " + repository.save(new City("Rio Branco", State.ACRE)));
            log.info("saving: " + repository.save(new City("Maceió", State.ALAGOAS)));
            log.info("saving: " + repository.save(new City("Macapá", State.AMAPA)));
            log.info("saving: " + repository.save(new City("Manaus", State.AMAZONAS)));
            log.info("saving: " + repository.save(new City("Salvador", State.BAHIA)));
            log.info("saving: " + repository.save(new City("Fortaleza", State.CEARA)));
            log.info("saving: " + repository.save(new City("Brasília", State.DISTRITO_FEDERAL)));
            log.info("saving: " + repository.save(new City("Vitória", State.ESPIRITO_SANTO)));
            log.info("saving: " + repository.save(new City("Goiânia", State.GOIAS)));
            log.info("saving: " + repository.save(new City("São Luís", State.MARANHAO)));
            log.info("saving: " + repository.save(new City("Cuiabá", State.MATO_GROSSO)));
            log.info("saving: " + repository.save(new City("Campo Grande", State.MATO_GROSSO_DO_SUL)));
        };
    }
}
