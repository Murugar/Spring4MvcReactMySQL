package com.iqmsoft.springmvc.react.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.iqmsoft.springmvc.react.web.entity.Question;
import com.iqmsoft.springmvc.react.web.entity.Tag;
import com.iqmsoft.springmvc.react.web.entity.User;
import com.iqmsoft.springmvc.react.web.repository.QuestionRepository;
import com.iqmsoft.springmvc.react.web.service.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question tag) {
        Question savedBank = questionRepository.saveAndFlush(tag);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        questionRepository.delete(id);
    }

    @Override
    public List<Question> getByUser(User user) {
        return questionRepository.findByUser(user.getId());
    }

    @Override
    public List<Question> getByTag(Tag tag) {
        return questionRepository.findByTag(tag.getId());
    }


    @Override
    public Question getById(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public Question editQuestion(Question user) {
        return questionRepository.saveAndFlush(user);
    }

//    @Override
//    public List<Question> getAll() {
//        return questionRepository.findAll();
//    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll(sortByIdAsc());
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.DESC, "id");
    }

}
