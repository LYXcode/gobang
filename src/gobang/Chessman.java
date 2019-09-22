package gobang;

public enum Chessman {
	BLACK("BK"),WHITE("©–");
	private String chessman;
	private  Chessman(String chessman) {
		this.chessman=chessman;
	}
	public String getChessman() {
		return this.chessman;
	}

}
