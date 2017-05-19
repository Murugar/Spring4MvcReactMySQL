package com.iqmsoft.springmvc.react.web.service;

import java.util.List;

import com.iqmsoft.springmvc.react.web.entity.Answer;
import com.iqmsoft.springmvc.react.web.entity.User;

public interface AnswerService {
    Answer addAnswer(Answer answer);
    void delete(long id);
    List<Answer> getByUser(User user);
    Answer getById(Long id);
    Answer editAnswer(Answer answer);
    List<Answer> getAll();
}
