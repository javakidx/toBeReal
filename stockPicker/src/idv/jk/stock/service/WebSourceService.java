package idv.jk.stock.service;

import java.io.IOException;
import java.net.MalformedURLException;

public class WebSourceService {
	public static void main(String... argv)
	{
		//TODO test
		try
		{
			String strUrl = "你要下載的檔案網址";
			URL source = new URL(strUrl);
			String theStrDestDir = "你要下載的檔案目的資料夾";
			File theStockDest = new File(theStrDestDir);
			FileUtils.forceMkdir(theStockDest);

			File destination = new File(theStrDestDir + 
					"下載儲存的檔名");

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
