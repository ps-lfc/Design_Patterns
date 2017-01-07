package genericCheckpointing.xmlStoreRestore;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import genericCheckpointing.util.File_Interface;
import genericCheckpointing.util.SerializableObject;

public class XMLSerialize implements SerializationStrategy {
	
	private StringBuilder stringBuilder;
	private SerializeTypes serializeTypes;
	public XMLSerialize() {
		this.stringBuilder = new StringBuilder();
		this.serializeTypes = new SerializeTypes();
	}
	@Override
	public void serializeObject(SerializableObject object,File_Interface file_Interface) {

		
		Class cls;
		try {
			cls = Class.forName(object.getClass().getName());
			Field fields[] = cls.getDeclaredFields();
			Method methodAll = null;

			stringBuilder.append(serializeTypes.startDPSerialization());
			stringBuilder.append(" " + serializeTypes.startComplexType(object.getClass().getName()));
			
			for (int i = 0; i < fields.length; i++) {
					methodAll = cls.getMethod("get" + fields[i].getName(), (Class<?>[]) null);
					Object result = methodAll.invoke(object, (Object[]) null);
					if (fields[i].getType().getSimpleName().equals("int")) {
						stringBuilder.append("  " +serializeTypes.serializemyInt(fields[i].getName(), result.toString()));
					} else if(fields[i].getType().getSimpleName().equals("long")) {
						stringBuilder.append("  " +serializeTypes.serializemyLong(fields[i].getName(), result.toString()));
					} else if(fields[i].getType().getSimpleName().equals("String")) {
						stringBuilder.append("  " +serializeTypes.serializemyString(fields[i].getName(), result.toString()));
					} else if(fields[i].getType().getSimpleName().equals("boolean")) {
						stringBuilder.append("  " +serializeTypes.serializemyBoolean(fields[i].getName(), result.toString()));
					}else if (fields[i].getType().getSimpleName().equals("double")) {
						stringBuilder.append("  " +serializeTypes.serializemyDouble(fields[i].getName(), result.toString()));
					} else if(fields[i].getType().getSimpleName().equals("float")) {
						stringBuilder.append("  " +serializeTypes.serializemyFloat(fields[i].getName(), result.toString()));
					} else if(fields[i].getType().getSimpleName().equals("short")) {	
						stringBuilder.append("  " +serializeTypes.serializemyShort(fields[i].getName(), result.toString()));
					} else if(fields[i].getType().getSimpleName().equals("char")) {
						stringBuilder.append("  " +serializeTypes.serializemyChar(fields[i].getName(), result.toString()));
					}
			}

			stringBuilder.append(" " + serializeTypes.endComplexType());
			stringBuilder.append(serializeTypes.endDPSerialization());
			file_Interface.filewriter(stringBuilder.toString());
			stringBuilder = new StringBuilder();
			
		} catch (ClassNotFoundException e) {
			System.err.println("Class Not found exception");
			System.exit(0);
		} catch (NoSuchMethodException e) {
			
			System.err.println("No such method Exception");
			System.exit(0);

		} catch (SecurityException e) {
			
			System.err.println("Security Exception");
			System.exit(0);

		} catch (IllegalAccessException e) {
			
			System.err.println("Illegal Access Exception");
			System.exit(0);

		} catch (IllegalArgumentException e) {
			
			System.err.println("Illegal Argument Exception");
			System.exit(0);

		} catch (InvocationTargetException e) {
			
			System.err.println("Invocation Target Exception");
			System.exit(0);

		}	
	}
}
