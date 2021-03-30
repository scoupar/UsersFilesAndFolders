package com.example.codeclan.FileApp.components;

import com.example.codeclan.FileApp.models.File;
import com.example.codeclan.FileApp.models.Folder;
import com.example.codeclan.FileApp.models.User;
import com.example.codeclan.FileApp.repositories.FileRepository;
import com.example.codeclan.FileApp.repositories.FolderRepository;
import com.example.codeclan.FileApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User scott = new User("Scott");
        userRepository.save(scott);
        User lauren = new User("Lauren");
        userRepository.save(lauren);
        Folder folder1 = new Folder("Folder 1", scott);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Folder 2", lauren);
        folderRepository.save(folder2);
        File file1 = new File("File 1", ".doc", 40, folder1);
        fileRepository.save(file1);
        File file2 = new File("File 2", ".pdf", 56, folder2);
        fileRepository.save(file2);

    }
}

