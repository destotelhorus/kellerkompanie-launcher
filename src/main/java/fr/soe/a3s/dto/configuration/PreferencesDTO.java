package fr.soe.a3s.dto.configuration;

import fr.soe.a3s.constant.*;

public class PreferencesDTO {

	private MinimizationType launchPanelGameLaunch;
	private MinimizationType launchPanelMinimized;
	private LookAndFeel lookAndFeel;
	private IconResize iconResizeSize;
	private StartWithOS startWithOS;
	private CheckRepositoriesFrequency checkRepositoriesFrequency;
	private YesNo warnExactMatchDelete;

	public MinimizationType getLaunchPanelGameLaunch() {
		return launchPanelGameLaunch;
	}

	public void setLaunchPanelGameLaunch(MinimizationType launchPanelGameLaunch) {
		this.launchPanelGameLaunch = launchPanelGameLaunch;
	}

	public MinimizationType getLaunchPanelMinimized() {
		return launchPanelMinimized;
	}

	public void setLaunchPanelMinimized(MinimizationType launchPanelMinimized) {
		this.launchPanelMinimized = launchPanelMinimized;
	}

	public LookAndFeel getLookAndFeel() {
		return lookAndFeel;
	}

	public void setLookAndFeel(LookAndFeel lookAndFeel) {
		this.lookAndFeel = lookAndFeel;
	}

	public IconResize getIconResizeSize() {
		return iconResizeSize;
	}

	public void setIconResizeSize(IconResize iconResizeSize) {
		this.iconResizeSize = iconResizeSize;
	}

	public StartWithOS getStartWithOS() {
		return startWithOS;
	}

	public void setStartWithOS(StartWithOS startWithOS) {
		this.startWithOS = startWithOS;
	}

	public CheckRepositoriesFrequency getCheckRepositoriesFrequency() {
		return checkRepositoriesFrequency;
	}

	public void setCheckRepositoriesFrequency(
			CheckRepositoriesFrequency checkRepositoriesFrequency) {
		this.checkRepositoriesFrequency = checkRepositoriesFrequency;
	}

	public YesNo getWarnExactMatchDelete() {
		return warnExactMatchDelete;
	}

	public void setWarnExactMatchDelete( YesNo warnExactMatchDelete ) { this.warnExactMatchDelete = warnExactMatchDelete; }
}
