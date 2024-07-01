package com.simplogics.markSystem.Repository;

import com.simplogics.markSystem.Model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdClassRepository extends JpaRepository<String, Marks> {
}
