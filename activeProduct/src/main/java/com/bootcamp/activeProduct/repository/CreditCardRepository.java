package com.bootcamp.activeProduct.repository;

import com.bootcamp.activeProduct.domain.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {

}
