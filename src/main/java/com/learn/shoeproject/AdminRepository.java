package com.learn.shoeproject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer>
{

    @Query("SELECT u FROM Admin u WHERE u.username = :username")
    public Admin getUserByUsername(@Param("username") String username);

}