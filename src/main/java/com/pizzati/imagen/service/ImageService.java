package com.pizzati.imagen.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    String uploadImage(MultipartFile file);

    byte[] downloadImage(String filename);
}
