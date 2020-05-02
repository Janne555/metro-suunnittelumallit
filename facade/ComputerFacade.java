package facade;

public class ComputerFacade {
  private final CPU processor;
  private final Memory ram;
  private final HardDrive hd;
  private long BOOT_ADDRESS = 3;
  private long BOOT_SECTOR = 4;
  private int SECTOR_SIZE = 5;

  public ComputerFacade() {
    this.processor = new CPU();
    this.ram = new Memory();
    this.hd = new HardDrive();
  }

  public void start() {
    processor.freeze();
    ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
    processor.jump(BOOT_ADDRESS);
    processor.execute();
  }
}