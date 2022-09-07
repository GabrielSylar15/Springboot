package com.springboot.first.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.first.app.Entity.TblUser;
@Repository
public interface UserRepository extends JpaRepository<TblUser, Integer>{
	Optional<TblUser> findTblUserByUsername(String username);
}
