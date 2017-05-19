package com.iqmsoft.springmvc.react.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.iqmsoft.springmvc.react.web.entity.Question;
import com.iqmsoft.springmvc.react.web.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    @Query("select t from Vote t where t.id = :id")
    Vote findById(@Param("id") Long id);
}
