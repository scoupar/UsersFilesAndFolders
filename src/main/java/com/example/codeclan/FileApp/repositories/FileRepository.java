package com.example.codeclan.FileApp.repositories;

import com.example.codeclan.FileApp.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
