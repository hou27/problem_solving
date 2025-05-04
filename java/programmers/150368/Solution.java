import java.util.*;

class Solution {
    static class Case {
        int discountRate;
        int price;

        Case(int discountRate, int price) {
            this.discountRate = discountRate;
            this.price = (int) (price * ((100 - discountRate) / 100.0));
        }
    }

    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        answer = dfs(users, emoticons);

        return answer;
    }

    static int[] dfs(int[][] users, int[] emoticons) {
        // 모든 경우의 수 탐색
        Stack<List<Case>> stack = new Stack<>();
        int[] discountRates = { 10, 20, 30, 40 };
        List<Case> cases = new ArrayList<>();
        stack.push(cases);
        int optimizedRegisterCnt = 0;
        int optimizedSalesAmount = 0;

        while (!stack.isEmpty()) {
            List<Case> curr = stack.pop();

            if (curr.size() < emoticons.length) {
                int currEmojiIdx = curr.size();
                for (int i = 0; i < 4; i++) {
                    List<Case> next = new ArrayList<>(curr);
                    Case nextCase = new Case(discountRates[i], emoticons[currEmojiIdx]);
                    next.add(nextCase);
                    stack.push(next);
                }
                continue;
            }

            // 이모티콘 플러스 서비스 가입자 수 & 판매액 계산 및 최적 case 업데이트
            int registerCnt = 0;
            int salesAmount = 0;
            for (int[] user : users) {
                int userSalesAmount = 0;
                for (Case emojiInfo : curr) {
                    if (user[0] <= emojiInfo.discountRate) {
                        userSalesAmount += emojiInfo.price;
                    }
                }
                if (userSalesAmount >= user[1]) {
                    userSalesAmount = 0;
                    registerCnt++;
                }
                salesAmount += userSalesAmount;
            }
            // System.out.println("result: [registerCnt:" + registerCnt + ", salesAmount: "
            // + salesAmount + "]");
            if (optimizedRegisterCnt <= registerCnt) {
                if (optimizedRegisterCnt == registerCnt && optimizedSalesAmount > salesAmount) {
                    optimizedRegisterCnt = registerCnt;
                } else {
                    optimizedRegisterCnt = registerCnt;
                    optimizedSalesAmount = salesAmount;
                }
            }
        }

        return new int[] { optimizedRegisterCnt, optimizedSalesAmount };
    }
}
