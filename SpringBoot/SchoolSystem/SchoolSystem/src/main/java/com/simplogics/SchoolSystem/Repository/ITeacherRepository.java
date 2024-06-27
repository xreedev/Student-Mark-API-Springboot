package com.simplogics.SchoolSystem.Repository;

import com.simplogics.SchoolSystem.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher,Integer> {
}
