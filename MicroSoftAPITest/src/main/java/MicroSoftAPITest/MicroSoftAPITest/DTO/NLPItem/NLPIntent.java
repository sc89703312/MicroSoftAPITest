package MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NLPIntent {

	String intent;

	double score;

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "NLPIntent [intent=" + intent + ", score=" + score + "]";
	}



}
