package com.bixin.bixin_activity.repository;

import com.bixin.bixin_activity.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository  // spring bean
public interface UserRepository extends CrudRepository<User, Integer> {
}
