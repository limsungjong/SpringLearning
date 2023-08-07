package com.example.SpringLearning.user.service;

import com.example.SpringLearning.user.domain.dto.UserJoinRequestBody;
import com.example.SpringLearning.user.entity.UserEntity;
import com.example.SpringLearning.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserJoinService {
    private final UserRepository userRepository;

    public String userJoin(UserJoinRequestBody requestBody) {

        // 유저 이메일 중복 체크
        userRepository.findByUserEmail(requestBody.getUserEmail()).ifPresent(v -> {
            String message = v.getUserEmail() +
                    " 해당하는 이메일은 이미 존재합니다.";
            throw new RuntimeException(message);
        });

        // 저장
        UserEntity user = UserEntity
                .builder()
                .userEmail(requestBody.getUserEmail())
                .userName(requestBody.getUserName())
                .userPassword(requestBody.getUserPassword())
                .build();
        userRepository.save(user);

        return "success";
    }
}
