package uni.miskolc.book_entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "guitar")
public class MainController {
	private final List<GuitarDto> guitars = new ArrayList<>();

	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	List<GuitarDto> allguitars() {
		return guitars;
	}

	@PostMapping(path = "/")
	public void newguitar(@RequestBody @Valid GuitarDto GuitarDto) {
		guitars.add(GuitarDto);
	}

	private int findguitarByID(String id) {
		int found = -1;
		for (int i = 0; i < guitars.size(); i++) {
			if (guitars.get(i).gettype().equals(id)) {
				found = i;
				break;
			}
		}
		return found;
	}

	@PutMapping(path = "/{id}")
	public void replaceguitar(@PathVariable("id") String id, @RequestBody @Valid GuitarDto GuitarDto) {

		int found = findguitarByID(id);

		if (found != -1) {
			GuitarDto foundguitar = guitars.get(found);
			foundguitar.setbrand(GuitarDto.getbrand());
			foundguitar.setprice(GuitarDto.getprice());
		}

	}

	@DeleteMapping(path = "/{id}")
	public void deleteguitar(@PathVariable("id") String id) {
		int found = -1;
		for (int i = 0; i < guitars.size(); i++) {
			if (guitars.get(i).gettype().equals(id)) {
				found = i;
				break;
			}
		}

		if (found != -1) {
			guitars.remove(found);
		}
	}

}