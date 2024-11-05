package com.empleados_web.empleados_web.interfaces;

import com.empleados_web.empleados_web.model.Posts;

import java.util.List;

public interface PostsInterface {
    public List<Posts> getPosts();
    public Posts getPost(Long id);
    public Posts createPost(Posts posts);
    public Posts updatePost(Posts posts);
    public Boolean deletePost(Long id);
}
