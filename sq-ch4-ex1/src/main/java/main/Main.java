package main;
// Using interfaces to define contracts
import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);



        var comment = new Comment();

        comment.setText("Hi this the text");
        comment.setAuthor("Josewin");

        var commonService = context.getBean(CommentService.class);
        commonService.publicComment(comment);
    }
}
