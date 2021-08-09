import java.util.ArrayList;
import java.util.Comparator;

public class GameListAggregate  implements Aggregate{
	private ArrayList<Game> list = new ArrayList<Game>();
	private int numberOfStock;

	@Override
	public Iterator createIterator() {
		return new GameListIterator(this);
	}

	public void add(Game game) {
		list.add(numberOfStock, game);
		numberOfStock += 1;
		list.sort(Comparator.comparing(Game::getPrice));
	}

	public Object getAt(int number) {
		return list.get(number);
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}
}
