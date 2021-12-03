package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("====TESTE1: Seller findById====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("====TESTE2: Seller findByDepartment====");
		
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
	}

}
