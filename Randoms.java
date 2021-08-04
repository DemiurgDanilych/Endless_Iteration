import java.util.*;


public class Randoms implements Iterable<Integer> {
	protected Random random = new Random();
	protected List<Integer> randomNumber = new ArrayList<>();
	
	public Randoms(int min, int max) {
		
		for (int i = 0; ; i++) {
			int r = random.nextInt(max - min) + (min +1);
			randomNumber.add(r);
			if (randomNumber.get(i) == 100){
				break;
			}
		}
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
