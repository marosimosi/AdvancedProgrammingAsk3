package com.advanced.ask3;

import java.util.List;

public interface IMessageService {
	Message sendMessage(String text);
	void publishMessage(Message m);
}