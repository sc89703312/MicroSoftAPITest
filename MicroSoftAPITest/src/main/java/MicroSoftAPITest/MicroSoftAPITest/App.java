package MicroSoftAPITest.MicroSoftAPITest;


import java.util.Map;

/**
 * Hello world!
 *
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem.NLPResult;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRResult;
import MicroSoftAPITest.MicroSoftAPITest.common.AnalyseJson;
import MicroSoftAPITest.MicroSoftAPITest.common.OCRValueType;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.FileToBytes;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.NLPMoudle.NLPAuxliary;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.OCRMoudle.OCRAuxliary;






public class App
{
    public static void main(String[] args) throws Exception
    {

//    	byte[] img = FileToBytes.image2Bytes("F:\\i\\1.png");
//    	System.out.println(img);
//    	String raw_data = "";
//    	try {
//			OCRAuxliary test = new OCRAuxliary();
//			raw_data = test.getResult(OCRValueType.BYTES, img);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//    	System.out.println(raw_data);
//
//    	ObjectMapper mapper = new ObjectMapper();
//    	OCRResult result = mapper.readValue(raw_data, OCRResult.class);
//    	System.out.println(result.toString());
//
//    	Map<String, String> resultTemp = AnalyseJson.AnalyseResultObj(result);
//    	for(Map.Entry<String, String> entry: resultTemp.entrySet())
//    		System.out.println(entry.getKey() +" " + entry.getValue());


    	NLPAuxliary test = new NLPAuxliary();
    	String content = test.getResult("明天下午四点去教学楼");

    	ObjectMapper mapper = new ObjectMapper();

    	NLPResult result = mapper.readValue(content, NLPResult.class);
    	AnalyseJson.AnalyseResultObj(result);


    }
}


