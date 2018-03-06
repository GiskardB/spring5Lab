package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class PropertyConfig {


    @Autowired
    Environment env;

    @Value("${guru.user}")
    private String user;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dburl}")
    private String url;

    @Value("${guru.jms.user}")
    private String jmsUser;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.dburl}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setUrl(this.url);
        //fakeDataSource.setUser(this.env.getProperty("JAVA_HOME"));
        fakeDataSource.setUser(this.user);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource(){
        FakeJmsSource fakeDataSource = new FakeJmsSource();
        fakeDataSource.setPassword(this.jmsPassword);
        fakeDataSource.setUrl(this.jmsUrl);
        fakeDataSource.setUser(this.jmsUser);
        return fakeDataSource;
    }


   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/

}
