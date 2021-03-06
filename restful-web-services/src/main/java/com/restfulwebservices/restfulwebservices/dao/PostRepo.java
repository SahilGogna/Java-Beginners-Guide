package com.restfulwebservices.restfulwebservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulwebservices.restfulwebservices.model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{

}
