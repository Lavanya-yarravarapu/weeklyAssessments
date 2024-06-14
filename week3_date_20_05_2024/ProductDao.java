import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Product getProductById(int productId) {
        String sql = "SELECT * FROM products WHERE id = :productId";
        Map<String, Object> params = new HashMap<>();
        params.put("productId", productId);
        return namedParameterJdbcTemplate.queryForObject(sql, params, new ProductMapper());
    }

    public void updateProduct(Product product) {
        String sql = "UPDATE products SET name = :name, price = :price WHERE id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("name", product.getName());
        params.put("price", product.getPrice());
        params.put("id", product.getId());
        namedParameterJdbcTemplate.update(sql, params);
    }

    // Mapper class to map rows to Product objects
    private static class ProductMapper implements RowMapper<Product> {
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setPrice(rs.getDouble("price"));
            return product;
        }
    }
}
