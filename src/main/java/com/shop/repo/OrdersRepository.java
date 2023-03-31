package com.shop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.models.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	List<Orders> findByUsername(String username);
}
