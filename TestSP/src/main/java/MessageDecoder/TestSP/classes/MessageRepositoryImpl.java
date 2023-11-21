package MessageDecoder.TestSP.classes;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepositoryImpl implements MessageRepository {
    private final List<Message> messageList = new ArrayList<>();

    @Override
    public List<Message> getAllMessages() {
        return messageList;
    }

    @Override
    public void saveMessage(Message message) {
        messageList.add(message);
    }
}
