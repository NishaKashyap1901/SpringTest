package com.innogent.CollegeCourse.Repository;

import com.innogent.CollegeCourse.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository <User,Long> {

}
