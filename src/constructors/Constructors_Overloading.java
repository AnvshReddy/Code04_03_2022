package constructors;

public class Constructors_Overloading {
	int i;
	int j;
	int k;

	Constructors_Overloading(int i1) {
		i = i1;
	}

	Constructors_Overloading(int i1, int j1) {
		i = i1;
		j = j1;

	}

	Constructors_Overloading(int i1, int j1, int k1) {
		i = i1;
		j = j1;
		k = k1;
	}

	void add() {
		System.out.println("Addition:" + (i + k + j));

	}
}
