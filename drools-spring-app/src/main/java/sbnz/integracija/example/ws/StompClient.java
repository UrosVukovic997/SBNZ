package sbnz.integracija.example.ws;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.converter.SimpleMessageConverter;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;

import com.google.gson.Gson;

import sbnz.integracija.example.dto.GSUpdateDTO;

public class StompClient {

	private static StompClient client;
	
	private WebSocketStompClient stompClient;
	
	private StompSession stompSession;
	
	public static StompClient getInstance() {
		if(StompClient.client == null) {
			StompClient.client = new StompClient();
		}
		return StompClient.client;
	}

	public StompClient() {
        WebSocketClient webSocketClient = new StandardWebSocketClient();
        this.stompClient = new WebSocketStompClient(webSocketClient);
        this.stompClient.setMessageConverter(new MappingJackson2MessageConverter());
		StompSessionHandler sessionHandler = new CustomStompSessionHandler();
		String loggerServerQueueUrl = "ws://localhost:8080/ws";
		try {
			this.stompSession = this.stompClient.connect(loggerServerQueueUrl , 
			sessionHandler).get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}



	public void sendMesage(GSUpdateDTO gsUpdateDTO) {
		Gson gson = new Gson();
		/*stompSession.send("/topic/info", new StringBuilder()
				.append(gson.toJson(gsUpdateDTO)).toString());
*/
		stompSession.send("/topic/info", gson.toJson(gsUpdateDTO));
	}
	
	
}
