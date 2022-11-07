package se.lexicon.data;

import se.lexicon.model.Teacher;

public interface ITeacherRepository extends IBaseRepository{

  int MAX_TEACHERS = 9;

  Teacher[] findAll();
}
