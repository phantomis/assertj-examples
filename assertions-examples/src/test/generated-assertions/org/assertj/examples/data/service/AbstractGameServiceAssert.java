package org.assertj.examples.data.service;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link GameService} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractGameServiceAssert<S extends AbstractGameServiceAssert<S, A>, A extends GameService> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractGameServiceAssert}</code> to make assertions on actual GameService.
   * @param actual the GameService we want to make assertions on.
   */
  protected AbstractGameServiceAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual GameService's teamManager is equal to the given one.
   * @param teamManager the given teamManager to compare the actual GameService's teamManager to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GameService's teamManager is not equal to the given one.
   */
  public S hasTeamManager(TeamManager teamManager) {
    // check that actual GameService we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting teamManager of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    TeamManager actualTeamManager = org.assertj.core.util.introspection.FieldSupport.EXTRACTION.fieldValue("teamManager", TeamManager.class, actual);
    if (!Objects.areEqual(actualTeamManager, teamManager)) {
      failWithMessage(assertjErrorMessage, actual, teamManager, actualTeamManager);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
