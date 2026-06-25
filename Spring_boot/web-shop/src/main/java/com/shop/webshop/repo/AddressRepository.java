package com.shop.webshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.webshop.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}