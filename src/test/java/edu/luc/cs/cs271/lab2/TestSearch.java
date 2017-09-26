package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture
  
  List<Team> makeListFixture(final int size) {
    final List<Team> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      list.add(i, new Team("Team " + s, "Coach " + s, i * 100 + 50));
    }
    return list;
  }
  

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test
    public void testFindPositionList0() {
        final List<Team> list = makeListFixture(0);
        assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10s() {
        final List<Team> list = makeListFixture(10);
        assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10f() {
        final List<Team> list = makeListFixture(10);
        assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
    }

  
  // TODO: testFindMinFundingArray for several sizes and scenarios
  @Test
    public void testFindMinFundingArray0() {
        final Team[] arr = makeArrayFixture(0);
        assertEquals(Search.findTeamMinFunding(arr, 800), Optional.empty());

    }

    @Test
    public void testFindMinFundingArray10s() {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Search.findTeamMinFunding(arr, 600),Optional.of(6));
    }

    @Test
    public void testFindMinFundingArray10f() {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Search.findTeamMinFunding(arr, 1000), Optional.empty());

       }

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios

    @Test
    public void testFindMinFundingArrayFast0() {
        final Team[] arr = makeArrayFixture(0);
        assertEquals(Search.findTeamMinFundingFast(arr, 1400), Optional.empty());

    }

    @Test
    public void testFindMinFundingArrayFast10s() {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Search.findTeamMinFundingFast(arr, 700),Optional.of(7));
    }

    @Test
    public void testFindMinFundingArrayFast10f() {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Search.findTeamMinFundingFast(arr, 1600), Optional.empty());
      
     }
   }
   
   
  
