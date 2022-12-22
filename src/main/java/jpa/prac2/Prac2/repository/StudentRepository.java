package jpa.prac2.Prac2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.prac2.Prac2.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
