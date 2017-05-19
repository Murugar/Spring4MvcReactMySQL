package com.iqmsoft.springmvc.react.web.service;

import java.util.List;

import com.iqmsoft.springmvc.react.web.entity.Vote;

public interface VoteService {
    Vote addVote(Vote vote);
    void delete(long id);
    Vote getById(Long id);
    Vote editVote(Vote vote);
    List<Vote> getAll();
}