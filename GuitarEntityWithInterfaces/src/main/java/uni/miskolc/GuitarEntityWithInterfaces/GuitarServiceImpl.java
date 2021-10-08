package uni.miskolc.GuitarEntityWithInterfaces;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class GuitarServiceImpl implements GuitarService {
    private final int MAXIMUM_Guitar_COUNT = 10;
    private final GuitarRepository GuitarRepository;

    public GuitarServiceImpl(GuitarRepository GuitarRepository) {
        this.GuitarRepository = GuitarRepository;
    }

    @Override
    public List<GuitarDto> findAll() {
        return GuitarRepository.findAll();
    }

    @Override
    public GuitarDto getById(Long id) {
        return GuitarRepository.getById(id);
    }

    @Override
    public Long save(GuitarDto GuitarDto) {
        if (GuitarRepository.findAll().size() >= MAXIMUM_Guitar_COUNT) {
            throw new TooMuchGuitarException();
        }
        return GuitarRepository.save(GuitarDto);
    }

    @Override
    public void deleteById(Long id) {
        GuitarRepository.deleteById(id);
    }
}
