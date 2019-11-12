package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CucumberListener {
	
static Properties properties;
	
	public static void loadData() throws IOException{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"/src/main/java/resources/properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
	}
	
	
		
	public String getReportConfigPath(){
	 String reportConfigPath = properties.getProperty("reportConfigPath");
	 if(reportConfigPath!= null) return reportConfigPath;
	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}

}
