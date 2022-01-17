import conexion.Conexion;
import dao.ProductoDAO;
import dto.DetalleCompraDTO;
import dto.ProductoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductoTest extends BaseTest{
    @Test
    public void testInsertar() throws SQLException{
        //preparar los mocks
        ProductoDTO nuevo=mock(ProductoDTO.class);
        Connection conectar=mock(Connection.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(nuevo.getIdMedicamento()).thenReturn(100);
        when(nuevo.getIdTipoProducto()).thenReturn(2);
        when(nuevo.getStock()).thenReturn(1);
        when(nuevo.getPrecioVenta()).thenReturn(1.5f);
        when(preparedStatement.executeUpdate()).thenReturn(1);
        //Probar
        boolean producto=ProductoDAO.insertar(nuevo);
        assertTrue(producto);
    }
    
    @Test
    public void testModificar() throws SQLException{
        //preparar los mocks
        ProductoDTO modificado=mock(ProductoDTO.class);
        Connection conectar=mock(Connection.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(modificado.getIdMedicamento()).thenReturn(1);
        when(modificado.getIdTipoProducto()).thenReturn(1);
        when(modificado.getStock()).thenReturn(1);
        when(modificado.getPrecioVenta()).thenReturn(1.5f);
        when(preparedStatement.executeUpdate()).thenReturn(1);
        //Probar
        boolean producto=ProductoDAO.modificar(modificado);
        assertTrue(producto);
    }
    
    @Test
    public void testAumentarStock() throws SQLException{
        //preparar los mocks
        Connection conectar=mock(Connection.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(preparedStatement.executeUpdate()).thenReturn(1);
        //Probar
        boolean producto=ProductoDAO.aumentarStock(1, 2, 3);
        assertTrue(producto);
    }
}
