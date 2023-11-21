package MessageDecoder.TestSP.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

public class MessageFactory {

    public static Message createMessage(String house, String encodedMessage) {
        String decodedMessage = decodeMessage(encodedMessage);
        return new Message(new Date(), decodedMessage, house);
    }

    private static String decodeMessage(String encodedMessage) {
        // Verificăm dacă mesajul este codificat în Base64
        if (isBase64Encoded(encodedMessage)) {
            byte[] decodedBytes = Base64.getDecoder().decode(encodedMessage);
            return new String(decodedBytes, StandardCharsets.UTF_8);
        } else {
            // Dacă nu este codificat în Base64, puteți adăuga alte logici de decodare aici
            // În acest exemplu, considerăm că mesajul este deja decodat
            return encodedMessage;
        }
    }

    private static boolean isBase64Encoded(String value) {
        try {
            Base64.getDecoder().decode(value);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
