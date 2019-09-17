package com.codeclan.folderhomework.repositories;

import com.codeclan.folderhomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
