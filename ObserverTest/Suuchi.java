class Suuchi extends Subject {
	boolean suuchiState;
	int atai;

	public boolean getState() {
		return suuchiState;
	}

	public void putValue(int atai) {
		if (atai > this.atai) {
			this.atai = atai;
			this.tsuuchi();
		} else {
			System.out.println("確認用メッセージ:更新してません");
		}
	}

	public int getValue() {
		return atai;
	}
}