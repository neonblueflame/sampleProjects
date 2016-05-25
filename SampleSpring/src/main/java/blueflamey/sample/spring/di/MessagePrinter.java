package blueflamey.sample.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * From: https://projects.spring.io/spring-framework/
 */
@Component
public class MessagePrinter {
	private final MessageService service;
	
	@Autowired
	public MessagePrinter(MessageService service) {
		this.service = service;
	}
	
	public void printMessage() {
		System.out.println(this.service.getMessage());
	}
}
