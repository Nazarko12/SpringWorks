package ua.lviv.iot.spring.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.first.dataaccess.SubjectRepository;
import ua.lviv.iot.spring.first.rest.model.Subject;
import java.util.List;

@Service
public class SubjectService {
  @Autowired
  private SubjectRepository subjectRepository;

  public List<Subject> getSubjects() {
    return subjectRepository.findAll();
  }

}
