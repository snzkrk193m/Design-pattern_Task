class TanoshiiState extends DogState {
	private static TanoshiiState s = new TanoshiiState();

	private TanoshiiState() {
	}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {
		moto.changeState(IrairaState.getInstance());
	}

	public void tabeta(Dog moto) {
		moto.changeState(NeteiruState.getInstance());
	}

	public String toString() {
		return "楽しい状態";
	}
}