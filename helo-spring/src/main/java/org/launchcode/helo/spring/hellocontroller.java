package org.launchcode.helo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class hellocontroller {

//    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //Handles request at path /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring";
    }

    // lives at /hello/hello
    //handles request of the form /hello?name-LaunchCode
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
    public String hellowithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String hellowWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type= 'text' name='name'>" +
                "<input type ='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
