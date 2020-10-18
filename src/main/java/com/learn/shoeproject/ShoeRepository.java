package com.learn.shoeproject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeRepository extends CrudRepository<Shoe, Integer>
{

}