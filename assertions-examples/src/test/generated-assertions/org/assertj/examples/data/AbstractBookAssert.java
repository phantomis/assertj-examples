package org.assertj.examples.data;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Book} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractBookAssert<S extends AbstractBookAssert<S, A>, A extends Book> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractBookAssert}</code> to make assertions on actual Book.
   * @param actual the Book we want to make assertions on.
   */
  protected AbstractBookAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Book's numberOfPages is equal to the given one.
   * @param numberOfPages the given numberOfPages to compare the actual Book's numberOfPages to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's numberOfPages is not equal to the given one.
   */
  public S hasNumberOfPages(int numberOfPages) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting numberOfPages of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualNumberOfPages = actual.getNumberOfPages();
    if (actualNumberOfPages != numberOfPages) {
      failWithMessage(assertjErrorMessage, actual, numberOfPages, actualNumberOfPages);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's pryce is equal to the given one.
   * @param pryce the given pryce to compare the actual Book's pryce to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's pryce is not equal to the given one.
   */
  public S hasPryce(double pryce) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pryce of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check value for pryce
    double actualPryce = actual.getPryce();
    if (actualPryce != pryce) {
      failWithMessage(assertjErrorMessage, actual, pryce, actualPryce);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's pryce is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param pryce the value to compare the actual Book's pryce to.
   * @param assertjOffset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's pryce is not close enough to the given value.
   */
  public S hasPryceCloseTo(double pryce, double assertjOffset) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    double actualPryce = actual.getPryce();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting pryce:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualPryce, pryce, assertjOffset, Math.abs(pryce - actualPryce));

    // check
    Assertions.assertThat(actualPryce).overridingErrorMessage(assertjErrorMessage).isCloseTo(pryce, Assertions.within(assertjOffset));

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's title is equal to the given one.
   * @param title the given title to compare the actual Book's title to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's title is not equal to the given one.
   */
  public S hasTitle(Book.Title title) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Book.Title actualTitle = actual.getTitle();
    if (!Objects.areEqual(actualTitle, title)) {
      failWithMessage(assertjErrorMessage, actual, title, actualTitle);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
