package suppression;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project implements Runnable{

	private final static String USER_AGENT = "Mozilla/5.0";
	private static BufferedReader br = null;
	private List<String> list;
	
	static {
		try {
			br = new BufferedReader (new FileReader("/Users/mengwang/Desktop/Suppression/Android/xac.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		String line = null;
		int count = 0;
		URL url;
		String temp = null;
		StringBuffer sb = new StringBuffer();
		while (true) {
			//synchronized(br) {
				try {
					while((line = br.readLine()) != null) {
						synchronized(line) {
							System.out.println(line + " " + count + Thread.currentThread().getName());
							//apple_idfa, google_ad_id
							url = new URL ("http://service.sponsorpay.com/installs/v2?appid=40d67e58e66c50905f0c1c21948c184c&answer_received=0&install_attributed=0&google_ad_id=" + line + "&SE_script");
							
							HttpURLConnection con = (HttpURLConnection) url.openConnection();
							con.setRequestMethod("GET");
							con.setRequestProperty("User-Agent", USER_AGENT);
							//System.out.println (url);
							count++;
							int responseCode = con.getResponseCode();
							System.out.println(responseCode);
							
							try {
								Thread.sleep(1/500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			//}
			}
			//if(line == null)
			//	break;
		}


}
