/*https://github.com/nrattu/Paletti23*/
package Neeraj;

public class Testklasse {
	public static void main(String[] args) {
		test1();
		test2();
	}

	public static void test1() {
		Schueler s = new Schueler();
		s.setfName("Rattu");
		s.setvName("Neeraj");
		s.setGeschlecht("m");
		s.setgDatum("11.12.1997");

		Schueler s1 = new Schueler();
		s1.setfName("Rattu1");
		s1.setvName("Neeraj1");
		s1.setGeschlecht("m");
		s1.setgDatum("11.12.1998");

		ObjektSpeicher<Schueler> e = new ObjektSpeicher<Schueler>(2);
		e.add(s, 0);
		e.add(s1, 1);
		System.out.println(e.toString());
	}

	public static void test2() {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(65);
		Integer i3 = new Integer(95);

		ObjektSpeicher<Integer> e = new ObjektSpeicher<>(3);
		e.add(i1, 0);
		e.add(i2, 1);
		e.add(i3, 2);
		for (int i = 0; i < e.size(); i++) {
			Integer test = e.get(i);
			if (test != null)
				System.out.println(test);

		}

	}
}
