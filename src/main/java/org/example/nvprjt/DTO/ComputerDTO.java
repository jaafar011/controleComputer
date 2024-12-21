package org.example.nvprjt.DTO;

import jakarta.persistence.Entity;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDTO {
    String proce;
    String Ram;
    String hardDrive;
    double price;
}
