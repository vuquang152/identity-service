package com.example.identityservice.mapper;

import com.example.identityservice.dto.request.UserCreationRequest;
import com.example.identityservice.dto.request.UserUpdationRequest;
import com.example.identityservice.dto.response.UserResponse;
import com.example.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser (UserCreationRequest request);

//    @Mapping(source="firstName", target="lastName")
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdationRequest request);
}
