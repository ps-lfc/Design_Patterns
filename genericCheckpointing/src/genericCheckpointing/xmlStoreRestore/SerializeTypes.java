package genericCheckpointing.xmlStoreRestore;

public class SerializeTypes {
	public SerializeTypes(){
		
	}
	public String startDPSerialization() {
		return "<DPSerialization>"+"\n";
	}
	public String endDPSerialization() {
		return "</DPSerialization>"+"\n";
	}
	public String startComplexType(String classCannoncaliName) {
		return "<complexType xsi:type=\"" + classCannoncaliName + "\">"+"\n";
	}
	public String endComplexType() {
		return "</complexType>"+"\n";
	}
	public String serializemyInt(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:int" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyLong(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:long" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyString(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:string" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyBoolean(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:boolean" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyDouble(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:double" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyFloat(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:float" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyShort(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:short" + "\">" + val + "</" + name + ">\n";
	}
	public String serializemyChar(String name,String val) {
		return "  <" + name + " xsi:type=\"xsd:char" + "\">" + val + "</" + name + ">\n";
	}
}