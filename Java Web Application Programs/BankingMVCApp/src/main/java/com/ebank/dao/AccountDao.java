package com.ebank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ebank.bean.Account;
import com.ebank.resource.DbResource;

public class AccountDao {

	public int createAccount(Account account) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into account(emailid,amount) values(?,?)");
			pstmt.setString(1, account.getEmailid());
			pstmt.setFloat(2, account.getAmount());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
