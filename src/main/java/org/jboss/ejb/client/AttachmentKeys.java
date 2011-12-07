/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.ejb.client;

/**
 * Commonly-used attachment keys.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public final class AttachmentKeys {
    private AttachmentKeys() {}

    /**
     * The attachment key for transaction IDs.  This key is normally associated with an invocation.
     */
    public static final AttachmentKey<TransactionID> TRANSACTION_ID_KEY = new AttachmentKey<TransactionID>();
    /**
     * The preferred node for invocations from this proxy.  Note that this node name is only a
     * recommendation and is not required to be used, and if the node is not available then the invocation
     * may proceed to another node.  This key is normally associated with a proxy, and copied to an invocation.
     */
    public static final AttachmentKey<String> PREFERRED_NODE = new AttachmentKey<String>();
    /**
     * The required node for an invocation.  This node name is the only one which may handle the invocation;
     * if the node is unavailable, the invocation must fail.  This key is normally associated with a transaction,
     * and copied to the invocation.
     */
    public static final AttachmentKey<String> REQUIRED_NODE = new AttachmentKey<String>();
}