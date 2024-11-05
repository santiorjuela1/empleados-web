package com.empleados_web.empleados_web.services;

import com.empleados_web.empleados_web.interfaces.PostsInterface;
import com.empleados_web.empleados_web.model.Posts;
import com.empleados_web.empleados_web.repositories.PostsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostsService implements PostsInterface {

    private final PostsRepository postsRepository;

    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @Override
    public List<Posts> getPosts() {
        return postsRepository.findAll();
    }

    @Override
    public Posts getPost(Long id) {
        return postsRepository.findById(id).get();
    }

    @Override
    public Posts createPost(Posts posts) {
        return postsRepository.save(posts);
    }

    @Override
    public Posts updatePost(Posts posts) {
        return postsRepository.save(posts);
    }

    @Override
    public Boolean deletePost(Long id) {
        postsRepository.deleteById(id);
        return true;
    }
}
