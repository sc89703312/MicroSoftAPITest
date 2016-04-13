package MicroSoftAPITest.MicroSoftAPITest.utiltools;

import java.io.IOException;
import java.net.URI;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import MicroSoftAPITest.MicroSoftAPITest.common.OCRValueType;

public class OCRAuxliary {


	HttpClient httpClient = HttpClients.createDefault();
	URIBuilder builder;
	HttpPost request;
	AbstractHttpEntity entity;

	public OCRAuxliary() throws Exception {
		// TODO Auto-generated constructor stub


		builder = new URIBuilder("https://api.projectoxford.ai/vision/v1/ocr");

        builder.setParameter("language", "unk");
		builder.setParameter("detectOrientation ", "true");


		URI uri = builder.build();
        request = new HttpPost(uri);
        request.setHeader("Ocp-Apim-Subscription-Key", "8b31514c240b4454bde093ba37aa07cc");



		}



	public String getResult(OCRValueType type, Object...args) throws Exception{

		switch(type){
		case URL:

			String image_url = (String) args[0];
			request.setHeader("Content-Type", "application/json");
			entity = new StringEntity("{'url':'" + image_url + "'}");
			break;

		case BYTES:

			byte[] img = (byte[]) args[0];
			request.setHeader("Content-Type", "application/octet-stream");
			entity = new ByteArrayEntity(img);
			break;
		}

		return getReponse(entity);
	}

	public String getReponse(AbstractHttpEntity entity){

		long start_time = System.currentTimeMillis();
		System.out.println("Start once connect");

		 request.setEntity(entity);
		 String answer = "";

			try {
			 HttpResponse response = httpClient.execute(request);
	         HttpEntity http_entity = response.getEntity();

	         if (entity != null){
					answer = EntityUtils.toString(http_entity);
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		long end_time = System.currentTimeMillis();
		System.out.println("This connection toke " + (end_time - start_time) +" ms");

		return answer;
	}


}
