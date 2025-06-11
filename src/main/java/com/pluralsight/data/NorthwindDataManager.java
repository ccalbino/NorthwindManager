package com.pluralsight.data;

import com.pluralsight.models.Category;
import com.pluralsight.models.Product;
import com.pluralsight.models.Supplier;
import org.apache.commons.dbcp2.BasicDataSource;

import java.net.NoRouteToHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NorthwindDataManager {
    private BasicDataSource dataSource;

    public NorthwindDataManager(BasicDataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Category> getCategories(){
        ArrayList<Category> result = new ArrayList<Category>();

        String query = """
                SELECT
                CategoryID,
                CategoryName
                FROM
                categories""";

        try (
                Connection c = dataSource.getConnection();
                PreparedStatement s = c.prepareStatement(query);
                ResultSet queryResults = s.executeQuery();
        ){
            while(queryResults.next()){
                int categoryId = queryResults.getInt(1);
                String categoryName = queryResults.getString(2);
                Category category = new Category(categoryId, categoryName);
                result.add(category);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }



        return result;
    }

    public Category getCategoryByName(String categoryName){
        return null;
    }

    public List<Product> getProducts(){
        return  null;
    }

    public List<Product> getProductsByCategory(Category category){
        return null;
    }

    public List<Product> getProductsByPrice(double minPrice, double maxPrice){
        return null;
    }

    public List<Product> getProductsBySupplier(Supplier supplier){
        return null;
    }

    public List<Supplier> getSuppliers(){
        return null;
    }






}
