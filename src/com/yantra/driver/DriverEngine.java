package com.yantra.driver;
//Akash Has made this change on 25thAug2018
import java.io.IOException;

import com.yantra.product.parabank.tc.TC_LoginPage;
import com.yantra.product.parabank.tc.TC_OpenNewAccount;
import com.yantra.product.parabank.tc.TC_RequestLoan;

public class DriverEngine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
TC_LoginPage login=new TC_LoginPage();
login.t_01_validate_parabank_login();
login.t_02_negative_enter_correct_user_name_wrong_password();
login.t_03_negative_enter_wrong_user_name_correct_password();
login.t_04_negative_enter_wrong_user_name_wrong_password();
/*
*TC_OpenNewAccount open_newaccoumt= new TC_OpenNewAccount();
*open_newaccoumt.t_01_validate_parabank_opennewaccount();
*open_newaccoumt.t_02_validate_parabank_opennewaccount();
*open_newaccoumt.t_03_validate_parabank_opennewaccount();
*open_newaccoumt.t_04_validate_parabank_opennewaccount();
*open_newaccoumt.t_05_validate_parabank_opennewaccount();
*open_newaccoumt.t_06_validate_parabank_opennewaccount();
*open_newaccoumt.t_07_validate_parabank_opennewaccount();
*/

TC_RequestLoan request_loan= new TC_RequestLoan();
request_loan.t_01_validate_parabank_requestloan();
request_loan.t_02_validate_parabank_requestloan();
request_loan.t_03_validate_parabank_requestloan();
request_loan.t_04_validate_parabank_requestloan();
request_loan.t_05_validate_parabank_requestloan();
request_loan.t_06_validate_parabank_requestloan();
request_loan.t_07_validate_parabank_requestloan();
request_loan.t_08_validate_parabank_requestloan();
request_loan.t_09_validate_parabank_requestloan();

		
	

	}
	
}
