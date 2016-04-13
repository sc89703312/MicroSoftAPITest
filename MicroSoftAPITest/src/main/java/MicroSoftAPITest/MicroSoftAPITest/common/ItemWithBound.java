package MicroSoftAPITest.MicroSoftAPITest.common;

public class ItemWithBound {

	protected String boundingBox;


	public int[] getCoordinate(){

		int[] converted_coordinates = new int[4];
		String[] coordinates = boundingBox.split(",");
		for(int i=0; i<coordinates.length; i++)
			converted_coordinates[i] = Integer.parseInt(coordinates[i]);


		return converted_coordinates;
	}
}
