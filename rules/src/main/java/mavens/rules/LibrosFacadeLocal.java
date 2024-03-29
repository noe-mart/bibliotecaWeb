/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.Libros;

/**
 *
 * @author Ferna
 */
@Local
public interface LibrosFacadeLocal {

    void create(Libros libros);

    void edit(Libros libros);

    void remove(Libros libros);

    Libros find(Object id);

    List<Libros> findAll();

    List<Libros> findRange(int[] range);

    int count();
    
}
