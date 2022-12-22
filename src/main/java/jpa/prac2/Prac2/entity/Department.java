package jpa.prac2.Prac2.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String shortName;
    String phone;
}
