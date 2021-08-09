 class NeteiruState extends DogState{
	private static NeteiruState s = new NeteiruState();

	private NeteiruState() {
	}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {
		moto.changeState(IrairaState.getInstance());
	}

	public void tabeta(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}

	public String toString() {
		return "寝ている状態";
	}
}
