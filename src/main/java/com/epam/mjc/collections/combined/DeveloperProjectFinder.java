package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String>projectsSelected = new ArrayList<>();

        for(Map.Entry<String, Set<String>> entry: projects.entrySet()){
            String project = entry.getKey();
            Set<String> developers = entry.getValue();

            if(developers.contains(developer)){
                projectsSelected.add(project);
            }
        }

        projectsSelected.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int lengthDiff = o2.length() - o1.length();
                if (lengthDiff != 0) {
                    return lengthDiff;
                } else {
                    return o2.compareTo(o1);
                }
            }
        });

        return projectsSelected;
    }
}
