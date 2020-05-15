package jp.te4a.spring.boot.myapp2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController{
	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot!!!!!!!!!!!!!!!!!!!!!!!!!";
	}

	@RequestMapping("/taro")
	public String te() {
		return "Taro desu!";
	}
}