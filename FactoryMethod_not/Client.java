public class Client {
	public static void main(String[] args) {
		Seihin[] seihins = new Seihin[3];
		seihins[0] = new Television();
		seihins[1] = new Radio();
		seihins[2] = new Television();
		for (int i = 0; i < seihins.length; ++i) {
			if (seihins[i] instanceof Television) {
				((Television) seihins[i]).numberring();
				((Television) seihins[i]).setDate(Date.today());
			} else if (seihins[i] instanceof Radio) {
				((Radio) seihins[i]).numberring();
			}
		}
		for (int i = 0; i < seihins.length; ++i) {
			seihins[i].print();
		}

	}
}