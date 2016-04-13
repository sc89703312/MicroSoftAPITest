package MicroSoftAPITest.MicroSoftAPITest.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import MicroSoftAPITest.MicroSoftAPITest.common.ItemWithBound;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Line extends ItemWithBound {



	@JsonUnwrapped
	List<Word> words;



	public String getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(String boundingBox) {
		this.boundingBox = boundingBox;
	}
	public List<Word> getWords() {
		return words;
	}
	public void setWords(List<Word> words) {
		this.words = words;
	}
	@Override
	public String toString() {
		return "Line [boundingBox=" + boundingBox + ", words=" + words + "]";
	}
}
