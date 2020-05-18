/*package sbnz.integracija.example.ws;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import com.google.gson.Gson;

import sbnz.integracija.example.dto.GSUpdateDTO;

public class WSEndPoint {

	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public String send(GSUpdateDTO dto) throws Exception {
		Gson gson = new Gson();
	    return gson.toJson(dto);
	}
}
*/