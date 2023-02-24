package com.tarus.tarus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld
{
@RequestMapping("/hello_request")
public String hello()
{
return "Remote Server: Hello";
}
}
