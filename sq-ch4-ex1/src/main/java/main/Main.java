// 5.1.1 How singleton beans work

package main;

import configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.Comment;
import services.CommentService;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Natasha");
        comment.setText("Look yourself");

        service.publishComment(comment);
    }

}

