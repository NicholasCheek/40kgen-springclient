package com.fordytoo._kgen.Repositories;

import com.fordytoo._kgen.Entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
