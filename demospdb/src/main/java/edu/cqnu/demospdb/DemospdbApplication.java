package edu.cqnu.demospdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("edu.cqnu.demospdb.mapper")
public class DemospdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemospdbApplication.class, args);
    }

}
