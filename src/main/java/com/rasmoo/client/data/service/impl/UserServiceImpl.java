package com.rasmoo.client.data.service.impl;

import com.rasmoo.client.data.dto.UserDto;
import com.rasmoo.client.data.exception.BadRequestException;
import com.rasmoo.client.data.exception.NotFoudException;
import com.rasmoo.client.data.model.User;
import com.rasmoo.client.data.model.UserType;
import com.rasmoo.client.data.repository.UserRepository;
import com.rasmoo.client.data.repository.UserTypeRepository;
import com.rasmoo.client.data.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

import static com.rasmoo.client.data.mapper.UserMapper.fromDtoToEntity;

@Service
public class UserServiceImpl implements UserService {

    private static final String PNG = ".png";
    private static final String JPEG = ".jpeg";

    private final UserRepository userRepository;

    private final UserTypeRepository userTypeRepository;


    UserServiceImpl(UserRepository userRepository, UserTypeRepository userTypeRepository) {
        this.userRepository = userRepository;
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public User create(UserDto dto) {

        if (Objects.nonNull(dto.id())) {
            throw new BadRequestException("id deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(dto.userTypeId());

        if (userTypeOpt.isEmpty()) {
            throw new NotFoudException("userTypeId não encontrado");
        }

        UserType userType = userTypeOpt.get();
        User user = fromDtoToEntity(dto, userType, null);
        return userRepository.save(user);
    }

    @Override
    public User uploadPhoto(Long id, MultipartFile file) throws IOException {
        String imgName = file.getOriginalFilename();
        String formatPNG =  imgName.substring(imgName.length() - 4);
        String formatJPEG =  imgName.substring(imgName.length() - 5);
        if (!(PNG.equalsIgnoreCase(formatPNG) || JPEG.equalsIgnoreCase(formatJPEG))) {
            throw new BadRequestException("Imagem deve possuir formato JPEG ou PNG.");
        }
        User user = findById(id);
        user.setPhotoName(file.getOriginalFilename());
        user.setPhoto(file.getBytes());
        return userRepository.save(user);
    }

    @Override
    public byte[] downloadPhoto(Long id) {
        User user = findById(id);
        if (Objects.isNull(user.getPhoto())) {
            throw new BadRequestException("Usuário não possui foto");
        }
        return user.getPhoto();
    }

    private User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoudException("Usuário não encontrado"));
    }
}
