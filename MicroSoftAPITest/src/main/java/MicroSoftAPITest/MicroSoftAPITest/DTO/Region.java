package MicroSoftAPITest.MicroSoftAPITest.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Region {

	String boundingBox;

	@JsonUnwrapped
	List<Line> lines;

//	public Region() {
//		// TODO Auto-generated constructor stub
//	}
	public String getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(String boundingBox) {
		this.boundingBox = boundingBox;
	}
	public List<Line> getLines() {
		return lines;
	}
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}
	@Override
	public String toString() {
		return "Region [boundingBox=" + boundingBox + ", lines=" + lines + "]";
	}


}
