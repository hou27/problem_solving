import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book implements Comparable<Book> {
    int pos;

    public Book(int pos) {
        this.pos = pos;
    }

    @Override
    public int compareTo(final Book o) {
        if (o.pos == pos) {
            return 0;
        }
        return pos - o.pos;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 책의 개수
        int M = sc.nextInt(); // 세준이가 한번에 들 수 있는 책의 개수
        List<Book> booksOnRight = new ArrayList<>();
        List<Book> booksOnLeft = new ArrayList<>();
        int maxValue = 0;

        for (int i = 0; i < N; i++) {
            int pos = sc.nextInt();
            // 음수면 왼쪽, 양수면 오른쪽
            if (pos > 0) {
                booksOnRight.add(new Book(pos));
            } else {
                pos = -pos;
                booksOnLeft.add(new Book(pos));
            }
            // 최대값 갱신
            if (maxValue < pos)
                maxValue = pos;
        }

        // 내림차순 sort
        booksOnRight.sort((o1, o2) -> o2.pos - o1.pos);
        booksOnLeft.sort((o1, o2) -> o2.pos - o1.pos);

        // 들 수 있는 최대 책의 개수만큼 들고 이동
        int cnt = 0;
        int idx = 0;
        while (idx < booksOnRight.size()) {
            cnt += booksOnRight.get(idx).pos;
            idx += M;
        }
        idx = 0;
        while (idx < booksOnLeft.size()) {
            cnt += booksOnLeft.get(idx).pos;
            idx += M;
        }

        System.out.println(cnt * 2 - maxValue); // 최대값은 한번만 빼주면 됨(마지막에 갈 예정이므로)

        sc.close();
    }
}