package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(String nameRole) {
        try (Session session = factory.openSession()) {
            Query<Role> roleQuery = session
                    .createQuery("FROM Role r where r.name=:roleName", Role.class);
            Role.RoleName name = Role.RoleName.valueOf(nameRole);
            roleQuery.setParameter("roleName", name);
            return roleQuery.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Cant find role " + nameRole, e);
        }
    }
}
