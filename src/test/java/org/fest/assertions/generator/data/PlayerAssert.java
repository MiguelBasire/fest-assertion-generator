package org.fest.assertions.generator.data;

import static java.lang.String.format;

import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.generator.data.Name;
import org.fest.assertions.generator.data.Player;


/**
 * {@link Player} specific assertions - Generated by AssertionGenerator.
 */
public class PlayerAssert extends AbstractAssert<PlayerAssert, Player> {

  /**
   * Creates a new </code>{@link PlayerAssert}</code> to make assertions on actual Player.
   * @param actual the Player we want to make assertions on.
   */
  public PlayerAssert(Player actual) {
    super(actual, PlayerAssert.class);
  }

  /**
   * An entry point for PlayerAssert to follow Fest standard <code>assertThat()</code> statements.<br>
   * With a static import, one's can write directly : <code>assertThat(myPlayer)</code> and get specific assertion with code completion.
   * @param actual the Player we want to make assertions on.
   * @return a new </code>{@link PlayerAssert}</code>
   */
  public static PlayerAssert assertThat(Player actual) {
    return new PlayerAssert(actual);
  }

  /**
   * Verifies that the actual Player's name is equal to the given one.
   * @param name the given name to compare the actual Player's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Player's name is not equal to the given one.
   */
  public PlayerAssert hasName(Name name) {
    // check that actual Player we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Player's name to be <%s> but was <%s>", name, actual.getName());
    
    // check
    if (!actual.getName().equals(name)) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Player's pointsperGame is equal to the given one.
   * @param pointsperGame the given pointsperGame to compare the actual Player's pointsperGame to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Player's pointsperGame is not equal to the given one.
   */
  public PlayerAssert hasPointsPerGame(int pointsperGame) {
    // check that actual Player we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Player's pointsperGame to be <%s> but was <%s>", pointsperGame, actual.getPointsPerGame());
    
    // check
    if (actual.getPointsPerGame() != pointsperGame) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Player's assistsPerGame is equal to the given one.
   * @param assistsPerGame the given assistsPerGame to compare the actual Player's assistsPerGame to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Player's assistsPerGame is not equal to the given one.
   */
  public PlayerAssert hasAssistsPerGame(int assistsPerGame) {
    // check that actual Player we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Player's assistsPerGame to be <%s> but was <%s>", assistsPerGame, actual.getAssistsPerGame());
    
    // check
    if (actual.getAssistsPerGame() != assistsPerGame) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Player's reboundsPerGame is equal to the given one.
   * @param reboundsPerGame the given reboundsPerGame to compare the actual Player's reboundsPerGame to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Player's reboundsPerGame is not equal to the given one.
   */
  public PlayerAssert hasReboundsPerGame(int reboundsPerGame) {
    // check that actual Player we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Player's reboundsPerGame to be <%s> but was <%s>", reboundsPerGame, actual.getReboundsPerGame());
    
    // check
    if (actual.getReboundsPerGame() != reboundsPerGame) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Player's team is equal to the given one.
   * @param team the given team to compare the actual Player's team to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Player's team is not equal to the given one.
   */
  public PlayerAssert hasTeam(String team) {
    // check that actual Player we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("Expected Player's team to be <%s> but was <%s>", team, actual.getTeam());
    
    // check
    if (!actual.getTeam().equals(team)) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

}