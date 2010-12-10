package xj.ericli.ssi.db.ibatis.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;

import xj.ericli.ssi.db.ibatis.model.Dept;
import xj.ericli.ssi.db.ibatis.model.DeptExample;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

public class DeptDAOImpl implements DeptDAO {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	private SqlMapClient sqlMapClient;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public DeptDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public void insert(Dept record) throws SQLException {
		sqlMapClient.insert("dept.abatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int updateByPrimaryKey(Dept record) throws SQLException {
		int rows = sqlMapClient.update("dept.abatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int updateByPrimaryKeySelective(Dept record) throws SQLException {
		int rows = sqlMapClient.update("dept.abatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public List selectByExample(DeptExample example) throws SQLException {
		List list = sqlMapClient.queryForList("dept.abatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public Dept selectByPrimaryKey(Integer deptid) throws SQLException {
		Dept key = new Dept();
		key.setDeptid(deptid);
		Dept record = (Dept) sqlMapClient.queryForObject("dept.abatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int deleteByExample(DeptExample example) throws SQLException {
		int rows = sqlMapClient.delete("dept.abatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int deleteByPrimaryKey(Integer deptid) throws SQLException {
		Dept key = new Dept();
		key.setDeptid(deptid);
		int rows = sqlMapClient.delete("dept.abatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int countByExample(DeptExample example) throws SQLException {
		Integer count = (Integer) sqlMapClient.queryForObject("dept.abatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int updateByExampleSelective(Dept record, DeptExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = sqlMapClient.update("dept.abatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	public int updateByExample(Dept record, DeptExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = sqlMapClient.update("dept.abatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table dept
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	private static class UpdateByExampleParms extends DeptExample {
		private Object record;

		public UpdateByExampleParms(Object record, DeptExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}