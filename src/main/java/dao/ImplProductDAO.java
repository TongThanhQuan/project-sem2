package dao;

import java.util.List;

import entity.Product;

public class ImplProductDAO {
	public class ImplProductDao implements GenDao<Product>{

		@Override
		public List<Product> select() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Product> selectByName(String fullname) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Product detail(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean insert(Product cat) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean update(Product cat) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean delete(int id) {
			// TODO Auto-generated method stub
			return false;
		}

		
	}
}
