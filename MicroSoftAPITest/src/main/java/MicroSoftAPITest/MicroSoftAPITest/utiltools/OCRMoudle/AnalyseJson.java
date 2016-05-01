package MicroSoftAPITest.MicroSoftAPITest.utiltools.OCRMoudle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRLine;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRRegion;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRResult;
import MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem.OCRWord;

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

}
