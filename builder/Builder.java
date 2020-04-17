package builder;

public interface Builder<T> {
  public T getPurilainen();
  public Builder<T> lisääSämpylä();
  public Builder<T> lisääKetsuppi();
  public Builder<T> lisääSalaatti();
  public Builder<T> lisääPihvi();
  public Builder<T> lisääMajoneesi();
  public Builder<T> lisääSuolakurkku();
  public Builder<T> lisääTomaatti();
}