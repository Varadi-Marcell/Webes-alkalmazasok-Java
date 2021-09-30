package iit.me.miskolc.first_project;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@GetMapping(path="/", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	ResponseDto gyoker() {
		ResponseDto responseDto = new ResponseDto();
		
		responseDto.setId(123);
		responseDto.setMessage("hello");
		return responseDto;
	}
	
}

