package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.models.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
