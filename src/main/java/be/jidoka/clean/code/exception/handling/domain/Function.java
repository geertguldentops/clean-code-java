package be.jidoka.clean.code.exception.handling.domain;

import be.jidoka.clean.code.exception.handling.Nullable;

// Enums can also implement the Null Object/Special Case Pattern.
public enum Function implements Nullable {
    CEO(false),
    CFO(false),
    CTO(false),
    CONSULTANT(false),
    NO_FUNCTION(true);

    private final boolean isNull;

    Function(boolean isNull) {
        this.isNull = isNull;
    }

    @Override
    public boolean isNull() {
        return isNull;
    }

}
