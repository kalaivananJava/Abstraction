package org.Main.testrun;

public class TestStatic {
     static private int staticVariable=0;

	static public int getStaticVariable() {
		return staticVariable;
	}

	static public void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
	}
     
}
