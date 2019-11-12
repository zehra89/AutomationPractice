package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	static Properties properties;
	
	public static void loadData() throws IOException{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"/src/main/java/resources/properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
	}
	
	public static String getObject(String data) throws IOException
	{
		loadData();
		String propData = properties.getProperty(data);
	    return propData;
	}
	    
	

}
