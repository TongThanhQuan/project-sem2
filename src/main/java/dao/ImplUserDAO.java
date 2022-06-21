package dao;

import java.util.List;

import entity.User;

public class ImplUserDAO {
	public class ImplUserDao implements GenDao<User>{

		@Override
		public List<User> select() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<User> selectByName(String fullname) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public User detail(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean insert(User cat) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean update(User cat) {
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
