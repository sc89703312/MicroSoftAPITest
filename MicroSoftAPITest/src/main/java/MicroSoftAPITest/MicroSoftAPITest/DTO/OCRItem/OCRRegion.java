package MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import MicroSoftAPITest.MicroSoftAPITest.common.ItemWithBound;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OCRRegion extends ItemWithBound {

	String boundingBox;

	@JsonUnwrapped
	List<OCRLine> lines;


	public String getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(String boundingBox) {
		this.boundingBox = boundingBox;
	}
	public List<OCRLine> getLines() {
		return lines;
	}
	public void setLines(List<OCRLine> lines) {
		this.lines = lines;
	}
	@Override
	public String toString() {
		return "Region [boundingBox=" + boundingBox + ", lines=" + lines + "]";
	}


}
