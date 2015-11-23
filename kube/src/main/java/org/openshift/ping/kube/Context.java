/**
 *  Copyright 2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package org.openshift.ping.kube;

/**
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
public final class Context {
    private final Container container;
    private final String pingPortName;
    private final int defaultPingPort;

    public Context(Container container, String pingPortName, int defaultPingPort) {
        this.container = container;
        this.pingPortName = pingPortName;
        this.defaultPingPort = defaultPingPort;
    }

    public Container getContainer() {
        return container;
    }

    public String getPingPortName() {
        return pingPortName;
    }

    public int getDefaultPingPort() {
        return defaultPingPort;
    }

    public String toString() {
        return String.format("%s[container=%s, pingPortName=%s, defaultPingPort=%s]",
                getClass().getSimpleName(), container, pingPortName, defaultPingPort);
    }
}
