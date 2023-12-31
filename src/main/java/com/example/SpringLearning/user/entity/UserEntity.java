package com.example.SpringLearning.user.entity;

import com.example.SpringLearning.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userEmail;
    private String userName;
    private String userPassword;

    static public UserDto toDto(UserEntity userEntity) {
        return UserDto
                .builder()
                .userId(userEntity.getUserId())
                .userEmail(userEntity.getUserEmail())
                .userName(userEntity.getUserName())
                .userPassword(userEntity.getUserPassword())
                .build();
    }
}
