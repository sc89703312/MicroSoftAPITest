package MicroSoftAPITest.MicroSoftAPITest.utiltools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MicroSoftAPITest.MicroSoftAPITest.DTO.Line;
import MicroSoftAPITest.MicroSoftAPITest.DTO.Region;
import MicroSoftAPITest.MicroSoftAPITest.DTO.Result;
import MicroSoftAPITest.MicroSoftAPITest.DTO.Word;

public class AnalyseJson {

	public static Map<String, String> AnalyseResultObj(Result obj){

		Map<String, String> resultMap = new HashMap<String, String>();


		List<Region> regions = obj.getRegions();
		int region_length = regions.size();

		for(int i=0; i<region_length; i++){
			String result_string = "";
			Region temp_region = regions.get(i);

			List<Line> lines = temp_region.getLines();
			int line_length = lines.size();

			for(int j=0; j<line_length; j++){
				Line temp_line = lines.get(j);

				List<Word> words = temp_line.getWords();

				for(Word word: words)
					result_string += word.getText();

			}

			resultMap.put("Region No: "+ i, result_string);
		}
		return resultMap;

	}

}
