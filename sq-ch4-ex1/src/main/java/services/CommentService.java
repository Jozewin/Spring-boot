package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
public class CommentService {


  private final CommentRepository commentRepository;

  public CommentService(CommentRepository commentRepository){
    this.commentRepository = commentRepository;
  }

  public CommentRepository getCommentRepository(){
    return commentRepository;
  }
}
