package idv.jk.stock.service;

import java.io.IOException;
import java.net.MalformedURLException;

public class WebSourceService {
	public static void main(String... argv)
	{
		//TODO test
		try
		{
			String strUrl = "�A�n�U�����ɮ׺��}";
			URL source = new URL(strUrl);
			String theStrDestDir = "�A�n�U�����ɮץت���Ƨ�";
			File theStockDest = new File(theStrDestDir);
			FileUtils.forceMkdir(theStockDest);

			File destination = new File(theStrDestDir + 
					"�U���x�s���ɦW");

			FileUtils.copyURLToFile(source, destination);
			//File file = new File(".");
			System.out.println("File Downloaded!");
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
