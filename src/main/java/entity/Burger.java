package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Burger {

    private int id;
    private String name;
    private double price;
    private boolean isVegan;
    private String contets;
}
