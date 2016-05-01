package MicroSoftAPITest.MicroSoftAPITest.DTO.OCRItem;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OCRResult {
	private String language;
	private String textAngle;
	private String orientation;

	@JsonUnwrapped
	List<OCRRegion> regions;

	public OCRResult() {
		// TODO Auto-generated constructor stub
	}

	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTextAngle() {
		return textAngle;
	}
	public void setTextAngle(String textAngle) {
		this.textAngle = textAngle;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public List<OCRRegion> getRegions() {
		return regions;
	}
	public void setRegions(List<OCRRegion> regions) {
		this.regions = regions;
	}
	@Override
	public String toString() {
		return "Region [language=" + language + ", textAngle=" + textAngle + ", orientation=" + orientation
				+ ", regions=" + regions + "]";
	}
}
