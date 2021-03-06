package com.cg.oiqgsWebAppProj.service;
import java.sql.SQLException;
import java.util.List;
import com.cg.oiqgsWebAppProj.dao.AccountRepo;
import com.cg.oiqgsWebAppProj.dao.AccountRepoImpl;
import com.cg.oiqgsWebAppProj.model.Accounts;
public class AccountServiceImpl implements AccountService{
   AccountRepo repo;	
	public AccountServiceImpl() throws SQLException {
		repo=new AccountRepoImpl();	
	}	
	@Override
	public Accounts addAccount(Accounts account) throws SQLException {		
		return repo.addAccount(account);
	}	
	@Override
	public Accounts getAccountByNumber(long accountNumber) throws SQLException {		
		return repo.getAccountByNumber(accountNumber);
	}
	@Override
	public Accounts updateAccount(Accounts account) throws SQLException{ 
		return repo.updateAccount(account);
	}

	@Override
	public boolean deleteAccount(long accountNumber) throws SQLException {
		return repo.deleteAccount(accountNumber);
	}
	@Override
	public List<Accounts> getAllAccounts() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllAccounts();
	}

}

