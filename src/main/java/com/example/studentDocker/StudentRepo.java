package com.example.studentDocker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer> {
    // This interface will automatically provide CRUD operations for the Student entity
    // No additional methods are needed unless custom queries are required
}
