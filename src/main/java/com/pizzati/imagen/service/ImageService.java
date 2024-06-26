package com.pizzati.imagen.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    String uploadImage(int id, MultipartFile file);

    byte[] downloadImage(String filename);
}
