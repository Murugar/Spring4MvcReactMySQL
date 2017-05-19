package com.iqmsoft.springmvc.react.web.service;

import java.util.List;

import com.iqmsoft.springmvc.react.web.entity.Question;
import com.iqmsoft.springmvc.react.web.entity.Tag;
import com.iqmsoft.springmvc.react.web.entity.User;

public interface QuestionService {
    Question addQuestion(Question question);
    void delete(long id);
    List<Question> getByUser(User user);
    List<Question> getByTag(Tag tag);
    Question getById(Long id);
    Question editQuestion(Question question);
    List<Question> getAll();
}