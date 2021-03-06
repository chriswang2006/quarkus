/*
 * Copyright 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.quarkus.arc.deployment;

import java.util.List;
import java.util.Set;

import org.jboss.jandex.DotName;
import org.jboss.jandex.IndexView;

import io.quarkus.builder.item.SimpleBuildItem;

public final class BeanArchiveIndexBuildItem extends SimpleBuildItem {

    private final IndexView index;
    private final Set<DotName> generatedClassNames;
    private final List<String> additionalBeans;

    public BeanArchiveIndexBuildItem(IndexView index, Set<DotName> generatedClassNames,
            List<String> additionalBeans) {
        this.index = index;
        this.generatedClassNames = generatedClassNames;
        this.additionalBeans = additionalBeans;
    }

    public IndexView getIndex() {
        return index;
    }

    public Set<DotName> getGeneratedClassNames() {
        return generatedClassNames;
    }

    public List<String> getAdditionalBeans() {
        return additionalBeans;
    }

}
