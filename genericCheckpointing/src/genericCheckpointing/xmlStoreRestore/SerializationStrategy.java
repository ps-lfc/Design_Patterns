package genericCheckpointing.xmlStoreRestore;

import genericCheckpointing.util.File_Interface;
import genericCheckpointing.util.SerializableObject;

public interface SerializationStrategy {
	void serializeObject(SerializableObject serializableObject,File_Interface file_Interface);
}
