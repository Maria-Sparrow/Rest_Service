package ua.lviv.iot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.first.project.rest.model.Group;
import ua.lviv.iot.business.GroupService;

@RequestMapping("/groups")
@RestController
public class GroupController {

  @Autowired
  private GroupService groupService;

  @GetMapping
  public List<Group> getAllGroups() {
    return groupService.findAll();
  }
}
