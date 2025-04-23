package main;
// Using interfaces to define contracts
import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();

        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(
                commentRepository, commentNotificationProxy
        );

        var comment = new Comment();

        comment.setText("Hi this the text");
        comment.setAuthor("Josewin");

        commentService.publicComment(comment);
    }
}
