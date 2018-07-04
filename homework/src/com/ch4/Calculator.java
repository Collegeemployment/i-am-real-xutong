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
			addFieldError("value1", "������1����Ϊ��");
			// addFieldError("value1", "������1����Ϊ��");
		}
		else{
			try {
				v1 = Double.parseDouble(value1);
			} catch (Exception ex) {
				addFieldError("value1", "������1����Ƿ�");
			}
		}
		if (value2 == null || value2.trim().equals("")) {
			addFieldError("value2", "������2����Ϊ��");
		}
		else{
			try {
				v2 = Double.parseDouble(value2);
				if((operatorNum==4)&&(v2==0)){
					addFieldError("value2", "������2��Ϊ��������Ϊ0");
				}
			} catch (Exception ex) {
				addFieldError("value2", "������2����Ƿ�");
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
