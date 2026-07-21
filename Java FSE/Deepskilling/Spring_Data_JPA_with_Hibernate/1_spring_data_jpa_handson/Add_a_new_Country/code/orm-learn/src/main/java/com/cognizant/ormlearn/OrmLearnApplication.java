package com.cognizant.ormlearn;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

//    public static void main(String[] args) {
//
//        ApplicationContext context =
//                SpringApplication.run(OrmLearnApplication.class, args);
//
//        countryService = context.getBean(CountryService.class);
//
//        testGetCountry();
//        testAddCountry();
//        testUpdateCountry();
//        testDeleteCountry();
//        testSearchCountry();
//        testFindCountryByCode();
//    }
public static void main(String[] args) {

    ApplicationContext context =
            SpringApplication.run(OrmLearnApplication.class, args);

    countryService = context.getBean(CountryService.class);

    testAddCountry();
}
    private static void testGetCountry() {
        LOGGER.info("Find Country by Code");

        Country country = countryService.getCountry("IN");
        System.out.println(country);
    }

    private static void testAddCountry() {

        LOGGER.info("Start");

        Country country = new Country("ZZ", "Test Country");

        countryService.addCountry(country);

        try {
            Country result = countryService.findCountryByCode("ZZ");
            LOGGER.debug("Country: {}", result);
        } catch (CountryNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("End");
    }

    private static void testUpdateCountry() {
        LOGGER.info("Update Country");

        Country country = new Country("ZZ", "Updated Test Country");
        countryService.updateCountry(country);

        System.out.println(countryService.getCountry("ZZ"));
    }

    private static void testDeleteCountry() {
        LOGGER.info("Delete Country");

        countryService.deleteCountry("ZZ");

        System.out.println(countryService.getCountry("ZZ"));
    }

    private static void testSearchCountry() {
        LOGGER.info("Search Country");

        List<Country> countries =
                countryService.searchCountries("un");

        countries.forEach(System.out::println);
    }

    private static void testFindCountryByCode() {

        LOGGER.info("Find Country By Code");

        try {

            Country country =
                    countryService.findCountryByCode("IN");

            System.out.println(country);

        } catch (CountryNotFoundException e) {

            System.out.println(e.getMessage());

        }
    }
}