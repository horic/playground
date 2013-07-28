package migel.controllers;

public class Status {

	private String attr1;
	private int num;
	private String[] arrayVal;

	public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String[] getArrayVal() {
		return arrayVal;
	}

	public void setArrayVal(String[] arrayVal) {
		this.arrayVal = arrayVal;
	}

	public Status(String attr1, int num, String[] arrayVal) {
		super();
		this.attr1 = attr1;
		this.num = num;
		this.arrayVal = arrayVal;
	}

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
