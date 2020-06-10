package sbnz.integracija.example.ws;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;

import sbnz.integracija.example.dto.GSUpdateDTO;

@Controller
public class WSEndPoint {

	@MessageMapping("/ws")
	@SendTo("/topic/info")
	public String send(GSUpdateDTO dto) throws Exception {
		Gson gson = new Gson();
	    return gson.toJson(dto);
	}
}
