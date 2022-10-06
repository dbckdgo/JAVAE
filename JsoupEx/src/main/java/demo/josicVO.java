package demo;

public class josicVO {
	private String Juga;
	private String DungRakrate;
	private String Siga;
	private String Goga;
	private String Zeoga;
	private String Georaeryang;
	private String Stype;
	private String VsYesterday;
	private String Time;

	public josicVO() {

	}

	public String getJuga() {
		return Juga;
	}

	public void setJuga(String juga) {
		Juga = juga;
	}

	public String getDungRakrate() {
		return DungRakrate;
	}

	public void setDungRakrate(String dungRakrate) {
		DungRakrate = dungRakrate;
	}

	public String getSiga() {
		return Siga;
	}

	public void setSiga(String siga) {
		Siga = siga;
	}

	public String getGoga() {
		return Goga;
	}

	public void setGoga(String goga) {
		Goga = goga;
	}

	public String getZeoga() {
		return Zeoga;
	}

	public void setZeoga(String zeoga) {
		Zeoga = zeoga;
	}

	public String getGeoraeryang() {
		return Georaeryang;
	}

	public void setGeoraeryang(String georaeryang) {
		Georaeryang = georaeryang;
	}

	public String getStype() {
		return Stype;
	}

	public void setStype(String stype) {
		Stype = stype;
	}

	public String getVsYesterday() {
		return VsYesterday;
	}

	public void setVsYesterday(String vsYesterday) {
		VsYesterday = vsYesterday;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	@Override
	public String toString() {
		return "josicVO [Juga=" + Juga + ", DungRakrate=" + DungRakrate + ", Siga=" + Siga + ", Goga=" + Goga
				+ ", Zeoga=" + Zeoga + ", Georaeryang=" + Georaeryang + ", Stype=" + Stype + ", VsYesterday="
				+ VsYesterday + ", Time=" + Time + "]";
	}

	public josicVO(String juga, String dungRakrate, String siga, String goga, String zeoga, String georaeryang,
			String stype, String vsYesterday, String time) {

		Juga = juga;
		DungRakrate = dungRakrate;
		Siga = siga;
		Goga = goga;
		Zeoga = zeoga;
		Georaeryang = georaeryang;
		Stype = stype;
		VsYesterday = vsYesterday;
		Time = time;
	}
}
