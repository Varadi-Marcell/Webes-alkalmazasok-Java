package uni.miskolc.GuitarEntityWithInterfaces;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GuitarMemoryRepository implements GuitarRepository {
    private final List<GuitarDto> Guitars = new ArrayList<>();

    private int findGuitarById(Long id) {
        int found = -1;
        for (int i = 0; i < Guitars.size(); i++) {
            if (Guitars.get(i).getType().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<GuitarDto> findAll() {
        return Guitars;
    }

    @Override
    public GuitarDto getById(Long id) {
        return null;
    }

    @Override
    public Long save(GuitarDto GuitarDto) {
        int found = findGuitarById(GuitarDto.getId());

        if (found != -1) {
            GuitarDto foundGuitar = Guitars.get(found);
            foundGuitar.setBrand(GuitarDto.getBrand());
            foundGuitar.setPrice(GuitarDto.getPrice());
        } else {
            Guitars.add(GuitarDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findGuitarById(id);

        if (found != -1) {
            Guitars.remove(found);
        }
    }
}
