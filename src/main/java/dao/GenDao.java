package dao;

import java.util.List;

public interface GenDao<C> {
	public List<C> select();

	public List<C> selectByName(String fullname);

	public C detail(int id);

	public boolean insert(C cat);

	public boolean update(C cat);

	public boolean delete(int id);
}

