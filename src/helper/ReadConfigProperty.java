package helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperty {
	
	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigProperty() {
		try {
			input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("resources/config.properties");
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public String getUrl() {
		if(prop.getProperty("url") == null)
			return "";
		return prop.getProperty("url");
		
		// NOTE : this url always be in http://www.example.com. dont use www.example.com in config properties file
	}
	
	public String getBrowser() {
		if(prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}
	
	public String getUsername() {
		if(prop.getProperty("Username") == null)
			return "";
		return prop.getProperty("Username");
	}
	
	public String getPassword() {
		if(prop.getProperty("Password") == null)
			return "";
		return prop.getProperty("Password");
	}

}
