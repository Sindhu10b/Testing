package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Generics {

	static String loginpath="./LoginCred//Login.properties";
	public static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.SS").format(new Date());
	
	public Properties getPropertieData() throws IOException {
	    File file = new File(loginpath);
	    FileInputStream fileInput = new FileInputStream(file);
	   //FileInputStream data = gn.getPropertieData();
	    Properties prop = new Properties();
	    prop.load(fileInput);
	    return prop;
	}
	
}
