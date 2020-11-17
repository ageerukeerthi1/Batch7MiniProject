package com.cg.oiqgsWebAppProj.dao;
import java.sql.SQLException;
import java.util.List;
import com.cg.oiqgsWebAppProj.model.Accounts;
public interface AccountRepo {
	public Accounts addAccount(Accounts account)throws SQLException;
	
	public List<Accounts> getAllAccounts()throws SQLException;
}
