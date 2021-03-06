package org.zalando.fauxpas;

public final class FauxPas {

    FauxPas() {
        // package private so we can trick code coverage
    }

    public static <X extends Throwable> ThrowingRunnable<X> throwingRunnable(
            final ThrowingRunnable<X> runnable) {
        return runnable;
    }

    public static <T, X extends Throwable> ThrowingSupplier<T, X> throwingSupplier(
            final ThrowingSupplier<T, X> supplier) {
        return supplier;
    }

    public static <T, X extends Throwable> ThrowingConsumer<T, X> throwingConsumer(
            final ThrowingConsumer<T, X> consumer) {
        return consumer;
    }

    public static <T, R, X extends Throwable> ThrowingFunction<T, R, X> throwingFunction(
            final ThrowingFunction<T, R, X> function) {
        return function;
    }

    public static <T, X extends Throwable> ThrowingUnaryOperator<T, X> throwingUnaryOperator(
            final ThrowingUnaryOperator<T, X> operator) {
        return operator;
    }

    public static <T, X extends Throwable> ThrowingPredicate<T, X> throwingPredicate(
            final ThrowingPredicate<T, X> predicate) {
        return predicate;
    }

    public static <T, R, X extends Throwable> ThrowingBiConsumer<T, R, X> throwingBiConsumer(
            final ThrowingBiConsumer<T, R, X> consumer) {
        return consumer;
    }

    public static <T, U, R, X extends Throwable> ThrowingBiFunction<T, U, R, X> throwingBiFunction(
            final ThrowingBiFunction<T, U, R, X> function) {
        return function;
    }

    public static <T, X extends Throwable> ThrowingBinaryOperator<T, X> throwingBinaryOperator(
            final ThrowingBinaryOperator<T, X> operator) {
        return operator;
    }

    public static <T, U, X extends Throwable> ThrowingBiPredicate<T, U, X> throwingBiPredicate(
            final ThrowingBiPredicate<T, U, X> predicate) {
        return predicate;
    }

}
