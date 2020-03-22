package com.howtodoinjava.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.howtodoinjava.demo.model.Address;

/**
 * Created by a10282 on 11/04/2018.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

	Optional<Address> findByAddressId(long addressId);

	void deleteByAddressId(long addressId);


}
