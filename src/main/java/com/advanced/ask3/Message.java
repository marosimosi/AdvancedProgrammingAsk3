package com.advanced.ask3;

public class Message {
	
	private String text;
	
	public Message(String text) {
		super();
		this.text = text;
	}

	
	public void smcPublish() {
		SimpleMqttClient smc = new SimpleMqttClient();
		smc.runClient(this.text);
	}
}
