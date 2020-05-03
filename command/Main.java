package command;

public class Main {
  public static void main(String[] args) {
    WhiteScreen screen = new WhiteScreen();
    Command upCommand = new UpCommand(screen);
    Command downCommand = new DownCommand(screen);
    Button buttonUp = new Button(upCommand);
    Button buttonDown = new Button(downCommand);

    buttonUp.push();
    buttonDown.push();
  }
}