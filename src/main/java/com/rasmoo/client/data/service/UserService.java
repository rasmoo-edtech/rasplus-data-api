package com.rasmoo.client.data.service;

import com.rasmoo.client.data.dto.UserDto;
import com.rasmoo.client.data.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserService {
    User create(UserDto dto);

    User uploadPhoto(Long id, MultipartFile file) throws IOException;

    byte[] downloadPhoto(Long id);

    User findById(Long id);
}
