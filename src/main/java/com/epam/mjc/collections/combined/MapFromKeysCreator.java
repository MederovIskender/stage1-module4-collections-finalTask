package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> resultMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
        String key = entry.getKey();
        int keyLength = key.length();

        // If the key length is already present in the resultMap, add the key to the existing Set
        if (resultMap.containsKey(keyLength)) {
            resultMap.get(keyLength).add(key);
        } else {
            // If the key length is not present, create a new Set and add the key
            Set<String> keySet = new HashSet<>();
            keySet.add(key);
            resultMap.put(keyLength, keySet);
        }
    }

        return resultMap;
    }
}
