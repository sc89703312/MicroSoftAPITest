package MicroSoftAPITest.MicroSoftAPITest.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Word {

	String boundingBox;
	String text;

//	public Word() {
//		// TODO Auto-generated constructor stub
//	}
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
