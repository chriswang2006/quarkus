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

package io.quarkus.it.jpa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Used to test reflection references for JPA
 *
 * @author Emmanuel Bernard emmanuel@hibernate.org
 */
@Entity
public class Customer extends Human {
    @Id
    // no getter explicitly to test field only reflective access
    private Long id;

    private Address address;
    private WorkAddress workAddress;

    // Address is referenced but not marked as @Embeddable
    @Embedded
    public Address getAddress() {
        return address;
    }

    public WorkAddress getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(WorkAddress workAddress) {
        this.workAddress = workAddress;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
