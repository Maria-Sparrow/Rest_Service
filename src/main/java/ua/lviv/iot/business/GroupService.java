package ua.lviv.iot.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.iot.dataaccess.GroupRepository;
import ua.lviv.iot.spring.first.project.rest.model.Group;

public class GroupService {

  @Autowired
  private GroupRepository groupRepository;

  public List<Group> findAll() {
    return groupRepository.findAll();
  }
}
