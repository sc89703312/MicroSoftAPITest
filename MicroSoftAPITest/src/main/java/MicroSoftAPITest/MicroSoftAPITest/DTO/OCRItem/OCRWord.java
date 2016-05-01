package MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import MicroSoftAPITest.MicroSoftAPITest.common.ItemWithBound;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OCRWord extends ItemWithBound{

	String boundingBox;
	String text;


	public String getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(String boundingBox) {
		this.boundingBox = boundingBox;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Word [boundingBox=" + boundingBox + ", text=" + text + "]";
	}



}
