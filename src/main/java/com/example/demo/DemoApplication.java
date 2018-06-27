package com.example.demo;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@RestController
@SpringBootApplication
public class DemoApplication {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
        public Response example(@RequestBody Request request){

	    Response response = new Response();
	    response.newName = request.name;
        log.info(response.toString());
        ResponseOrder responseOrder = new ResponseOrder(request.requestOrder.id);
	    response.responseOrder =  responseOrder;
	    return response;

    }
}
