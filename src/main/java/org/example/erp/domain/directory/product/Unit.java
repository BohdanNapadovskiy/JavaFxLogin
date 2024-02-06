package org.example.erp.domain.directory.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "Unit")
@Table(name = "unit")
public class Unit {

    @Id
    @GeneratedValue
    private Long id;
    private String shortName;
    private String name;
    private int coefficient;


}
