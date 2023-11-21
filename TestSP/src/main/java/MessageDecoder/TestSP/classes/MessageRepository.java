package MessageDecoder.TestSP.classes;

import java.util.List;

public interface MessageRepository {
    List<Message> getAllMessages();
    void saveMessage(Message message);

}

