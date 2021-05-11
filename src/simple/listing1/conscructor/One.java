package simple.listing1.conscructor;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class One {
    One() {
        System.out.println(1);
        new Two();
        System.out.println(1);
    }

    public static void main(String[] args) {
        new One();
    }
}

class Two {
    Two() {
        new Three();
        System.out.println(2);
    }
}

class Three {
    Three() {
        new Four();
        System.out.println(3);
    }
}

class Four {
    Four() {
        System.out.println(4);
    }
}
