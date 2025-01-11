import com.github.kevinnowak.model.Comment;
import com.github.kevinnowak.proxy.CommentNotificationProxy;
import com.github.kevinnowak.repository.CommentRepository;
import com.github.kevinnowak.service.CommentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AppTest {

    @Test
    @DisplayName("""
            Verify that CommentService correctly delegates the responsibilities to the repository and proxy objects
            """)
    public void testCommentService() {
        var comment = mock(Comment.class);
        var commentRepository = mock(CommentRepository.class);
        var commentNotificationProxy = mock(CommentNotificationProxy.class);

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        commentService.publishComment(comment);

        verify(commentRepository).storeComment(comment);
        verify(commentNotificationProxy).sendComment(comment);
    }
}
