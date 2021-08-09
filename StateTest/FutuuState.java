class FutsuuState extends DogState {
	private static FutsuuState s = new FutsuuState();

	private FutsuuState() {
	}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {
		moto.changeState(IrairaState.getInstance());
	}

	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public String toString() {
		return "普通状態";
	}
}