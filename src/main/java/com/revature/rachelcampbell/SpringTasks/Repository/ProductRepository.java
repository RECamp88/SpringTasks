package com.revature.rachelcampbell.SpringTasks.Repository;

import com.revature.rachelcampbell.SpringTasks.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
