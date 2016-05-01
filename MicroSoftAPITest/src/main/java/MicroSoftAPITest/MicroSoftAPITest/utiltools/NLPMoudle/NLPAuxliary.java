package MicroSoftAPITest.MicroSoftAPITest.utiltools.NLPMoudle;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class NLPAuxliary {

	String url;
	HttpClient httpClient = HttpClients.createDefault();
	URIBuilder builder;
	HttpGet request;


	public NLPAuxliary() throws Exception {
		// TODO Auto-generated constructor stub

		builder = new URIBuilder("https://api.projectoxford.ai/luis/v1/application");

        builder.setParameter("id", "c55b1b3b-c7ee-4472-a54f-6ebd468b7255");
		builder.setParameter("subscription-key", "4dea0532eecb449eaca6f19615a1adcb");




	}


	public String getResult(String content) throws Exception{

		builder.setParameter("q", content);


		URI uri = builder.build();
        request = new HttpGet(uri);

        return getReponse();
	}



	public String getReponse(){

		long start_time = System.currentTimeMillis();
		System.out.println("Start once connect");


		 String answer = "";

			try {
			 HttpResponse response = httpClient.execute(request);
	         HttpEntity http_entity = response.getEntity();


					answer = EntityUtils.toString(http_entity);

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


	public static void main(String [] args) throws Exception{
		System.out.println(new NLPAuxliary().getResult("星期五晚上去吃拉面"));
	}
}
