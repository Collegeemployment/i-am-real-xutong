package com.ch4;

import com.opensymphony.xwork2.ActionSupport;

public class Calculator extends ActionSupport {
	private String value1;
	private String value2;
	private double result;
	private int operatorNum;

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public int getOperatorNum() {
		return operatorNum;
	}

	public void setOperatorNum(int operatorNum) {
		this.operatorNum = operatorNum;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void validate() {

		double v1 = 0, v2 = 0;
		if (getValue1() == null || getValue1().trim().equals("")) {
			// System.out.print(value1 +
			// "*******************************************");
			addFieldError("value1", "操作数1不能为空");
			// addFieldError("value1", "操作数1不能为空");
		}
		else{
			try {
				v1 = Double.parseDouble(value1);
			} catch (Exception ex) {
				addFieldError("value1", "操作数1输入非法");
			}
		}
		if (value2 == null || value2.trim().equals("")) {
			addFieldError("value2", "操作数2不能为空");
		}
		else{
			try {
				v2 = Double.parseDouble(value2);
				if((operatorNum==4)&&(v2==0)){
					addFieldError("value2", "操作数2作为除数不能为0");
				}
			} catch (Exception ex) {
				addFieldError("value2", "操作数2输入非法");
			}
		}
	}

	public void calculate() {
		try {
			int key = operatorNum;
			double v1 = Double.parseDouble(value1);
			double v2 = Double.parseDouble(value2);
			switch (key) {
			case 1:
				result = v1 + v2;
				break;
			case 2:
				result = v1 - v2;
				break;
			case 3:
				result = v1 * v2;
				break;
			case 4:
				result = v1 / v2;
				break;
			default:
				break;
			}
		} catch (Exception ex) {
			System.out.print(ex);
		}
	}
}
