package command;

public class UpCommand implements Command {
  private WhiteScreen screen;

  public UpCommand(WhiteScreen screen) {
    this.screen = screen;
  }

  @Override
  public void execute() {
    this.screen.up();
  }
  
}