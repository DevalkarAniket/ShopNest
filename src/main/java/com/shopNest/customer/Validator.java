package com.shopNest.customer;

import com.shopNest.dbHandler.DataFetcher;

public class Validator {
	public static boolean isValid(String uName, String password) {
		String dbPass = DataFetcher.fetchPass(uName);
		if (password.equals(dbPass)) {
			return true;
		} else {
			return false;
		}
	}
}
