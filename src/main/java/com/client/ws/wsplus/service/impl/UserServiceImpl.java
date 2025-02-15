package com.client.ws.wsplus.service.impl;

import com.client.ws.wsplus.dto.UserDto;
import com.client.ws.wsplus.exception.BadRequestException;
import com.client.ws.wsplus.exception.NotFoundException;
import com.client.ws.wsplus.mapper.UserMapper;
import com.client.ws.wsplus.model.User;
import com.client.ws.wsplus.model.UserType;
import com.client.ws.wsplus.repository.UserRepository;
import com.client.ws.wsplus.repository.UserTypeRepository;
import com.client.ws.wsplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserTypeRepository userTypeRepository;

    UserServiceImpl(UserRepository userRepository, UserTypeRepository userTypeRepository) {
        this.userRepository = userRepository;
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public User create(UserDto dto) {

        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("id deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());

        if (userTypeOpt.isEmpty()) {
            throw new NotFoundException("userTypeId não encontrado");
        }

        UserType userType = userTypeOpt.get();
        User user = UserMapper.fromDtoToEntity(dto, userType, null);

        return userRepository.save(user);
    }
}
