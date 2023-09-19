package com.innogent.CollegeCourse.Repository;

import com.innogent.CollegeCourse.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<User, Long> {

}
