package com.example.studentDocker.dummmydata;


import com.example.studentDocker.Student;
import com.example.studentDocker.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentDataSeeder implements CommandLineRunner {

    private final StudentRepo studentRepository;

    public StudentDataSeeder(StudentRepo studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) {
        if (studentRepository.count() == 0) {
            System.out.println("Seeding initial student data...");

            studentRepository.save(new Student(0, "Alice", 20));
            studentRepository.save(new Student(0, "Bob", 22));
            studentRepository.save(new Student(0, "Charlie", 19));
            studentRepository.save(new Student(0, "Diana", 21));

            System.out.println("Student data seeded.");
        } else {
            System.out.println("Student data already exists. Skipping seeding.");
        }
    }
}

