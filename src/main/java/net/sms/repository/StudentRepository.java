package net.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
