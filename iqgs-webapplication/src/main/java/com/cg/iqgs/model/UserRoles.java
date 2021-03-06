package com.cg.iqgs.model;

public class UserRoles {
		private String userName;
		private String password;
		private String roleCode;
		
		public UserRoles() {
			
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRoleCode() {
			return roleCode;
		}

		public void setRoleCode(String roleCode) {
			this.roleCode = roleCode;
		}

		@Override
		public String toString() {
			return "UserRoles [userName=" + userName + ", password=" + password + ", roleCode=" + roleCode + "]";
		}

		public UserRoles(String userName, String password, String roleCode) {
			super();
			this.userName = userName;
			this.password = password;
			this.roleCode = roleCode;
		}
		
}