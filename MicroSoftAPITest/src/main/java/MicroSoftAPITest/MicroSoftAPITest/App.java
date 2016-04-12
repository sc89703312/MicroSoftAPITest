package MicroSoftAPITest.MicroSoftAPITest;

/**
 * Hello world!
 *
 */
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import MicroSoftAPITest.MicroSoftAPITest.common.OCRValueType;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.OCRAuxliary;






public class App
{
    public static void main(String[] args)
    {

//    	HttpClient httpClient = HttpClients.createDefault();
//        try
//        {
//            URIBuilder builder = new URIBuilder("https://api.projectoxford.ai/vision/v1/ocr");
//
//            builder.setParameter("language", "en");
//			builder.setParameter("detectOrientation ", "true");
//
//            URI uri = builder.build();
//            HttpPost request = new HttpPost(uri);
//            request.setHeader("Content-Type", "application/json");
//            request.setHeader("Ocp-Apim-Subscription-Key", "8b31514c240b4454bde093ba37aa07cc");
//
//
//            // Request body
//
//            StringEntity reqEntity = new StringEntity("{'url':'http://e.hiphotos.baidu.com/zhidao/pic/item/0df431adcbef76096f84fc0d2edda3cc7dd99e90.jpg'}");
//            request.setEntity(reqEntity);
//
//
//			HttpResponse response = httpClient.execute(request);
//            HttpEntity entity = response.getEntity();
//
//            if (entity != null)
//            {
//                System.out.println(EntityUtils.toString(entity));
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

    	try {
			OCRAuxliary test = new OCRAuxliary();
			System.out.println(test.getResult(OCRValueType.URL, "http://e.hiphotos.baidu.com/zhidao/pic/item/0df431adcbef76096f84fc0d2edda3cc7dd99e90.jpg"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}


