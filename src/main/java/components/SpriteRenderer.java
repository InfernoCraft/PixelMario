package components;

import jade.Component;

public class SpriteRenderer extends Component {

    private boolean firstTime = true;

    @Override
    public void start() {
        System.out.println("i am starting");
    }

    @Override
    public void update(float dt) {
        if (firstTime) {
            System.out.println("I am updating");
            firstTime = false;
        }

    }
}
