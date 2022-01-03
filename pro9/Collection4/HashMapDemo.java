package Collection213;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<String, Book>();
		books.put("1", new Book("1", "�����뺣", 36, "���������"));
		books.put("2", new Book("2", "����", 45, "���������"));
		books.put("4", new Book("4", "����������", 30, "���������"));
		books.put("3", new Book("3", "��¥��", 89, "���������"));
		Iterator iter = books.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(((Book) entry.getValue()).toString());
		}
	}
}
