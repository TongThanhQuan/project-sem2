package utils;

import java.util.List;

import dao.IUserDAO;
import dao.ImplUserDAO;
import entity.User;
import entity.Category;

public class Test {

	public static void main(String[] args) {
		// Lấy dữ liệu phòng ban
		IUserDAO useDAO = new ImplUserDAO();
		List<User> lst = useDAO.selectAll();
		for (User use : lst) {
			System.out.println(use.getId() + ". " + use.getName());
		}
		System.out.println("---------------------------------");
		System.out.println("Phòng ban có mã 3:");
		User use = useDAO.selectById(3);
		List<Category> lstNV = use.getLstCat();
		for (Category e : lstNV) {
			System.out.println(e.toString());
		}
	}

}
