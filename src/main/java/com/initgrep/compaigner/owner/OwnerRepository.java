package com.initgrep.compaigner.owner;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
	
	public Optional<Owner> findByEmail(String email);

}
