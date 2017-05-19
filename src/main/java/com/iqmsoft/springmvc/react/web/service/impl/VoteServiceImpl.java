package com.iqmsoft.springmvc.react.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.springmvc.react.web.entity.Vote;
import com.iqmsoft.springmvc.react.web.repository.VoteRepository;
import com.iqmsoft.springmvc.react.web.service.VoteService;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {
    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Vote addVote(Vote tag) {
        Vote savedTag = voteRepository.saveAndFlush(tag);

        return savedTag;
    }

    @Override
    public void delete(long id) {
        voteRepository.delete(id);
    }

    @Override
    public Vote getById(Long id) {
        return voteRepository.findById(id);
    }

    @Override
    public Vote editVote(Vote tag) {
        return voteRepository.saveAndFlush(tag);
    }

    @Override
    public List<Vote> getAll() {
        return voteRepository.findAll();
    }

}
