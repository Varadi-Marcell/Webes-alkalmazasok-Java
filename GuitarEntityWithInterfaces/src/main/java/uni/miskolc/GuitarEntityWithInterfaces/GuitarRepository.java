package uni.miskolc.GuitarEntityWithInterfaces;

import java.util.List;

public interface GuitarRepository {
    List<GuitarDto> findAll();
    GuitarDto getById(Long id);
    Long save(GuitarDto GuitarDto);
    void deleteById(Long id);
}
