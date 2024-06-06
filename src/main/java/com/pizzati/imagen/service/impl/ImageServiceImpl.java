package com.pizzati.imagen.service.impl;

import com.pizzati.imagen.entity.FileImageData;
import com.pizzati.imagen.repository.ImageRepository;
import com.pizzati.imagen.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.util.Objects.isNull;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Value("${image.folder}")
    private String imageFolder;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public String uploadImage(MultipartFile file) {

        String filePath = imageFolder+file.getOriginalFilename();

        FileImageData build = FileImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .filePath(filePath)
                .build();

        /*save to system*/
        try{
            file.transferTo(new File(filePath));
        }catch (IOException e){

        }

        FileImageData save = imageRepository.save(build);
        if(!isNull(save)){
            return "uploaded "+filePath;
        }
        return null;
    }

    @Override
    public byte[] downloadImage(String filename) {

        FileImageData byName = imageRepository.findByName(filename);
        if(isNull(byName)){
            return new byte[0];
        }

        try {
            return Files.readAllBytes(new File(byName.getFilePath()).toPath());
        }catch (Exception e){
            
        }

        return new byte[0];
    }
}
