package genericCheckpointing.xmlStoreRestore;

import genericCheckpointing.util.File_Interface;
import genericCheckpointing.util.SerializableObject;

public interface DeSerializationStrategy {
	Object deSerializeObject(File_Interface file_Interface);
}
