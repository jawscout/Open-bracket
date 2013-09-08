package open.bracket.framework;

import java.lang.reflect.Method;

import open.bracket.framework.test.StandardPlayer;

public class Tester {

	private static boolean runNoArgsTest(@SuppressWarnings("rawtypes") Class c) throws Exception {
		Method[] m = c.getDeclaredMethods();
		@SuppressWarnings("unused")
		Object obj = c.newInstance();
		for (Method method : m) {
			if (method.getName().startsWith("Test")) {
				method.setAccessible(true);
//				return (boolean) method.invoke(obj, null);
			}

		}
		return false;
	}

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Class c = StandardPlayer.class;
		try {
			System.out.println(runNoArgsTest(c));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
