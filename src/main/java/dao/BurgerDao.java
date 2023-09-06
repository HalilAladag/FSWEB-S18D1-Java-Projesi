package dao;

import entity.BreadType;
import entity.Burger;

import java.util.List;


public interface BurgerDao {
Burger save (Burger burger);
Burger findById(int id);
List<Burger> findAll();
List<Burger> findByPrice();
List<Burger> findByBreadType(BreadType breadType);

    List<Burger> findByPrice(double price);

    List<Burger> findBreadType(BreadType breadType);

    List<Burger> findByContent(String content);
Burger update(Burger burger);

    Burger delete(Burger burger);
}
