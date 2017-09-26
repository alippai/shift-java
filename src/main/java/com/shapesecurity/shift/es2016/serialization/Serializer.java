// Generated by shift-spec-java/reducer.js

/**
 * Copyright 2016 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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

package com.shapesecurity.shift.es2016.serialization;

import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.functional.data.Maybe;
import com.shapesecurity.functional.data.NonEmptyImmutableList;
import com.shapesecurity.shift.es2016.ast.BindingPropertyIdentifier;
import com.shapesecurity.shift.es2016.ast.BindingWithDefault;
import com.shapesecurity.shift.es2016.ast.ExpressionStatement;
import com.shapesecurity.shift.es2016.ast.ForStatement;
import com.shapesecurity.shift.es2016.ast.WhileStatement;
import com.shapesecurity.shift.es2016.ast.operators.BinaryOperator;
import com.shapesecurity.shift.es2016.ast.operators.CompoundAssignmentOperator;
import com.shapesecurity.shift.es2016.ast.operators.UnaryOperator;
import com.shapesecurity.shift.es2016.ast.operators.UpdateOperator;
import com.shapesecurity.shift.es2016.ast.ArrayAssignmentTarget;
import com.shapesecurity.shift.es2016.ast.ArrayBinding;
import com.shapesecurity.shift.es2016.ast.ArrayExpression;
import com.shapesecurity.shift.es2016.ast.ArrowExpression;
import com.shapesecurity.shift.es2016.ast.AssignmentExpression;
import com.shapesecurity.shift.es2016.ast.AssignmentTargetIdentifier;
import com.shapesecurity.shift.es2016.ast.AssignmentTargetPropertyIdentifier;
import com.shapesecurity.shift.es2016.ast.AssignmentTargetPropertyProperty;
import com.shapesecurity.shift.es2016.ast.AssignmentTargetWithDefault;
import com.shapesecurity.shift.es2016.ast.AwaitExpression;
import com.shapesecurity.shift.es2016.ast.BinaryExpression;
import com.shapesecurity.shift.es2016.ast.BindingIdentifier;
import com.shapesecurity.shift.es2016.ast.BindingPropertyProperty;
import com.shapesecurity.shift.es2016.ast.Block;
import com.shapesecurity.shift.es2016.ast.BlockStatement;
import com.shapesecurity.shift.es2016.ast.BreakStatement;
import com.shapesecurity.shift.es2016.ast.CallExpression;
import com.shapesecurity.shift.es2016.ast.CatchClause;
import com.shapesecurity.shift.es2016.ast.ClassDeclaration;
import com.shapesecurity.shift.es2016.ast.ClassElement;
import com.shapesecurity.shift.es2016.ast.ClassExpression;
import com.shapesecurity.shift.es2016.ast.CompoundAssignmentExpression;
import com.shapesecurity.shift.es2016.ast.ComputedMemberAssignmentTarget;
import com.shapesecurity.shift.es2016.ast.ComputedMemberExpression;
import com.shapesecurity.shift.es2016.ast.ComputedPropertyName;
import com.shapesecurity.shift.es2016.ast.ConditionalExpression;
import com.shapesecurity.shift.es2016.ast.ContinueStatement;
import com.shapesecurity.shift.es2016.ast.DataProperty;
import com.shapesecurity.shift.es2016.ast.DebuggerStatement;
import com.shapesecurity.shift.es2016.ast.Directive;
import com.shapesecurity.shift.es2016.ast.DoWhileStatement;
import com.shapesecurity.shift.es2016.ast.EmptyStatement;
import com.shapesecurity.shift.es2016.ast.Export;
import com.shapesecurity.shift.es2016.ast.ExportAllFrom;
import com.shapesecurity.shift.es2016.ast.ExportDefault;
import com.shapesecurity.shift.es2016.ast.ExportFrom;
import com.shapesecurity.shift.es2016.ast.ExportFromSpecifier;
import com.shapesecurity.shift.es2016.ast.ExportLocalSpecifier;
import com.shapesecurity.shift.es2016.ast.ExportLocals;
import com.shapesecurity.shift.es2016.ast.ForInStatement;
import com.shapesecurity.shift.es2016.ast.ForOfStatement;
import com.shapesecurity.shift.es2016.ast.FormalParameters;
import com.shapesecurity.shift.es2016.ast.FunctionBody;
import com.shapesecurity.shift.es2016.ast.FunctionDeclaration;
import com.shapesecurity.shift.es2016.ast.FunctionExpression;
import com.shapesecurity.shift.es2016.ast.Getter;
import com.shapesecurity.shift.es2016.ast.IdentifierExpression;
import com.shapesecurity.shift.es2016.ast.IfStatement;
import com.shapesecurity.shift.es2016.ast.Import;
import com.shapesecurity.shift.es2016.ast.ImportNamespace;
import com.shapesecurity.shift.es2016.ast.ImportSpecifier;
import com.shapesecurity.shift.es2016.ast.LabeledStatement;
import com.shapesecurity.shift.es2016.ast.LiteralBooleanExpression;
import com.shapesecurity.shift.es2016.ast.LiteralInfinityExpression;
import com.shapesecurity.shift.es2016.ast.LiteralNullExpression;
import com.shapesecurity.shift.es2016.ast.LiteralNumericExpression;
import com.shapesecurity.shift.es2016.ast.LiteralRegExpExpression;
import com.shapesecurity.shift.es2016.ast.LiteralStringExpression;
import com.shapesecurity.shift.es2016.ast.Method;
import com.shapesecurity.shift.es2016.ast.Module;
import com.shapesecurity.shift.es2016.ast.NewExpression;
import com.shapesecurity.shift.es2016.ast.NewTargetExpression;
import com.shapesecurity.shift.es2016.ast.ObjectAssignmentTarget;
import com.shapesecurity.shift.es2016.ast.ObjectBinding;
import com.shapesecurity.shift.es2016.ast.ObjectExpression;
import com.shapesecurity.shift.es2016.ast.Program;
import com.shapesecurity.shift.es2016.ast.ReturnStatement;
import com.shapesecurity.shift.es2016.ast.Script;
import com.shapesecurity.shift.es2016.ast.Setter;
import com.shapesecurity.shift.es2016.ast.ShorthandProperty;
import com.shapesecurity.shift.es2016.ast.SpreadElement;
import com.shapesecurity.shift.es2016.ast.StaticMemberAssignmentTarget;
import com.shapesecurity.shift.es2016.ast.StaticMemberExpression;
import com.shapesecurity.shift.es2016.ast.StaticPropertyName;
import com.shapesecurity.shift.es2016.ast.Super;
import com.shapesecurity.shift.es2016.ast.SwitchCase;
import com.shapesecurity.shift.es2016.ast.SwitchDefault;
import com.shapesecurity.shift.es2016.ast.SwitchStatement;
import com.shapesecurity.shift.es2016.ast.SwitchStatementWithDefault;
import com.shapesecurity.shift.es2016.ast.TemplateElement;
import com.shapesecurity.shift.es2016.ast.TemplateExpression;
import com.shapesecurity.shift.es2016.ast.ThisExpression;
import com.shapesecurity.shift.es2016.ast.ThrowStatement;
import com.shapesecurity.shift.es2016.ast.TryCatchStatement;
import com.shapesecurity.shift.es2016.ast.TryFinallyStatement;
import com.shapesecurity.shift.es2016.ast.UnaryExpression;
import com.shapesecurity.shift.es2016.ast.UpdateExpression;
import com.shapesecurity.shift.es2016.ast.VariableDeclaration;
import com.shapesecurity.shift.es2016.ast.VariableDeclarationKind;
import com.shapesecurity.shift.es2016.ast.VariableDeclarationStatement;
import com.shapesecurity.shift.es2016.ast.VariableDeclarator;
import com.shapesecurity.shift.es2016.ast.WithStatement;
import com.shapesecurity.shift.es2016.ast.YieldExpression;
import com.shapesecurity.shift.es2016.ast.YieldGeneratorExpression;
import com.shapesecurity.shift.es2016.reducer.Director;
import com.shapesecurity.shift.es2016.reducer.Reducer;
import com.shapesecurity.shift.es2016.utils.Utils;

import javax.annotation.Nonnull;


public class Serializer implements Reducer<StringBuilder> {

    public static final Serializer INSTANCE = new Serializer();

    protected Serializer() {}

    public static String serialize(@Nonnull Program program) {
        return Director.reduceProgram(INSTANCE, program).toString();
    }

    @Nonnull
    private static JsonObjectBuilder b(@Nonnull String type) {
        return new JsonObjectBuilder().add("type", type);
    }

    @Nonnull
    private static StringBuilder list(@Nonnull ImmutableList<StringBuilder> values) {
        if (values.isEmpty()) {
            return new StringBuilder("[]");
        }
        StringBuilder sb = new StringBuilder("[");
        NonEmptyImmutableList<StringBuilder> nel = (NonEmptyImmutableList<StringBuilder>) values;
        sb.append(nel.head);
        nel.tail().forEach(s -> sb.append(",").append(s));
        sb.append("]");
        return sb;
    }

    @Nonnull
    private static StringBuilder o(@Nonnull Maybe<StringBuilder> el) {
        return el.orJust(new StringBuilder("null"));
    }

    private static class JsonObjectBuilder {
        final StringBuilder text = new StringBuilder("{");
        boolean first = true;

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, boolean value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(value);
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull String value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(Utils.escapeStringLiteral(value));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull Number value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(value);
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull BinaryOperator value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(Utils.escapeStringLiteral(value.getName()));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull CompoundAssignmentOperator value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(Utils.escapeStringLiteral(value.getName()));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull UnaryOperator value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(Utils.escapeStringLiteral(value.getName()));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull UpdateOperator value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(Utils.escapeStringLiteral(value.getName()));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull VariableDeclarationKind value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(Utils.escapeStringLiteral(value.name));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull StringBuilder value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(value);
            return this;
        }

        @Nonnull
        JsonObjectBuilder addMaybeString(@Nonnull String property, @Nonnull Maybe<String> value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(value.map(Utils::escapeStringLiteral).orJust("null"));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull Maybe<StringBuilder> value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(o(value));
            return this;
        }

        @Nonnull
        JsonObjectBuilder add(@Nonnull String property, @Nonnull ImmutableList<StringBuilder> value) {
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(list(value));
            return this;
        }

        @Nonnull
        JsonObjectBuilder addListMaybe(@Nonnull String property, @Nonnull ImmutableList<Maybe<StringBuilder>> value) { // because type erasure
            optionalComma();
            this.text.append(Utils.escapeStringLiteral(property)).append(":").append(list(value.map(Serializer::o)));
            return this;
        }

        @Nonnull
        StringBuilder done() {
            this.text.append("}");
            return this.text;
        }

        private void optionalComma() {
            if (this.first) {
                this.first = false;
            } else {
                this.text.append(",");
            }
        }
    }

    @Nonnull
    @Override
    public StringBuilder reduceArrayAssignmentTarget(@Nonnull ArrayAssignmentTarget node, @Nonnull ImmutableList<Maybe<StringBuilder>> elements, @Nonnull Maybe<StringBuilder> rest) {
        return b("ArrayAssignmentTarget").addListMaybe("elements", elements).add("rest", rest).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceArrayBinding(@Nonnull ArrayBinding node, @Nonnull ImmutableList<Maybe<StringBuilder>> elements, @Nonnull Maybe<StringBuilder> rest) {
        return b("ArrayBinding").addListMaybe("elements", elements).add("rest", rest).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceArrayExpression(@Nonnull ArrayExpression node, @Nonnull ImmutableList<Maybe<StringBuilder>> elements) {
        return b("ArrayExpression").addListMaybe("elements", elements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceArrowExpression(@Nonnull ArrowExpression node, @Nonnull StringBuilder params, @Nonnull StringBuilder body) {
        return b("ArrowExpression").add("params", params).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceAssignmentExpression(@Nonnull AssignmentExpression node, @Nonnull StringBuilder binding, @Nonnull StringBuilder expression) {
        return b("AssignmentExpression").add("binding", binding).add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceAssignmentTargetIdentifier(@Nonnull AssignmentTargetIdentifier node) {
        return b("AssignmentTargetIdentifier").add("name", node.name).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceAssignmentTargetPropertyIdentifier(@Nonnull AssignmentTargetPropertyIdentifier node, @Nonnull StringBuilder binding, @Nonnull Maybe<StringBuilder> init) {
        return b("AssignmentTargetPropertyIdentifier").add("binding", binding).add("init", init).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceAssignmentTargetPropertyProperty(@Nonnull AssignmentTargetPropertyProperty node, @Nonnull StringBuilder name, @Nonnull StringBuilder binding) {
        return b("AssignmentTargetPropertyProperty").add("name", name).add("binding", binding).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceAssignmentTargetWithDefault(@Nonnull AssignmentTargetWithDefault node, @Nonnull StringBuilder binding, @Nonnull StringBuilder init) {
        return b("AssignmentTargetWithDefault").add("binding", binding).add("init", init).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceAwaitExpression(@Nonnull AwaitExpression node, @Nonnull StringBuilder expression) {
        return b("AwaitExpression").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBinaryExpression(@Nonnull BinaryExpression node, @Nonnull StringBuilder left, @Nonnull StringBuilder right) {
        return b("BinaryExpression").add("left", left).add("operator", node.operator).add("right", right).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBindingIdentifier(@Nonnull BindingIdentifier node) {
        return b("BindingIdentifier").add("name", node.name).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBindingPropertyIdentifier(@Nonnull BindingPropertyIdentifier node, @Nonnull StringBuilder binding, @Nonnull Maybe<StringBuilder> init) {
        return b("BindingPropertyIdentifier").add("binding", binding).add("init", init).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBindingPropertyProperty(@Nonnull BindingPropertyProperty node, @Nonnull StringBuilder name, @Nonnull StringBuilder binding) {
        return b("BindingPropertyProperty").add("name", name).add("binding", binding).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBindingWithDefault(@Nonnull BindingWithDefault node, @Nonnull StringBuilder binding, @Nonnull StringBuilder init) {
        return b("BindingWithDefault").add("binding", binding).add("init", init).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBlock(@Nonnull Block node, @Nonnull ImmutableList<StringBuilder> statements) {
        return b("Block").add("statements", statements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBlockStatement(@Nonnull BlockStatement node, @Nonnull StringBuilder block) {
        return b("BlockStatement").add("block", block).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceBreakStatement(@Nonnull BreakStatement node) {
        return b("BreakStatement").addMaybeString("label", node.label).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceCallExpression(@Nonnull CallExpression node, @Nonnull StringBuilder callee, @Nonnull ImmutableList<StringBuilder> arguments) {
        return b("CallExpression").add("callee", callee).add("arguments", arguments).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceCatchClause(@Nonnull CatchClause node, @Nonnull StringBuilder binding, @Nonnull StringBuilder body) {
        return b("CatchClause").add("binding", binding).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceClassDeclaration(@Nonnull ClassDeclaration node, @Nonnull StringBuilder name, @Nonnull Maybe<StringBuilder> _super, @Nonnull ImmutableList<StringBuilder> elements) {
        return b("ClassDeclaration").add("name", name).add("super", _super).add("elements", elements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceClassElement(@Nonnull ClassElement node, @Nonnull StringBuilder method) {
        return b("ClassElement").add("isStatic", node.isStatic).add("method", method).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceClassExpression(@Nonnull ClassExpression node, @Nonnull Maybe<StringBuilder> name, @Nonnull Maybe<StringBuilder> _super, @Nonnull ImmutableList<StringBuilder> elements) {
        return b("ClassExpression").add("name", name).add("super", _super).add("elements", elements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceCompoundAssignmentExpression(@Nonnull CompoundAssignmentExpression node, @Nonnull StringBuilder binding, @Nonnull StringBuilder expression) {
        return b("CompoundAssignmentExpression").add("binding", binding).add("operator", node.operator).add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceComputedMemberAssignmentTarget(@Nonnull ComputedMemberAssignmentTarget node, @Nonnull StringBuilder object, @Nonnull StringBuilder expression) {
        return b("ComputedMemberAssignmentTarget").add("object", object).add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceComputedMemberExpression(@Nonnull ComputedMemberExpression node, @Nonnull StringBuilder object, @Nonnull StringBuilder expression) {
        return b("ComputedMemberExpression").add("object", object).add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceComputedPropertyName(@Nonnull ComputedPropertyName node, @Nonnull StringBuilder expression) {
        return b("ComputedPropertyName").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceConditionalExpression(@Nonnull ConditionalExpression node, @Nonnull StringBuilder test, @Nonnull StringBuilder consequent, @Nonnull StringBuilder alternate) {
        return b("ConditionalExpression").add("test", test).add("consequent", consequent).add("alternate", alternate).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceContinueStatement(@Nonnull ContinueStatement node) {
        return b("ContinueStatement").addMaybeString("label", node.label).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceDataProperty(@Nonnull DataProperty node, @Nonnull StringBuilder name, @Nonnull StringBuilder expression) {
        return b("DataProperty").add("name", name).add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceDebuggerStatement(@Nonnull DebuggerStatement node) {
        return b("DebuggerStatement").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceDirective(@Nonnull Directive node) {
        return b("Directive").add("rawValue", node.rawValue).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceDoWhileStatement(@Nonnull DoWhileStatement node, @Nonnull StringBuilder body, @Nonnull StringBuilder test) {
        return b("DoWhileStatement").add("body", body).add("test", test).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceEmptyStatement(@Nonnull EmptyStatement node) {
        return b("EmptyStatement").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExport(@Nonnull Export node, @Nonnull StringBuilder declaration) {
        return b("Export").add("declaration", declaration).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExportAllFrom(@Nonnull ExportAllFrom node) {
        return b("ExportAllFrom").add("moduleSpecifier", node.moduleSpecifier).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExportDefault(@Nonnull ExportDefault node, @Nonnull StringBuilder body) {
        return b("ExportDefault").add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExportFrom(@Nonnull ExportFrom node, @Nonnull ImmutableList<StringBuilder> namedExports) {
        return b("ExportFrom").add("namedExports", namedExports).add("moduleSpecifier", node.moduleSpecifier).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExportFromSpecifier(@Nonnull ExportFromSpecifier node) {
        return b("ExportFromSpecifier").add("name", node.name).addMaybeString("exportedName", node.exportedName).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExportLocalSpecifier(@Nonnull ExportLocalSpecifier node, @Nonnull StringBuilder name) {
        return b("ExportLocalSpecifier").add("name", name).addMaybeString("exportedName", node.exportedName).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExportLocals(@Nonnull ExportLocals node, @Nonnull ImmutableList<StringBuilder> namedExports) {
        return b("ExportLocals").add("namedExports", namedExports).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceExpressionStatement(@Nonnull ExpressionStatement node, @Nonnull StringBuilder expression) {
        return b("ExpressionStatement").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceForInStatement(@Nonnull ForInStatement node, @Nonnull StringBuilder left, @Nonnull StringBuilder right, @Nonnull StringBuilder body) {
        return b("ForInStatement").add("left", left).add("right", right).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceForOfStatement(@Nonnull ForOfStatement node, @Nonnull StringBuilder left, @Nonnull StringBuilder right, @Nonnull StringBuilder body) {
        return b("ForOfStatement").add("left", left).add("right", right).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceForStatement(@Nonnull ForStatement node, @Nonnull Maybe<StringBuilder> init, @Nonnull Maybe<StringBuilder> test, @Nonnull Maybe<StringBuilder> update, @Nonnull StringBuilder body) {
        return b("ForStatement").add("init", init).add("test", test).add("update", update).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceFormalParameters(@Nonnull FormalParameters node, @Nonnull ImmutableList<StringBuilder> items, @Nonnull Maybe<StringBuilder> rest) {
        return b("FormalParameters").add("items", items).add("rest", rest).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceFunctionBody(@Nonnull FunctionBody node, @Nonnull ImmutableList<StringBuilder> directives, @Nonnull ImmutableList<StringBuilder> statements) {
        return b("FunctionBody").add("directives", directives).add("statements", statements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceFunctionDeclaration(@Nonnull FunctionDeclaration node, @Nonnull StringBuilder name, @Nonnull StringBuilder params, @Nonnull StringBuilder body) {
        return b("FunctionDeclaration").add("isAsync", node.isAsync).add("isGenerator", node.isGenerator).add("name", name).add("params", params).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceFunctionExpression(@Nonnull FunctionExpression node, @Nonnull Maybe<StringBuilder> name, @Nonnull StringBuilder params, @Nonnull StringBuilder body) {
        return b("FunctionExpression").add("isAsync", node.isAsync).add("isGenerator", node.isGenerator).add("name", name).add("params", params).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceGetter(@Nonnull Getter node, @Nonnull StringBuilder name, @Nonnull StringBuilder body) {
        return b("Getter").add("name", name).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceIdentifierExpression(@Nonnull IdentifierExpression node) {
        return b("IdentifierExpression").add("name", node.name).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceIfStatement(@Nonnull IfStatement node, @Nonnull StringBuilder test, @Nonnull StringBuilder consequent, @Nonnull Maybe<StringBuilder> alternate) {
        return b("IfStatement").add("test", test).add("consequent", consequent).add("alternate", alternate).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceImport(@Nonnull Import node, @Nonnull Maybe<StringBuilder> defaultBinding, @Nonnull ImmutableList<StringBuilder> namedImports) {
        return b("Import").add("defaultBinding", defaultBinding).add("namedImports", namedImports).add("moduleSpecifier", node.moduleSpecifier).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceImportNamespace(@Nonnull ImportNamespace node, @Nonnull Maybe<StringBuilder> defaultBinding, @Nonnull StringBuilder namespaceBinding) {
        return b("ImportNamespace").add("defaultBinding", defaultBinding).add("namespaceBinding", namespaceBinding).add("moduleSpecifier", node.moduleSpecifier).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceImportSpecifier(@Nonnull ImportSpecifier node, @Nonnull StringBuilder binding) {
        return b("ImportSpecifier").addMaybeString("name", node.name).add("binding", binding).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLabeledStatement(@Nonnull LabeledStatement node, @Nonnull StringBuilder body) {
        return b("LabeledStatement").add("label", node.label).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLiteralBooleanExpression(@Nonnull LiteralBooleanExpression node) {
        return b("LiteralBooleanExpression").add("value", node.value).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLiteralInfinityExpression(@Nonnull LiteralInfinityExpression node) {
        return b("LiteralInfinityExpression").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLiteralNullExpression(@Nonnull LiteralNullExpression node) {
        return b("LiteralNullExpression").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLiteralNumericExpression(@Nonnull LiteralNumericExpression node) {
        return b("LiteralNumericExpression").add("value", node.value).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLiteralRegExpExpression(@Nonnull LiteralRegExpExpression node) {
        return b("LiteralRegExpExpression").add("pattern", node.pattern).add("global", node.global).add("ignoreCase", node.ignoreCase).add("multiLine", node.multiLine).add("sticky", node.sticky).add("unicode", node.unicode).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceLiteralStringExpression(@Nonnull LiteralStringExpression node) {
        return b("LiteralStringExpression").add("value", node.value).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceMethod(@Nonnull Method node, @Nonnull StringBuilder name, @Nonnull StringBuilder params, @Nonnull StringBuilder body) {
        return b("Method").add("isAsync", node.isAsync).add("isGenerator", node.isGenerator).add("name", name).add("params", params).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceModule(@Nonnull Module node, @Nonnull ImmutableList<StringBuilder> directives, @Nonnull ImmutableList<StringBuilder> items) {
        return b("Module").add("directives", directives).add("items", items).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceNewExpression(@Nonnull NewExpression node, @Nonnull StringBuilder callee, @Nonnull ImmutableList<StringBuilder> arguments) {
        return b("NewExpression").add("callee", callee).add("arguments", arguments).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceNewTargetExpression(@Nonnull NewTargetExpression node) {
        return b("NewTargetExpression").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceObjectAssignmentTarget(@Nonnull ObjectAssignmentTarget node, @Nonnull ImmutableList<StringBuilder> properties) {
        return b("ObjectAssignmentTarget").add("properties", properties).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceObjectBinding(@Nonnull ObjectBinding node, @Nonnull ImmutableList<StringBuilder> properties) {
        return b("ObjectBinding").add("properties", properties).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceObjectExpression(@Nonnull ObjectExpression node, @Nonnull ImmutableList<StringBuilder> properties) {
        return b("ObjectExpression").add("properties", properties).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceReturnStatement(@Nonnull ReturnStatement node, @Nonnull Maybe<StringBuilder> expression) {
        return b("ReturnStatement").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceScript(@Nonnull Script node, @Nonnull ImmutableList<StringBuilder> directives, @Nonnull ImmutableList<StringBuilder> statements) {
        return b("Script").add("directives", directives).add("statements", statements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSetter(@Nonnull Setter node, @Nonnull StringBuilder name, @Nonnull StringBuilder param, @Nonnull StringBuilder body) {
        return b("Setter").add("name", name).add("param", param).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceShorthandProperty(@Nonnull ShorthandProperty node, @Nonnull StringBuilder name) {
        return b("ShorthandProperty").add("name", name).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSpreadElement(@Nonnull SpreadElement node, @Nonnull StringBuilder expression) {
        return b("SpreadElement").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceStaticMemberAssignmentTarget(@Nonnull StaticMemberAssignmentTarget node, @Nonnull StringBuilder object) {
        return b("StaticMemberAssignmentTarget").add("object", object).add("property", node.property).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceStaticMemberExpression(@Nonnull StaticMemberExpression node, @Nonnull StringBuilder object) {
        return b("StaticMemberExpression").add("object", object).add("property", node.property).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceStaticPropertyName(@Nonnull StaticPropertyName node) {
        return b("StaticPropertyName").add("value", node.value).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSuper(@Nonnull Super node) {
        return b("Super").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSwitchCase(@Nonnull SwitchCase node, @Nonnull StringBuilder test, @Nonnull ImmutableList<StringBuilder> consequent) {
        return b("SwitchCase").add("test", test).add("consequent", consequent).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSwitchDefault(@Nonnull SwitchDefault node, @Nonnull ImmutableList<StringBuilder> consequent) {
        return b("SwitchDefault").add("consequent", consequent).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSwitchStatement(@Nonnull SwitchStatement node, @Nonnull StringBuilder discriminant, @Nonnull ImmutableList<StringBuilder> cases) {
        return b("SwitchStatement").add("discriminant", discriminant).add("cases", cases).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceSwitchStatementWithDefault(@Nonnull SwitchStatementWithDefault node, @Nonnull StringBuilder discriminant, @Nonnull ImmutableList<StringBuilder> preDefaultCases, @Nonnull StringBuilder defaultCase, @Nonnull ImmutableList<StringBuilder> postDefaultCases) {
        return b("SwitchStatementWithDefault").add("discriminant", discriminant).add("preDefaultCases", preDefaultCases).add("defaultCase", defaultCase).add("postDefaultCases", postDefaultCases).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceTemplateElement(@Nonnull TemplateElement node) {
        return b("TemplateElement").add("rawValue", node.rawValue).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceTemplateExpression(@Nonnull TemplateExpression node, @Nonnull Maybe<StringBuilder> tag, @Nonnull ImmutableList<StringBuilder> elements) {
        return b("TemplateExpression").add("tag", tag).add("elements", elements).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceThisExpression(@Nonnull ThisExpression node) {
        return b("ThisExpression").done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceThrowStatement(@Nonnull ThrowStatement node, @Nonnull StringBuilder expression) {
        return b("ThrowStatement").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceTryCatchStatement(@Nonnull TryCatchStatement node, @Nonnull StringBuilder body, @Nonnull StringBuilder catchClause) {
        return b("TryCatchStatement").add("body", body).add("catchClause", catchClause).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceTryFinallyStatement(@Nonnull TryFinallyStatement node, @Nonnull StringBuilder body, @Nonnull Maybe<StringBuilder> catchClause, @Nonnull StringBuilder finalizer) {
        return b("TryFinallyStatement").add("body", body).add("catchClause", catchClause).add("finalizer", finalizer).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceUnaryExpression(@Nonnull UnaryExpression node, @Nonnull StringBuilder operand) {
        return b("UnaryExpression").add("operator", node.operator).add("operand", operand).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceUpdateExpression(@Nonnull UpdateExpression node, @Nonnull StringBuilder operand) {
        return b("UpdateExpression").add("isPrefix", node.isPrefix).add("operator", node.operator).add("operand", operand).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceVariableDeclaration(@Nonnull VariableDeclaration node, @Nonnull ImmutableList<StringBuilder> declarators) {
        return b("VariableDeclaration").add("kind", node.kind).add("declarators", declarators).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceVariableDeclarationStatement(@Nonnull VariableDeclarationStatement node, @Nonnull StringBuilder declaration) {
        return b("VariableDeclarationStatement").add("declaration", declaration).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceVariableDeclarator(@Nonnull VariableDeclarator node, @Nonnull StringBuilder binding, @Nonnull Maybe<StringBuilder> init) {
        return b("VariableDeclarator").add("binding", binding).add("init", init).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceWhileStatement(@Nonnull WhileStatement node, @Nonnull StringBuilder test, @Nonnull StringBuilder body) {
        return b("WhileStatement").add("test", test).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceWithStatement(@Nonnull WithStatement node, @Nonnull StringBuilder object, @Nonnull StringBuilder body) {
        return b("WithStatement").add("object", object).add("body", body).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceYieldExpression(@Nonnull YieldExpression node, @Nonnull Maybe<StringBuilder> expression) {
        return b("YieldExpression").add("expression", expression).done();
    }

    @Nonnull
    @Override
    public StringBuilder reduceYieldGeneratorExpression(@Nonnull YieldGeneratorExpression node, @Nonnull StringBuilder expression) {
        return b("YieldGeneratorExpression").add("expression", expression).done();
    }
}
