package com.project.fitra.FitraModel;

public class ForgotpassModel {
            @Override
	public String toString() {
		return "ForgotpassModel [emailid=" + emailid + ", otp=" + otp + ", newpassword=" + newpassword
				+ ", confirmpassword=" + confirmpassword + ", getemailid()=" + getemailid() + ", getOtp()=" + getOtp()
				+ ", getNewpassword()=" + getNewpassword() + ", getConfirmpassword()=" + getConfirmpassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
			public ForgotpassModel(String emailid, String otp, String newpassword, String confirmpassword) {
		super();
		this.emailid = emailid;
		this.otp = otp;
		this.newpassword = newpassword;
		this.confirmpassword = confirmpassword;
	}
			public String getemailid() {
		return emailid;
	}
	public void setemailid(String emailid) {
		this.emailid = emailid;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
			public String emailid;
            public String otp;
            public String newpassword;
            public String confirmpassword;
}
