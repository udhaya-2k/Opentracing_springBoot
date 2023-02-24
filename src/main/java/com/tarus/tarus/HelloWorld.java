package com.tarus.tarus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorld
{
@RequestMapping("/home")
public String hello()
{
return "Welcome to the HomePage";
}

@GetMapping(value = "/hello_request")
private String getHello() {
String uri = "http://192.168.56.103:9100/hello_request";
RestTemplate restTemplate = new RestTemplate();
String result = restTemplate.getForObject(uri, String.class);
return result;
}

}
