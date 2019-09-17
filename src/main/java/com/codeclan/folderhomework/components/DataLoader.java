package com.codeclan.folderhomework.components;

import com.codeclan.folderhomework.models.File;
import com.codeclan.folderhomework.models.Folder;
import com.codeclan.folderhomework.models.User;
import com.codeclan.folderhomework.repositories.FileRepository;
import com.codeclan.folderhomework.repositories.FolderRepository;
import com.codeclan.folderhomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User fred = new User("Fred");
        userRepository.save(fred);

        Folder folder1 = new Folder("homework", fred);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Javascript", fred);
        folderRepository.save(folder2);

        File file1 = new File("day2", "xls", "5Mb");
        fileRepository.save(file1);

        File file2 = new File("day3", "ppt", "10Mb");
        fileRepository.save(file2);

        folder1.addFile(file1);
        folderRepository.save(folder1);

        folder2.addFile(file2);
        folderRepository.save(folder2);

    }
}
