package com.userAuthentic.UserAuthenticService.Repository;

import com.userAuthentic.UserAuthenticService.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

     User findByEmailAndPassword(String email , String password);
}
