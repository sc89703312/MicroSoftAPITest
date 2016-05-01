package MicroSoftAPITest.MicroSoftAPITest.common;

import java.util.ArrayList;
import java.util.List;

public class EntityItem {

	public static List<String> entityList;

	static{
		entityList = new ArrayList<String>();
		entityList.add("地点");
		entityList.add("builtin.datetime.date");
		entityList.add("builtin.datetime.time");
	}


	public static List<String> getEntityList(){

		return entityList;

	}
}
