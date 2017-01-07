package genericCheckpointing.xmlStoreRestore;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Vector;

import genericCheckpointing.util.File_Interface;
import genericCheckpointing.util.SerializableObject;

public class StoreRestoreHandler implements InvocationHandler {

	
	private File_Interface file_Interface;
	public StoreRestoreHandler(File_Interface file_Interface_In) {
		this.file_Interface = file_Interface_In;
	}
	public StoreRestoreHandler() {
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("writeObj".equals(method.getName())) {
			if("XML".equals(args[1].toString())) {
				serializeObject((SerializableObject)args[0],new XMLSerialize());
			}		
		} else if ("readObj".equals(method.getName())) {
			if("XML".equals(args[0].toString())) {
				return deSerializeObject(new XMLDeSerialize());
			}
		}
		
		return null;
	}
	private void serializeObject(SerializableObject object, SerializationStrategy serialize) {
		serialize.serializeObject(object, file_Interface);	
	}
	private Object deSerializeObject( DeSerializationStrategy deSerialize) {
		return deSerialize.deSerializeObject(file_Interface);
	}
}