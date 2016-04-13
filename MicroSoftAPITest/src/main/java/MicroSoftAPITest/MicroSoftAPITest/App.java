package MicroSoftAPITest.MicroSoftAPITest;

/**
 * Hello world!
 *
 */
import java.net.URI;
import java.util.List;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import MicroSoftAPITest.MicroSoftAPITest.DTO.Result;
import MicroSoftAPITest.MicroSoftAPITest.common.OCRValueType;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.FileToBytes;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.OCRAuxliary;






public class App
{
    public static void main(String[] args) throws Exception
    {

    	byte[] img = FileToBytes.image2Bytes("F:\\i\\blog.png");
    	System.out.println(img);
    	String raw_data = "";
    	try {
			OCRAuxliary test = new OCRAuxliary();
			raw_data = test.getResult(OCRValueType.BYTES, img);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



    	ObjectMapper mapper = new ObjectMapper();
    	Result result = mapper.readValue(raw_data, Result.class );
    	System.out.println(result.toString());
    }
}


