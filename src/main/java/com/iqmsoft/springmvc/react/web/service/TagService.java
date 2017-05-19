package com.iqmsoft.springmvc.react.web.service;

import java.util.List;

import com.iqmsoft.springmvc.react.web.entity.Tag;

public interface TagService {
    Tag addTag(Tag tag);
    void delete(long id);
    Tag getByName(String name);
    Tag getById(Long id);
    Tag editTag(Tag tag);

    List<Tag> getAll();
    // List<Tag> findAllByOrderByPopularDesc();
    List<Tag> getByCharacters(String searchTerm);
}