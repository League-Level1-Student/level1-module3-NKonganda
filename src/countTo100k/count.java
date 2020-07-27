package countTo100k;

public class count {
public void run() {
	int Total = 0;
	for (int i = 0; i < 100000; i++) {
		Total = Total + i;
		System.out.println(Total);
	}
}
}
