package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // TODO validity checking for headcoach(check this later)
    public Team(final String name, final String headcoach, final int funding) {
    if (headcoach == null) {
      throw new IllegalArgumentException("headcoach is null");
    }
    // TODO validity checking for funding(check this later)
    public Team(final String name, final String headcoach, final int funding) {
    if (funding == null) {
      throw new IllegalArgumentException("funding is null");
    }
    
    this.name = name;
    // TODO complete this constructor(Done)
    this.headcoach = headcoach;
    this.funding = funding;
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // TODO complete this method(chech if it is correct)
    return this.Headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // TODO complete this method
   // return -1(in case the at the bottom doesn't work go back to this)
   return empty optional
  }
}
