package lotto.view;

import java.util.*;
import lotto.model.Lotto;

public class OutputHandler {
    public void printOK(int k) {
        System.out.println(k + "개를 구매했습니다.");
    }

    public void printLotto(Lotto lotto) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int l: lotto.getNumbers()) {
            sb.append(l);
            if (lotto.getNumbers().getLast() != l) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    public void printLottoS(List<Lotto> lottos) {
        for (Lotto lotto: lottos) {
            printLotto(lotto);
        }
    }
}