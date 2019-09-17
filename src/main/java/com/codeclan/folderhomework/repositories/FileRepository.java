package com.codeclan.folderhomework.repositories;

import com.codeclan.folderhomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
