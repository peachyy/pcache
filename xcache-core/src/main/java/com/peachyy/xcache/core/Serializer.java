package com.peachyy.xcache.core;

import org.springframework.util.ClassUtils;

import java.io.IOException;

/**
 * @author Xs.Tao
 */
public interface Serializer<T> {

    String name();

    byte[] serialize(Object obj) throws IOException;


    <T> T deserialize(byte[] bytes) throws IOException ;

}
