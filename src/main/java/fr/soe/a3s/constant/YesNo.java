package fr.soe.a3s.constant;

public enum YesNo {

	YES("Yes"), NO("No");

	private String description;

	private YesNo(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public static YesNo getEnum(String description) {
		if (description.equals(YES.getDescription())) {
			return YES;
		} else if (description.equals(NO.getDescription())) {
			return NO;
		}
		return null;
	}
}
