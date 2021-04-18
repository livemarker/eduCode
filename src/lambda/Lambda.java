package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public void start() {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);
        switcher.addElectricityListener(
                //анонимный класс, реализующий интерфейс без создания класса
                //  new ElectricityConsumer() {
                // public void electricityON()
                () -> System.out.println("Fire")
                // }
        );

        switcher.switchOn();
    }
}

class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Switcher ON");
//        if (listeners != null) {
//            listeners.electricityON();
//        }
        for (ElectricityConsumer c : listeners) {
            c.electricityON();
        }
    }
}

class Lamp implements ElectricityConsumer {
    public void lightOn() {
        System.out.println("Light ON");
    }

    @Override
    public void electricityON() {
        lightOn();
    }
}

class Radio implements ElectricityConsumer {

    public void radioOn() {
        System.out.println("Radio ON");
    }

    @Override
    public void electricityON() {
        radioOn();
    }
}

@FunctionalInterface
interface ElectricityConsumer {
    void electricityON();
}