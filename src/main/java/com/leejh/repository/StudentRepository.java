package com.leejh.repository;

import com.leejh.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepository extends JpaRepository<Student,Integer> {
  Student findByName(String name);

  @Transactional
  @Modifying
  @Query(value = "update Student set age=?1 where id=?2",nativeQuery = true)
  void update(int age,int id);

  @Transactional
  @Modifying
  @Query(value = "delete from Student where id=?1",nativeQuery = true)
  void delete(int id);


}
