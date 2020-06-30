package com.indeed.util.serialization;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author jplaisance
 */
public final class FloatSerializer implements Serializer<Float> {

    private static final Logger log = LogManager.getLogger(FloatSerializer.class);

    @Override
    public void write(final Float val, final DataOutput out) throws IOException {
        out.writeFloat(val);
    }

    @Override
    public Float read(final DataInput in) throws IOException {
        return in.readFloat();
    }
}
