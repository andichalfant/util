package com.indeed.util.serialization;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author jplaisance
 */
public final class LongStringifier implements Stringifier<Long> {

    private static final Logger log = LogManager.getLogger(LongStringifier.class);

    @Override
    public String toString(final Long l) {
        return String.valueOf(l);
    }

    @Override
    public Long fromString(final String str) {
        return Long.valueOf(str);
    }
}
