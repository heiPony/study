package com.pony.springTest.cha6_import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class PonyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.pony.springTest.cha6_import.pojo.Tiger","com.pony.springTest.cha6_import.pojo.Fish"};
    }
}