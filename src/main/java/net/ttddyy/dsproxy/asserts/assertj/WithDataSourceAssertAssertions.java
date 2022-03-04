package net.ttddyy.dsproxy.asserts.assertj;

import net.ttddyy.dsproxy.asserts.CallableBatchExecution;
import net.ttddyy.dsproxy.asserts.CallableExecution;
import net.ttddyy.dsproxy.asserts.PreparedBatchExecution;
import net.ttddyy.dsproxy.asserts.PreparedExecution;
import net.ttddyy.dsproxy.asserts.ProxyTestDataSource;
import net.ttddyy.dsproxy.asserts.QueryExecution;
import net.ttddyy.dsproxy.asserts.StatementBatchExecution;
import net.ttddyy.dsproxy.asserts.StatementExecution;
import net.ttddyy.dsproxy.asserts.assertj.data.ExecutionParameter;
import net.ttddyy.dsproxy.asserts.assertj.data.ExecutionParameters;

import java.sql.SQLType;

public interface WithDataSourceAssertAssertions {

    default ProxyTestDataSourceAssert assertThat(ProxyTestDataSource actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default QueryExecutionAssert assertThat(QueryExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default StatementExecutionAssert assertThat(StatementExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default StatementBatchExecutionAssert assertThat(StatementBatchExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default PreparedExecutionAssert assertThat(PreparedExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default PreparedBatchExecutionAssert assertThat(PreparedBatchExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default CallableExecutionAssert assertThat(CallableExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default CallableBatchExecutionAssert assertThat(CallableBatchExecution actual) {
        return DataSourceAssertAssertions.assertThat(actual);
    }

    default ExecutionParameter param(int paramIndex, Object value) {
        return DataSourceAssertAssertions.param(paramIndex, value);
    }

    default ExecutionParameter param(String paramName, Object value) {
        return DataSourceAssertAssertions.param(paramName, value);
    }

    default ExecutionParameter nullParam(int index, int sqlType) {
        return DataSourceAssertAssertions.nullParam(index, sqlType);
    }

    default ExecutionParameter nullParam(int index) {
        return DataSourceAssertAssertions.nullParam(index);
    }

    default ExecutionParameter nullParam(String name, int sqlType) {
        return DataSourceAssertAssertions.nullParam(name, sqlType);
    }

    default ExecutionParameter nullParam(String name) {
        return DataSourceAssertAssertions.nullParam(name);
    }

    default ExecutionParameter outParam(int paramIndex, int sqlType) {
        return DataSourceAssertAssertions.outParam(paramIndex, sqlType);
    }

    default ExecutionParameter outParam(int paramIndex, SQLType sqlType) {
        return DataSourceAssertAssertions.outParam(paramIndex, sqlType);
    }

    default ExecutionParameter outParam(String paramName, int sqlType) {
        return DataSourceAssertAssertions.outParam(paramName, sqlType);
    }

    default ExecutionParameter outParam(String paramName, SQLType sqlType) {
        return DataSourceAssertAssertions.outParam(paramName, sqlType);
    }

    default ExecutionParameters containsParams(ExecutionParameter... params) {
        return DataSourceAssertAssertions.containsParams(params);
    }

    default ExecutionParameters containsParamsExactly(ExecutionParameter... params) {
        return DataSourceAssertAssertions.containsParamsExactly(params);
    }

    default ExecutionParameters containsParamKeys(Object... paramKeys) {
        return DataSourceAssertAssertions.containsParamKeys(paramKeys);
    }

    default ExecutionParameters containsParamIndexes(int... paramIndexes) {
        return DataSourceAssertAssertions.containsParamIndexes(paramIndexes);
    }

    default ExecutionParameters containsParamNames(String... paramNames) {
        return DataSourceAssertAssertions.containsParamNames(paramNames);
    }

}
