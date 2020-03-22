package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Kotelo implements Laiteosa {
  protected List<Laiteosa> laiteosat;

  public Kotelo() {
    laiteosat = new ArrayList<>();
  }

  @Override
  public void addLaiteosa(Laiteosa laiteosa) {
    laiteosat.add(laiteosa);
  }
}