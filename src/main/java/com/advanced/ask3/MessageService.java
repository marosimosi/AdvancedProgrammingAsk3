package com.advanced.ask3;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {

	@Override
	public Message sendMessage(String text) {
		Message message = new Message(text);
		return message;
		}
	
	@Override
	public void publishMessage(Message m) {
		m.smcPublish();
	    return;
	}

}
