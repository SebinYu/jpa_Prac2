package jpa.prac2.Prac2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.prac2.Prac2.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

    Student findByStudentNo(String studentNo);
    List<Student> findByName(String name);
    List<Student> findByNameStartsWith(String name);
    List<Student> findByDepartmentName(String name);
    List<Student> findByDepartmentNameStartsWith(String name);

    List<Student> findByOrderByName();
    List<Student> findByOrderByNameDesc();
    List<Student> findByDepartmentIdOrderByNameDesc(int id);

}
