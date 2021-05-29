package Proxy.program;

import Proxy.OperatorBilete;
import Proxy.ProxyAchizitionare;

public class Main {

    public static void main(String[] args) {
        OperatorBilete op = new OperatorBilete("Unirea Slobozia vs Comuna Recea");
        op.cumparaBilet(13);
        ProxyAchizitionare proxy = new ProxyAchizitionare(op,14);
        proxy.cumparaBilet(20);
        proxy.cumparaBilet(13);

    }
}
