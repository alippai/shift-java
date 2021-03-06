// Generated by shift-java-gen/ast.js

/*
 * Copyright 2016 Shape Security, Inc.
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

package com.shapesecurity.shift.es2016.ast;

import com.shapesecurity.shift.es2016.ast.operators.Precedence;
import org.jetbrains.annotations.NotNull;
import com.shapesecurity.functional.data.HashCodeBuilder;

public class ConditionalExpression implements Expression {
    @NotNull
    public final Expression test;

    @NotNull
    public final Expression consequent;

    @NotNull
    public final Expression alternate;


    public ConditionalExpression (@NotNull Expression test, @NotNull Expression consequent, @NotNull Expression alternate) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof ConditionalExpression && this.test.equals(((ConditionalExpression) object).test) && this.consequent.equals(((ConditionalExpression) object).consequent) && this.alternate.equals(((ConditionalExpression) object).alternate);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ConditionalExpression");
        code = HashCodeBuilder.put(code, this.test);
        code = HashCodeBuilder.put(code, this.consequent);
        code = HashCodeBuilder.put(code, this.alternate);
        return code;
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.CONDITIONAL;
    }

}
