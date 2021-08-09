class Counter {
	private static int tvNum = 100;
	private static int radioNum = 76;

	public static int getTvNumber() {
		return tvNum++;
	}

	public static int getRadioNumber() {
		return radioNum++;
	}
}