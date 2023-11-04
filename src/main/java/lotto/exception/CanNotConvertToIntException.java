package lotto.exception;

public class CanNotConvertToIntException extends IllegalArgumentException {

    public CanNotConvertToIntException(final String text) {
        super(text + "를(을) 정수로 변환할 수 없습니다.");
    }
}
