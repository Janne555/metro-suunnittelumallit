package command;

public class DownCommand implements Command {
  private WhiteScreen screen;

  public DownCommand(WhiteScreen screen) {
    this.screen = screen;
  }

  @Override
  public void execute() {
    this.screen.down();
  }
  
}