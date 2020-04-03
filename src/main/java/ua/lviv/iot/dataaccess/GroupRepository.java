package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.first.project.rest.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {

}
