package genericCheckpointing.util;

public class MyAllTypesFirst extends SerializableObject {
	private int myInt;
	private long myLong;
	private String myString;
	private boolean myBoolean;
	public MyAllTypesFirst(){
		
	}
	public MyAllTypesFirst(int myInt_In, long myLong_In, String myString_In, Boolean myboolean_In) {
		this.myInt = myInt_In;
		this.myLong = myLong_In;
		this.myString = myString_In;
		this.myBoolean = myboolean_In;
	}
	public int getmyInt() {
		return myInt;
	}
	public void setmyInt(int myInt) {
		this.myInt = myInt;
	}
	public long getmyLong() {
		return myLong;
	}
	public void setmyLong(long myLong) {
		this.myLong = myLong;
	}
	public String getmyString() {
		return myString;
	}
	public void setmyString(String myString) {
		this.myString = myString;
	}
	public boolean getmyBoolean() {
		return myBoolean;
	}
	public void setmyBoolean(boolean myBoolean) {
		this.myBoolean = myBoolean;
	}
	
	@Override
	public String toString() {
		return "MyAllTypesFirst:  [ myInt :  " + myInt + ", myLong :  " + myLong + ", myString  :  " + myString + ", myBoolean  :  "
				+ myBoolean + "]"+System.getProperty("line.separator");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (myBoolean ? 1231 : 1237);
		result = prime * result + myInt;
		result = prime * result + (int) (myLong ^ (myLong >>> 32));
		result = prime * result + ((myString == null) ? 0 : myString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyAllTypesFirst other = (MyAllTypesFirst) obj;
		if (myBoolean != other.myBoolean)
			return false;
		if (myInt != other.myInt)
			return false;
		if (myLong != other.myLong)
			return false;
		if (myString == null) {
			if (other.myString != null)
				return false;
		} else if (!myString.equals(other.myString))
			return false;
		return true;
	}
}