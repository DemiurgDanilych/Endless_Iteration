import java.util.*;


public class Randoms implements Iterable<Integer> {
	protected Random random = new Random();
	protected List<Integer> randomNumber;
	
	public Randoms(int min, int max) {
		
		List<Integer> randomNumberMethod = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			int r = random.nextInt(max - min) + (min +1);
			randomNumberMethod.add(r);
		}
		this.randomNumber = randomNumberMethod;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator() {
			int next = 0;
			
			@Override
			public boolean hasNext() {
				return next < randomNumber.size();
			}
			
			@Override
			public Integer next() {
				return randomNumber.get(next++);
			}
		};
	}
}
