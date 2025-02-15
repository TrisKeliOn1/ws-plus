package com.client.ws.wsplus.service;

import com.client.ws.wsplus.dto.UserDto;
import com.client.ws.wsplus.model.User;

public interface UserService {

    User create(UserDto dto);
}
