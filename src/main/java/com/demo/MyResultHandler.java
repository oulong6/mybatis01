package com.demo;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MyResultHandler implements TypeHandler<List<String>> {
    public void setParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,strings.get(i));
    }

    public List<String> getResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s);
        String[] split = string.split(",");
        return new ArrayList<String>(Arrays.asList(split));
    }

    public List<String> getResult(ResultSet resultSet, int i) throws SQLException {
        String string = resultSet.getString(i);
        String[] split = string.split(",");
        return new ArrayList<String>(Arrays.asList(split));
    }

    public List<String> getResult(CallableStatement callableStatement, int i) throws SQLException {
        String string = callableStatement.getString(i);
        String[] split = string.split(",");
        return new ArrayList<String>(Arrays.asList(split));
    }
}
