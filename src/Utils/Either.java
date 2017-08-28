package Utils;

import java.util.Optional;

/**
 * Created by Robert-PC on 8/28/2017.
 */
public class Either<A, B> {
    private Optional<A> Left;

    private Optional<B> Right;

    public Either(A left, B right) {
        Left = Optional.ofNullable(left);
        Right = Optional.ofNullable(right);
    }

    public Either() {
    }

    public void setLeft(Optional<A> left) {
        Left = left;
        Right = Optional.empty();
    }

    public void setRight(Optional<B> right) {
        Right = right;
        Left = Optional.empty();
    }

    public Optional<?> get() {
        if (Left.isPresent())
            return Left;
        else
            return Right;
    }
}
