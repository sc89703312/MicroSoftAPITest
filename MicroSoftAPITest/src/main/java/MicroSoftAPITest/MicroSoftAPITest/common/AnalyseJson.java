package MicroSoftAPITest.MicroSoftAPITest.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem.NLPEntity;
import MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem.NLPIntent;
import MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem.NLPResult;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRLine;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRRegion;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRResult;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRWord;
import MicroSoftAPITest.MicroSoftAPITest.utiltools.OCRMoudle.OCRAuxliary;

public class AnalyseJson {

	public static Map<String, String> AnalyseResultObj(OCRResult obj){


		Map<String, String> resultMap = new HashMap<String, String>();


		List<OCRRegion> regions = obj.getRegions();
		int region_length = regions.size();

		for(int i=0; i<region_length; i++){
			String result_string = "";
			OCRRegion temp_region = regions.get(i);

			List<OCRLine> lines = temp_region.getLines();
			int line_length = lines.size();

			for(int j=0; j<line_length; j++){
				OCRLine temp_line = lines.get(j);

				List<OCRWord> words = temp_line.getWords();

				for(OCRWord word: words)
					result_string += word.getText();

			}

			resultMap.put("Region No: "+ i, result_string);
		}
		return resultMap;

	}




	public static String AnalyseResultObj(NLPResult result){

		String query = result.getQuery();
		List<NLPIntent> intent_list = result.getIntents();
		List<NLPEntity> entity_list = result.getEntities();

		String most_intented = intent_list.get(0).getIntent();
		System.out.println(most_intented);

		for(NLPEntity entity: entity_list){

			if(EntityItem.getEntityList().contains(entity.getType()))
				System.out.println(entity.toString());
		}


		return most_intented;


	}


}
