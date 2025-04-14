package com.rasmoo.client.data.repository;

import com.rasmoo.client.data.model.SubscriptionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType,Long> {

    Optional<SubscriptionType> findByProductKey(String productKey);

}
