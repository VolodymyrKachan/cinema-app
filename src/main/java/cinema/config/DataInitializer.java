package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role roleAdmin = new Role();
        roleAdmin.setName(Role.RoleName.ADMIN);
        roleService.add(roleAdmin);
        Role roleUser = new Role();
        roleUser.setName(Role.RoleName.USER);
        roleService.add(roleUser);
        User admin = new User();
        admin.setEmail("bob@gmail.com");
        admin.setPassword("123456");
        admin.setRoles(Set.of(roleAdmin));
        userService.add(admin);
        User user = new User();
        user.setEmail("alice@gmail.com");
        user.setPassword("123456");
        user.setRoles(Set.of(roleUser));
        userService.add(user);
    }
}
