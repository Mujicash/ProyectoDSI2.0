import conexion.Conexion;
import dao.MedicamentoDAO;
import dao.OrdenCompraDAO;
import dto.MedicamentoDTO;
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

public class MedicamentoTest {
    @Test
    public void testInsertar() throws SQLException{
        //preparar los mocks
        MedicamentoDTO nuevo=mock(MedicamentoDTO.class);
        Connection conectar=mock(Connection.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(nuevo.getIdFabricante()).thenReturn(1);
        when(nuevo.getNombre()).thenReturn("Juan");
        when(nuevo.getMedida()).thenReturn("200 mg");
        when(nuevo.getNum_blister()).thenReturn(1);
        when(preparedStatement.executeUpdate()).thenReturn(1);
        //Probar
        boolean medicamento=MedicamentoDAO.insertar(nuevo);
        assertTrue(medicamento);
    }
    
    @Test
    public void testModificar() throws SQLException{
        //preparar los mocks
        MedicamentoDTO modificado=mock(MedicamentoDTO.class);
        Connection conectar=mock(Connection.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(modificado.getIdFabricante()).thenReturn(1);
        when(modificado.getNombre()).thenReturn("Juan");
        when(modificado.getMedida()).thenReturn("200 mg");
        when(modificado.getNum_blister()).thenReturn(1);
        when(modificado.getIdMedicamento()).thenReturn(1);
        when(preparedStatement.executeUpdate()).thenReturn(1);
        //Probar
        boolean medicamento=MedicamentoDAO.insertar(modificado);
        assertTrue(medicamento);
    }
    
    @Test
    public void testUltimoID() throws SQLException{
        //preparar los mocks
        Connection conectar=mock(Connection.class);
        ResultSet resultSet=mock(ResultSet.class);
        PreparedStatement preparedStatement=mock(PreparedStatement.class);
        Conexion conexion=mock(Conexion.class);
        //Expectativas
        when(conectar.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        //Probar
        int medicamento=MedicamentoDAO.ultimoID();
        Assert.assertEquals(medicamento,1);
    }
}
