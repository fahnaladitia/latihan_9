package net.latihan.tutorial.repositories;

import net.latihan.tutorial.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
