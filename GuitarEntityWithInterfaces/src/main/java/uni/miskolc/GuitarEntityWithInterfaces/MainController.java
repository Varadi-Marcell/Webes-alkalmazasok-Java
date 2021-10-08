package uni.miskolc.GuitarEntityWithInterfaces;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="Guitar")
public class MainController {

	private final GuitarService GuitarService;

	public MainController(GuitarService GuitarService) {
		this.GuitarService = GuitarService;
	}

	@GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<GuitarDto> allGuitars() {
		return GuitarService.findAll();
	}

	@PostMapping(path="")
	public void newGuitar(@RequestBody @Valid GuitarDto GuitarDto) {
		GuitarService.save(GuitarDto);
	}

	@PutMapping(path="/")
	public void replaceGuitar(@RequestBody @Valid GuitarDto GuitarDto) {
		GuitarService.save(GuitarDto);
	}

	@DeleteMapping (path="/{id}")
	public void deleteGuitar(@PathVariable("id") Long id) {
		GuitarService.deleteById(id);
	}

}
