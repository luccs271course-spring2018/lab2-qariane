package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  
  // TODO testConstructorValidHeadcoach(check)
  @Test
  public void testConstructorValidHeadcoach() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  
  // TODO testConstructorValidFunding(check)
  @Test
  public void testConstructorValidFunding() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  
  // TODO testGetHeadcoach
    @Test
  public void testGetHeadcoach() {
    final String Headcoach = "Klinsmann";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(Headcoach, t.getHeadcoach());
  }
    
  
  // TODO testGetFunding(not sure  check letter)
   @Test
  public void testGetFunding() {
   final int Funding = "Klinsmann";
   final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(Funding, t.getFunding());
  }
}