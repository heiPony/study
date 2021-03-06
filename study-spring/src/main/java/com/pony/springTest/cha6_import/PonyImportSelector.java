package com.pony.springTest.cha6_import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class PonyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.pony.common.pojo.spring.Tiger","com.pony.common.pojo.spring.Fish"};
    }
}
