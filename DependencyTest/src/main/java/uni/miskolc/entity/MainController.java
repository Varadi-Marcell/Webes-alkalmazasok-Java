package uni.miskolc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	private Service service;
	
	@Autowired
	public void setService(Service service) {
		this.service = service;
	}
	
}
//txt be
//spring doksi
//new
