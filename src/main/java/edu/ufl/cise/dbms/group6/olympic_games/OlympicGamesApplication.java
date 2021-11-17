package edu.ufl.cise.dbms.group6.olympic_games;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@MapperScan(basePackages = "edu/ufl/cise/dbms/group6/olympic_games/dao")
@EnableOpenApi
public class OlympicGamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(OlympicGamesApplication.class, args);
    }

}
