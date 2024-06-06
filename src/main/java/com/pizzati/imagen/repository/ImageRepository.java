package com.pizzati.imagen.repository;

import com.pizzati.imagen.entity.FileImageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<FileImageData,Integer> {
    FileImageData findByName(String name);
}
