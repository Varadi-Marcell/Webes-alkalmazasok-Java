package database.service;

public interface PeopleService {
    Iterable<People> getAllPeople();

    People create(People toPeople);

    void deleteById(Long id);
}
