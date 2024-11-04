package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

//        System.out.println("=== TESTE 1: department insert ===");
//        Department newDepartment = new Department(null, "Food");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("=== TESTE 2: department findById ===");
        Department department = departmentDao.findById(8);
        System.out.println(department);

        System.out.println(" ");
        System.out.println("=== TESTE 3: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

        System.out.println(" ");
        System.out.println("=== TESTE 4: department update ===");
        department = departmentDao.findById(7);
        department.setName("Toys");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println(" ");
        System.out.println("=== TESTE 5: department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deletById(id);
        System.out.println("Delete completed");

        sc.close();


    }
}
