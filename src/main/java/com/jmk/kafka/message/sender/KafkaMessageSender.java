package com.jmk.kafka.message.sender;

import com.jmk.kafka.message.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageSender {

	@Autowired
	private KafkaTemplate<String, Message> kafkaTemplate;
	
	public void sendMessage(String topic,Message message) {
		/*org.springframework.messaging.Message<Message> message1 = MessageBuilder
	            .withPayload(message)
	            .setHeader(KafkaHeaders.TOPIC, "topic-sms")
	            .build();
*/		
		kafkaTemplate.send("topic-sms",message);
	}
	
}
