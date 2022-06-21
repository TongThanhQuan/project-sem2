package dao;

import java.util.List;

import org.hibernate.Session;

import entity.Category;
import utils.HibernateUtils;

public class ImplCategoryDAO implements GenDao<Category> {

	@Override
	public List<Category> select() {
		Session ss = HibernateUtils.getSessionFactory().openSession();
		ss.beginTransaction();
		@SuppressWarnings({ "unchecked", "unused" })
		List<Category> lst = ss.createQuery("from category").list();
		ss.close();
		return lst;
	}

	@Override
	public List<Category> selectByName(String fullname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category detail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Category cat) {
		Session ss = HibernateUtils.getSessionFactory().openSession();
		ss.beginTransaction();
		try {
			ss.save(cat);
			ss.getTransaction().commit(); // Xác nhận thay đổi
		} catch (Exception e) {
			System.out.println("Lỗi: " + e.getMessage());
			e.printStackTrace();
			return false;
		} finally {
			ss.close();
		}
		
		return true;
	}

	@Override
	public boolean update(Category cat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
