package com.resume.repo;

import com.resume.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ResumeRepo extends JpaRepository<Resume, UUID> {
}
