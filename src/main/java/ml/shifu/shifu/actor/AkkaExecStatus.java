/**
 * Copyright [2012-2014] eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.shifu.actor;

import ml.shifu.shifu.container.meta.ValidateResult;

import java.util.List;


/**
 * AkkaExecStatus class - container class for execution status of AKKA system
 */
public class AkkaExecStatus extends ValidateResult {

    private Exception exception;

    public AkkaExecStatus(boolean status) {
        super(status);
    }

    public AkkaExecStatus(boolean status, List<String> causes) {
        super(status, causes);
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

}
