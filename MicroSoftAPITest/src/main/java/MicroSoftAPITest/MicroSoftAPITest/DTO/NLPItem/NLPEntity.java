package MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NLPEntity {

	String entity;

	String type;

	double score;

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "NLPEntity [entity=" + entity + ", type=" + type + ", score=" + score + "]";
	}


}
