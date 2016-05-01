package MicroSoftAPITest.MicroSoftAPITest.DTO.NLPItem;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NLPResult {

	String query;

	List<NLPEntity> entities;

	List<NLPIntent> intents;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public List<NLPEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<NLPEntity> entities) {
		this.entities = entities;
	}

	public List<NLPIntent> getIntents() {
		return intents;
	}

	public void setIntents(List<NLPIntent> intents) {
		this.intents = intents;
	}

	@Override
	public String toString() {
		return "NLPResult [query=" + query + ", entities=" + entities + ", intents=" + intents + "]";
	}


}
