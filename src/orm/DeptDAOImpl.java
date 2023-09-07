package orm;

import java.util.List;

public class DeptDAOImpl implements DeptDAO {
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "1111";
	
	public static final String INSERT_STMT = "insert into department values (?, ?, ?)";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
