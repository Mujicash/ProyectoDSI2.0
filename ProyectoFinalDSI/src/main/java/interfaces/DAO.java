
package interfaces;

/**
 *
 * @author André Mujica
 * @param <T>
 */
public interface DAO<T> {
        
    public boolean create(T t);
    
    public T read(int id);
    
    public boolean update(int id);
    
    public boolean delete(int id);
    
}
