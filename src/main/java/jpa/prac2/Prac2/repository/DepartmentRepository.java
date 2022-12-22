package jpa.prac2.Prac2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.prac2.Prac2.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>  {

}
