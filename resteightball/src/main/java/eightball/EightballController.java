package eightball;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EightballController {

private final AtomicLong counter = new AtomicLong();
	    
	    @RequestMapping("/eightball")
	    public Answer question(@RequestParam(value="question", defaultValue="What") String query) {
	        return new Answer(counter.incrementAndGet(), query);
	       
	    }

}
