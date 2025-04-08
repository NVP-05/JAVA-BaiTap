package Bai1.bussiness.dao.StudentDao;

import Bai1.bussiness.dao.AppDao;
import Bai1.bussiness.model.Student;

import java.util.List;

public interface StudentDao extends AppDao<Student> {
        List<Student> findAll();

        Student findById(int id);
}
