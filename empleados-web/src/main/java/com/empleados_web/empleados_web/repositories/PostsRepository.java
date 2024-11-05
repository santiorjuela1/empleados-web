package com.empleados_web.empleados_web.repositories;

import com.empleados_web.empleados_web.model.Posts;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
