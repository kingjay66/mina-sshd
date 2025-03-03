/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sshd.common.future;

/**
 * A {@code CancelOption} defines whether a {@link Cancellable} future that is waited upon shall be cancelled if waiting
 * times out or is interrupted.
 *
 * @see VerifiableFuture
 * @see WaitableFuture
 */
public enum CancelOption {

    /**
     * Indicates that when waiting on a future times out, the future shall be canceled.
     */
    CANCEL_ON_TIMEOUT,

    /**
     * Indicates that when waiting on a future is interrupted, the future shall be canceled.
     */
    CANCEL_ON_INTERRUPT,

    /**
     * Indicates that even if waiting on a future times out or is interrupted, it shall not be canceled.
     * <p>
     * {@link #CANCEL_ON_TIMEOUT} and {@link #CANCEL_ON_INTERRUPT} take predence over this flag. The main purpose of
     * this flag is to be able to call {@code verify(timeout, NO_CANCELLATION)} to suppress cancelling a future on
     * time-outs or interrupts altogether. By default, {@code verify(timeout)} will cancel the future on both time-outs
     * and interrupts.
     * </p>
     */
    NO_CANCELLATION
}
