import java.util.*;


public class Randoms implements Iterable<Integer> {
	
	protected Random random;
	private int min;
	private int max;
	
	public Randoms(int min, int max) {
		random = new Random();
		this.min = min;
		this.max = max;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator() {
			
			@Override
			public boolean hasNext() {
				return true;
			}
			
			@Override
			public Integer next() {
				return random.nextInt(max - min) + (min + 1);
			}
		};
	}
}
