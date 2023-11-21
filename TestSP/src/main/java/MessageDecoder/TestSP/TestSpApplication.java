package MessageDecoder.TestSP;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import MessageDecoder.TestSP.classes.Message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.List;
@SpringBootApplication
public class TestSpApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TestSpApplication.class, args);
		List<Message> l = new ObjectMapper().readValue(new URL("file:src/messages.json"), new TypeReference<List<Message>>(){});
	}

}
