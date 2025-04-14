package com.rasmoo.client.data.service.impl;

import com.rasmoo.client.data.model.UserType;
import com.rasmoo.client.data.repository.UserTypeRepository;
import com.rasmoo.client.data.service.UserTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    private final UserTypeRepository userTypeRepository;

    UserTypeServiceImpl(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }
}
