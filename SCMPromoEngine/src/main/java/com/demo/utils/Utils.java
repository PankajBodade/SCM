package com.demo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Utils {

    InputStream inputStream;

    public Map<String,String>  getPropValues(String propFileName) throws IOException {
        Properties prop = new Properties();
        Map<String,String> map = new HashMap
                <String,String>();
        ClassLoader classLoader = getClass().getClassLoader();
        try
        {
            inputStream = classLoader.getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        }
        catch (IOException ioException) {
            throw new IOException(ioException.getMessage());
        } finally {
            inputStream.close();
        }

        for (final Map.Entry<Object, Object> entry : prop.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map;
    }
}

