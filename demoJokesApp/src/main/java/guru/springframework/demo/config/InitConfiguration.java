package guru.springframework.demo.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class InitConfiguration {


   // @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotesService() {
        return new ChuckNorrisQuotes();
    }


}
