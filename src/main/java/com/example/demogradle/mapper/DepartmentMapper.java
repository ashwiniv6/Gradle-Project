package com.example.demogradle.mapper;

import com.example.demogradle.dto.UserDto;
import com.example.demogradle.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    UserDto toUserDto(Department department);

    Department toUser(UserDto userDto);

}
