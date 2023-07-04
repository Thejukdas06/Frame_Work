package Generic_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetch_Data_From_PF 
{
@Test
public void test() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./PF1.properties"));
	String u = p.getProperty("Base_url");
	System.out.println(u);
}
}
