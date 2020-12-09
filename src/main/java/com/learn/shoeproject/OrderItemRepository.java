package com.learn.shoeproject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Integer>
{
    @Query("select d from OrderItem d where d.date <= :toDate and d.date >= :fromDate")
    List<OrderItem> findAllWithDatetimeBefore(
            @Param("fromDate") Date fromDate, @Param("toDate") Date toDate);

    @Query("select new com.learn.shoeproject.CategorySales(d.shoe.category.shoeCategory,sum(d.totalPrice)) from OrderItem d where d.date <= :toDate and d.date >= :fromDate group by " +
            "d.shoe.category.shoeCategory")
    List<CategorySales> getCategorySales( @Param("fromDate") Date fromDate, @Param("toDate") Date toDate);


}