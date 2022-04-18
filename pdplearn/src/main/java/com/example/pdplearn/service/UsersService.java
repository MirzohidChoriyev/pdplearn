package com.example.pdplearn.service;

import com.example.pdplearn.entity.entityTraining.Questions;
import com.example.pdplearn.entity.entityTraining.Users;
import com.example.pdplearn.object.UsersDto;
import com.example.pdplearn.repository.QuestionsRepository;
import com.example.pdplearn.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired(required = true)
    UsersRepository usersRepository;

    @Autowired(required = true)
    QuestionsRepository questionsRepository;

    public Users saveUsers(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.id);
        users.setName(usersDto.name);
        users.setQuestionsSet(usersDto.questionsSet
                .stream()
                .map(questions -> {
                    Questions questions1 = questions;
                    if(questions1.getId() > 0){
                        questions1 = questionsRepository.findById(questions1.getId())
                    }
                    questions1.
                }));
        return usersRepository.save(users);
    }
}
