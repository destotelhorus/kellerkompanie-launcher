package fr.soe.a3s.constant;

public enum RepositoryStatus {

	UPDATED("UPDATED"), OK("OK"), INDETERMINATED("-"), ERROR(
			"ERROR");

	private String description;

	private RepositoryStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
