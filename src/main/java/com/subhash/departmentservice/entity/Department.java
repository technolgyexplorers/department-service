package com.subhash.departmentservice.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Schema(
        description = "Department Model for storing details"
)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Schema(
            description = "Department Name"
    )
    private String departmentName;
    private String departmentAddress;
    @Schema(
            description = "Department Code"
    )
    private String departmentCode;
}
