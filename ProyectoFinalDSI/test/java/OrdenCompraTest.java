import conexion.Conexion;
import dao.OrdenCompraDAO;
import dto.OrdenCompraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import static junit.framework.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrdenCompraTest {
    @Test
    public void testLastId() throws SQLException{
        //preparar los mocks
        Connection conectar=mock(Connection.class);
        ResultSet resultSet=mock(ResultSet.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        Date date=mock(Date.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        //Probar
        int oc=OrdenCompraDAO.lastId();
        Assert.assertEquals(oc,1);
    }
}
