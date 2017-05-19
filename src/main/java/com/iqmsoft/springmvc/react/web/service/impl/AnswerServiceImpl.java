package com.iqmsoft.springmvc.react.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.iqmsoft.springmvc.react.web.entity.Answer;
import com.iqmsoft.springmvc.react.web.entity.User;
import com.iqmsoft.springmvc.react.web.repository.AnswerRepository;
import com.iqmsoft.springmvc.react.web.service.AnswerService;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public Answer addAnswer(Answer answer) {
        Answer savedBank = answerRepository.saveAndFlush(answer);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        answerRepository.delete(id);
    }

    @Override
    public List<Answer> getByUser(User user) {
        return answerRepository.findByUser(user.getId());
    }

    @Override
    public Answer getById(Long id) {
        return answerRepository.findById(id);
    }

    @Override
    public Answer editAnswer(Answer answer) {
        return answerRepository.saveAndFlush(answer);
    }

    @Override
    public List<Answer> getAll() {
        return answerRepository.findAll(sortByIdAsc());
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.DESC, "id");
    }

}
