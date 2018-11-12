package com.harold.storm.heatmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HeatmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeatmapApplication.class, args);
    }
}
