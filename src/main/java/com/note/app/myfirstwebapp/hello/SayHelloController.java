package com.note.app.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append(
                "<html>\r\n" + //
                        "    <head>\r\n" + //
                        "        <title>My First HTML Page</title>\r\n" + //
                        "    </head>\r\n" + //
                        "    <body>\r\n" + //
                        "        My first html page with body\r\n" + //
                        "    </body>\r\n" + //
                        "</html>");
        return sb.toString();
    }

}