package com.rs.springframework.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by rs on 1/28/2018.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}