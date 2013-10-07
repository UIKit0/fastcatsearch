package org.fastcatsearch.ir.dictionary;

import java.io.IOException;
import java.io.OutputStream;

public interface WritableDictionary {
	
	public void addEntry(String keyword, String[] values);
	
	public void writeTo(OutputStream out) throws IOException;
	
}
