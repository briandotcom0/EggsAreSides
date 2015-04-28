package com.bjj.eas;

public class Exercise
{
	public static final short jumprope=1;
	public static final short strechband=2;
	public static final short exerciseband=4;
	public static final short dumbell=8;
	public static final short kettle=16;
	public static final short pull=32;
	public static final short atlas=64;
	public static final short medicine=128;
	
	private int depends;
	private int works;
	private String name;
	//name, depends, works, set
	
	public Exercise(String line)
	{
		String[]ln=line.split(", ");
		//if (ln.length != 3)
			//bad
android.util.Log.d("eas",ln.length+": "+ln[0]+"|"+ln[1]+"|"+ln[2]);
		name=ln[0];
		depends=Integer.parseInt(ln[1]);
		works=Integer.parseInt(ln[2]);
	}
	
	public boolean canDo(int equip)
	{
		 return (equip|depends) == equip;//equip&depends == depends
	}
	
	public String name()
	{	return name;	}
	public int depends()
	{	return depends;	}
	public int works()
	{	return works;	}
}
