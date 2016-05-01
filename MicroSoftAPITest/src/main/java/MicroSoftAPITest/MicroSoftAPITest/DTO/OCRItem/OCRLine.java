package MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import MicroSoftAPITest.MicroSoftAPITest.common.ItemWithBound;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OCRLine extends ItemWithBound {



	@JsonUnwrapped
	List<OCRWord> words;



	public String getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(String boundingBox) {
		this.boundingBox = boundingBox;
	}
	public List<OCRWord> getWords() {
		return words;
	}
	public void setWords(List<OCRWord> words) {
		this.words = words;
	}
	@Override
	public String toString() {
		return "Line [boundingBox=" + boundingBox + ", words=" + words + "]";
	}
}
