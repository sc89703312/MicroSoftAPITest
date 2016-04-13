package MicroSoftAPITest.MicroSoftAPITest.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import MicroSoftAPITest.MicroSoftAPITest.common.ItemWithBound;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Region extends ItemWithBound {

	String boundingBox;

	@JsonUnwrapped
	List<Line> lines;


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
