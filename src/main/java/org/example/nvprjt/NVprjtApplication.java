package org.example.nvprjt;

import org.example.nvprjt.DTO.ComputerDTO;
import org.example.nvprjt.SERVICE.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class NVprjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(NVprjtApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return args -> {
            List<ComputerDTO> computers = List.of(
                    ComputerDTO.builder().proce("i7").  Ram("16").hardDrive("FEFEFEZ").price(12345).build(),
                    ComputerDTO.builder().proce("i3").Ram("32").hardDrive("dnjFDECfenf").price(44345).build(),
                    ComputerDTO.builder().proce("i9").Ram("16").hardDrive("dnASZDjfenf").price(144345).build(),
                    ComputerDTO.builder().proce("i5").Ram("12").hardDrive("dAAAAAnjfenf").price(3444345).build()
            );

            computers.forEach(computerService::savecomputer);
        };
    }
}

