package question2;

import java.util.List;
import java.util.ArrayList;
class Originator {
    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..
 
    public void set(String state) {
        this.state = state;
    }
 
    public Memento saveToMemento() {
        return new Memento(this.state);
    }
 
    public String restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        return this.state;
    }
 
    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }
 
        // accessible by outer class only
        private String getSavedState() {
            return state;
        }
    }
}
 